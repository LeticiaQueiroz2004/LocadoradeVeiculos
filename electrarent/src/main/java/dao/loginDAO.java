package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDAO {

    public static boolean validarLogin(String email, String senha) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            String sql = "SELECT * FROM usuarios WHERE email = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, senha);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                connection.close();
                return true;
            } else {
                connection.close();
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false; 
        }
    }

    public static void main(String[] args) {
        String email = "exemplo@email.com"; 
        String senha = "senha123";

        if (validarLogin(email, senha)) {
            
        } else {
            System.out.println("Login inválido.");
        }
    }
}
