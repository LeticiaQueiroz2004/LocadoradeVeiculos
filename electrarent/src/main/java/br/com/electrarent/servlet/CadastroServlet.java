package br.com.electrarent.servlet;

import br.com.electrarent.dao.UserDAO;
import br.com.electrarent.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/Cadastro")
public class CadastroServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("cadastro.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String primeiroNome = req.getParameter("primeiroNome");
        String sobrenome = req.getParameter("sobrenome");
        String telefone = req.getParameter("telefone");
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        User user = new User(primeiroNome, sobrenome, telefone, email, senha);

        UserDAO userDAO = new UserDAO();

        userDAO.Cadastro(user);

        req.getRequestDispatcher("/").forward(req, resp);
    }
}
