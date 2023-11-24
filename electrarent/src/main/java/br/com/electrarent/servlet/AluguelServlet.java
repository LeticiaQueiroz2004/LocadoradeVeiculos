package br.com.electrarent.servlet;

import br.com.electrarent.dao.AluguelDAO;
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

        Cliente cliente = new Cliente(nome, email, nacionalidade, nasc, rg,cpf, telefone, endereco, cep, bairro, cidade, complemento, fkUsuario);

        AluguelDAO aluguelDAO = new AluguelDAO();

        aluguelDAO.InsertAluguel(cliente);

        req.getRequestDispatcher("/explorar.jsp").forward(req, resp);
    }
}
