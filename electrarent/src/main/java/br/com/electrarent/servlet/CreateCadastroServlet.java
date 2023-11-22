package br.com.electrarent.servlet;


import dao.cadastroDAO;
import model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/create-cadastro")
public class CreateCadastroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String senha = req.getParameter("password");
        String nome = req.getParameter("firstname");
        String email = req.getParameter("email");
        String telefone = req.getParameter("telefone");
        String sobrenome = req.getParameter("secondname");


        if (verificarSenha(senha) && verificarEmail(email)) {
            Usuario obj = new Usuario(senha, nome, email, telefone, sobrenome);
            obj.setSenha(senha);
            obj.setNome(nome);
            obj.setEmail(email);
            obj.setTelefone(telefone);
            obj.setSobrenome(sobrenome);

            new cadastroDAO().SalvarCadastro(obj);

            req.getRequestDispatcher("Cadastro.html").forward(req, resp);
        } else {
            System.out.println("senha invalida");
        }
    }



        public static boolean verificarSenha(String senha) {
            // Verifica se a senha tem pelo menos 6 caracteres
            if (senha.length() < 6) {
                return false;
            }

            // Verifica se contém letras maiúsculas
            Pattern uppercasePattern = Pattern.compile("[A-Z]");
            Matcher uppercaseMatcher = uppercasePattern.matcher(senha);
            if (!uppercaseMatcher.find()) {
                return false;
            }

            // Verifica se contém números
            Pattern digitPattern = Pattern.compile("[0-9]");
            Matcher digitMatcher = digitPattern.matcher(senha);
            if (!digitMatcher.find()) {
                return false;
            }

            // Se passou por todas as verificações, a senha é válida
            return true;
        }

    public static boolean verificarEmail(String email) {
        // Expressão regular para validar o formato do email
        String regex = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";

        // Compila a expressão regular em um padrão (Pattern)
        Pattern pattern = Pattern.compile(regex);

        // Cria um Matcher com o email fornecido
        Matcher matcher = pattern.matcher(email);

        // Retorna true se o email corresponder ao padrão e false caso contrário
        return matcher.matches();
    }


    }

