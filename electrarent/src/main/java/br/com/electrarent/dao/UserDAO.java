package br.com.electrarent.dao;

import br.com.electrarent.model.User;

import java.sql.*;

public class UserDAO {
    public boolean VerifyCredentials(User user){
        String SQL = "SELECT * FROM USUARIO WHERE EMAIL = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, user.getEmail());
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("success in select username");

            while (resultSet.next()){
                String senha = resultSet.getString("senha");

                if(senha.equals(user.getSenha())) {
                    return true;
                }
            }

            connection.close();

            return false;

        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public void Cadastro(User user){

        String SQL = "INSERT INTO USUARIO( EMAIL, SENHA, NOME, SOBRENOME, TELEFONE) VALUES(?,?,?,?,?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getSenha());
            preparedStatement.setString(3, user.getPrimeiroNome());
            preparedStatement.setString(4, user.getSobrenome());
            preparedStatement.setString(5, user.getTelefone());
            preparedStatement.execute();

            System.out.println("success a insert a user");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }

    }

}
