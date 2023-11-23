package br.com.electrarent.servlet;

import br.com.electrarent.dao.CarDAO;
import br.com.electrarent.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/admin/find-all-cars"})
public class ListCarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Car> cars = new CarDAO().findAllCars();

        req.setAttribute("cars", cars);

        if(req.getSession().getAttribute("loggedUser") != null) {
            req.getRequestDispatcher("/admin/dashboard.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }

    }

}