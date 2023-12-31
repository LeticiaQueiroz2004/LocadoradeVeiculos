package br.com.electrarent.dao;

import br.com.electrarent.model.UserADM;

import java.sql.*;

public class UserAdmDAO {

    public boolean VerifyCredentialsAdm(UserADM user){
        String SQL = "SELECT * FROM USUARIOADM WHERE EMAIL = ?";

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
}
