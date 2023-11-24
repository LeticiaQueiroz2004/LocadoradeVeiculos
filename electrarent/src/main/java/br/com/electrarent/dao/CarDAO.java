package br.com.electrarent.dao;

import br.com.electrarent.config.ConnectionPoolConfig;
import br.com.electrarent.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDAO {
    public void createCar(Car car) {

        String SQL = "INSERT INTO CAR (NAME, IMAGE, PLACA, COR, VLDIARIA, KMRODADOS, QTDPORTAS, QTDACENTOS, QTDDISPONIVEL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, car.getName());
            preparedStatement.setString(2, car.getImage());
            preparedStatement.setString(3,car.getPlaca());
            preparedStatement.setString(4, car.getCor());
            preparedStatement.setDouble(5, car.getVlDiaria());
            preparedStatement.setDouble(6, car.getKmRodados());
            preparedStatement.setInt(7, car.getQtdPortas());
            preparedStatement.setInt(8, car.getQtdAcentos());
            preparedStatement.execute();

            System.out.println("success in insert car");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }

    }

    public List<Car> findAllCars() {

        String SQL = "SELECT * FROM CAR";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Car> cars = new ArrayList<>();

            while (resultSet.next()) {

                String carId = resultSet.getString("id");
                String carName = resultSet.getString("name");
                String image = resultSet.getString("image");
                String placa = resultSet.getString("placa");
                String cor = resultSet.getString("cor");
                double vlDiaria = resultSet.getDouble("vlDiaria");
                double kmRodados = resultSet.getDouble("kmRodados");
                int qtdPortas = resultSet.getInt("qtdPortas");
                int qtdAcentos = resultSet.getInt("qtdAcentos");

                Car car = new Car(carId, carName, image, placa, cor, vlDiaria, kmRodados, qtdPortas, qtdAcentos);

                cars.add(car);

            }

            System.out.println("success in select * car");

            connection.close();

            return cars;

        } catch (Exception e) {

            System.out.println("fail in database connection é aq");
            System.out.println("Error: " + e.getMessage());

            return Collections.emptyList();

        }
    }

    public void deleteCarById(String carId) {

        String SQL = "DELETE CAR WHERE ID = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, carId);
            preparedStatement.execute();

            System.out.println("success on delete car with id: " + carId);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }
    }

    public void updateCar(Car car) {

        String SQL = "UPDATE CAR SET NAME = ?,  IMAGE = ?, PLACA = ?, COR = ?, VLDIARIA = ?, KMRODADOS = ?, QTDPORTAS = ?, QTDACENTOS = ? WHERE ID = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, car.getName());
            preparedStatement.setString(2, car.getImage());
            preparedStatement.setString(3,car.getPlaca());
            preparedStatement.setString(4, car.getCor());
            preparedStatement.setDouble(5, car.getVlDiaria());
            preparedStatement.setDouble(6, car.getKmRodados());
            preparedStatement.setInt(7, car.getQtdPortas());
            preparedStatement.setInt(8, car.getQtdAcentos());
            preparedStatement.setString(9, car.getId());
            preparedStatement.execute();

            System.out.println("success in update car");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }
    }
}
