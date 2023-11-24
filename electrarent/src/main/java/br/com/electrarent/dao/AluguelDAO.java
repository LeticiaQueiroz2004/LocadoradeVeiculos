package br.com.electrarent.dao;

import br.com.electrarent.model.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServlet;


public class AluguelDAO extends HttpServlet {
    public void InsertAluguel(Cliente cliente){
        String SQL = "INSERT INTO CLIENTE (NM_CLIENTE, EMAIL, NACIONALIDADE, DT_NASCIMENTO, RG, CPF, TELEFONE, ENDERECO, CEP, BAIRRO, CIDADE, COMPLEMENTO, FK_USUARIO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


        try {
            System.out.println("nem chegou aq");
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cliente.getNmCliente());
            preparedStatement.setString(2, cliente.getEmail());
            preparedStatement.setString(3, cliente.getNacionalidade());
            preparedStatement.setDate(4, cliente.getDtNascimento());
            preparedStatement.setString(5, cliente.getRg());
            preparedStatement.setString(6, cliente.getCpf());
            preparedStatement.setString(7, cliente.getTelefone());
            preparedStatement.setString(8, cliente.getEndereco());
            preparedStatement.setString(9, cliente.getCep());
            preparedStatement.setString(10, cliente.getBairro());
            preparedStatement.setString(11, cliente.getCidade());
            preparedStatement.setString(12, cliente.getComplemento());
            preparedStatement.setInt(13, cliente.getFkUsuario());

            System.out.println("deu ruim");
            // preparedStatement.setDate(3, new java.sql.Date(cliente.getDtNascimento().getTime()));
            preparedStatement.execute();

            preparedStatement.close();
        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }
    }

}
