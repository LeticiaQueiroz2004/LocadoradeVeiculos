package br.com.electrarent.servlet;

import br.com.electrarent.dao.UserDAO;
import br.com.electrarent.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        User user = new User(email, senha);

        boolean isValidUser = new UserDAO().VerifyCredentials(user);

        if (isValidUser) {

            req.getSession().setAttribute("loggedUser", email);

            resp.sendRedirect("/admin/find-all-cars");

        } else {

            req.setAttribute("message", "Invalid credentials!");

            req.getRequestDispatcher("login.jsp").forward(req, resp);

        }

    }
}
