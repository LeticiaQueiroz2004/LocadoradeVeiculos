package br.com.electrarent.servlet;

import br.com.electrarent.dao.CarDAO;
import br.com.electrarent.model.Car;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.fileupload.servlet.ServletFileUpload.isMultipartContent;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, String> parameters = uploadImage(request);

        String carId = parameters.get("id");
        String carName = parameters.get("car-name");
        String carImage = parameters.get("image");
        String carPlaca = parameters.get("placa");
        String carCor = parameters.get("cor");
        Double carvlDiaria = Double.valueOf(parameters.get("vlDiaria"));
        Double carkmRodados = Double.valueOf(parameters.get("kmRodados"));
        int carqtdPortas = Integer.parseInt(parameters.get("qtdPortas"));
        int carqtdAcentos = Integer.parseInt(parameters.get("qtdAcentos"));

        Car car = new Car(carId, carName, carImage, carPlaca, carCor, carvlDiaria, carkmRodados, carqtdPortas, carqtdAcentos);
        CarDAO carDAO = new CarDAO();

        if(carId.isEmpty()) {
            carDAO.createCar(car);
        } else {
            carDAO.updateCar(car);
        }
        response.sendRedirect("/admin/find-all-cars");
    }

    private Map<String, String> uploadImage(HttpServletRequest httpServletRequest) {

        Map<String, String> requestParameters = new HashMap<>();

        if (isMultipartContent(httpServletRequest)) {
            try {

                DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();

                List<FileItem> fileItems = new ServletFileUpload(diskFileItemFactory).parseRequest(httpServletRequest);

                for (FileItem fileItem : fileItems) {
                    checkFieldType(fileItem, requestParameters);
                }

            } catch (Exception ex) {
                requestParameters.put("image", "img/default-car.jpg");
            }
        }
        return requestParameters;
    }

    private void checkFieldType(FileItem item, Map requestParameters) throws Exception {

        if (item.isFormField()) {
            requestParameters.put(item.getFieldName(), item.getString());
        } else {
            String fileName = processUploadedFile(item);
            requestParameters.put("image", "img/".concat(fileName));
        }

    }

    private String processUploadedFile(FileItem fileItem) throws Exception {
        Long currentTime = new Date().getTime();
        String fileName = currentTime.toString().concat("-").concat(fileItem.getName().replace(" ", ""));
        String filePath = this.getServletContext().getRealPath("img").concat(File.separator).concat(fileName);
        fileItem.write(new File(filePath));
        return fileName;
    }

}