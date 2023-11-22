package br.com.electrarent.servlet;

import dao.loginDAO;
import model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    boolean loginValido;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String senha = req.getParameter("password");

        String email = req.getParameter("email");


        Usuario obj = new Usuario(senha, email);
        obj.setSenha(senha);
        obj.setEmail(email);

        loginValido = new loginDAO().validarLogin(obj);

        if (loginValido) {

        } else {

        }

            req.getRequestDispatcher("login.html").forward(req, resp);

    }
}
