package br.com.electrarent.dao;

import br.com.electrarent.model.Aluguel;
import br.com.electrarent.model.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServlet;


public class AluguelDAO extends HttpServlet {
    public void InsertAluguel(Cliente cliente, Aluguel aluguel){
        String insertCliente = "INSERT INTO CLIENTE (NM_CLIENTE, EMAIL, NACIONALIDADE, DT_NASCIMENTO, RG, CPF, TELEFONE, ENDERECO, CEP, BAIRRO, CIDADE, COMPLEMENTO, FK_USUARIO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String insertAluguel = "INSERT INTO ALUGUEL (FK_CLIENTE, FK_VEICULO, DT_RETIRADA, DT_DEVOLUCAO, VL_TOTAL, VL_TAXA, FK_PAGAMENTO, DT_ALUGUEL) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            // irei criar uma classe dao separada para inserir as informações do cliente. Estou apenas realizando alguns testes.
            PreparedStatement preparedStatement = connection.prepareStatement(insertCliente);
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


            // ainda estou vendo se essa questão vai ser necessária.
            PreparedStatement preparedStatement2 = connection.prepareStatement(insertAluguel);
            preparedStatement2.setInt(1, aluguel.getFkCliente());
            preparedStatement2.setInt(2, aluguel.getFkVeiculo());
            preparedStatement2.setDate(3, aluguel.getDtRetirada());
            preparedStatement2.setDate(4, aluguel.getDtDevolucao());
            preparedStatement2.setDouble(5, aluguel.getVlTaxa());
            preparedStatement2.setDouble(6, aluguel.getVlTotal());
            preparedStatement2.setInt(7, aluguel.getFkPagamento());
            preparedStatement2.setDate(8, new java.sql.Date(aluguel.getDtAluguel().getTime()));

            preparedStatement.execute();
            preparedStatement2.execute();

            preparedStatement.close();
        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }
    }

}
