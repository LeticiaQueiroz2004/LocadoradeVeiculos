package br.com.electrarent.servlet;

import br.com.electrarent.dao.AluguelDAO;
import br.com.electrarent.model.Aluguel;
import br.com.electrarent.model.Cliente;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet("/Aluguel")
public class AluguelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("aluguel.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String nacionalidade = req.getParameter("nacionalidade");
        Date nasc = Date.valueOf(req.getParameter("nascimento"));
        String rg = req.getParameter("rg");
        String cpf = req.getParameter("cpf");
        String telefone = req.getParameter("telefone");
        String endereco = req.getParameter("endereco");
        String cep = req.getParameter("cep");
        String bairro = req.getParameter("bairro");
        String cidade = req.getParameter("cidade");
        String complemento = req.getParameter("complemento");
        int fkUsuario = Integer.parseInt(req.getParameter("fk_usuario"));


        // Ainda em desenvolvimento -- ass: leticia
        // lembrar de criar um botao para cadastrar as informações do cliente antes de efetuar o aluguel do veiculo
        // fk_veiculo -- pegar id de acordo com o veículo selecionado
        // apenas as datas de retirada, devolução e os valores serão passados como parametro. as chaves estrangeiras tem que ser puxado do bd de acordo com o veiculo e login selecionado  (não sei como fazer isso ainda)

        int fkCliente = Integer.parseInt(req.getParameter("fk-cliente"));
        int fkVeiculo = Integer.parseInt(req.getParameter("fk-veiculo"));
        Date dtretirada = Date.valueOf(req.getParameter("retirada"));
        Date dtdevolucao = Date.valueOf(req.getParameter("devolucao"));
        double vlTaxa = Double.parseDouble(req.getParameter("vlTaxa"));
        double vlTotal = Double.parseDouble(req.getParameter("vlTotal"));
        int fkPagamento = Integer.parseInt(req.getParameter("fkPagamento"));
        Date dtaluguel = Date.valueOf(req.getParameter("aluguel"));

        Cliente cliente = new Cliente(nome, email, nacionalidade, nasc, rg,cpf, telefone, endereco, cep, bairro, cidade, complemento, fkUsuario);
        Aluguel aluguel = new Aluguel(fkCliente, fkVeiculo, dtretirada, dtdevolucao, vlTaxa, vlTotal, fkPagamento, dtaluguel);

        AluguelDAO aluguelDAO = new AluguelDAO();

        aluguelDAO.InsertAluguel(cliente, aluguel);

        req.getRequestDispatcher("/explorar.jsp").forward(req, resp);
    }
}
