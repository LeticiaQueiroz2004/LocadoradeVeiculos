package br.com.electrarent.servlet;

import br.com.electrarent.dao.UserAdmDAO;
import br.com.electrarent.model.UserADM;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginADM")
public class LoginServletADM extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("loginAdm.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        UserADM user = new UserADM(email, senha);

        boolean isValidUser = new UserAdmDAO().VerifyCredentialsAdm(user);

        if (isValidUser) {

            req.getSession().setAttribute("loggedUser", "adm");

            resp.sendRedirect("/admin/find-all-cars");

        } else {

            req.setAttribute("message", "Invalid credentials!");

            req.getRequestDispatcher("/loginAdm.jsp").forward(req, resp);

        }

    }
}
