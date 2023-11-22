package dao;

import model.Usuario;

import java.sql.*;

public class cadastroDAO {
    public void SalvarCadastro(Usuario obj) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            String sql = "INSERT INTO usuario" +
                    "(sobrenome, senha, nome, email, telefone) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, obj.getSobrenome());
            statement.setString(2, obj.getSenha());
            statement.setString(3, obj.getNome());
            statement.setString(4, obj.getEmail());
            statement.setString(5, obj.getTelefone());
            statement.execute();


            System.out.println("success in insert usuario");
            connection.close();

        } catch (Exception e) {
            System.out.println("fail in database connection");
        }
    }
}

