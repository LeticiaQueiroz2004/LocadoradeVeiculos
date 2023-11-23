<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>ElectraRent</title>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">

    <link href="/webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/Login.css">
    <link rel="icon" type="shorticon" href="https://img.freepik.com/vetores-premium/compre-o-compartilhamento-de-compra-ou-o-logotipo-do-carro-alugado-com-o-negociante-de-carros-de-icones-planos-da-as-chaves-ao-comprador-ilustracao-vetorial-isolada_108855-3539.jpg?w=360"/>
</head>
<body>

<div class="container">
    <div class="container-login">
        <div class="wrap-login">
            <form class="login-form" action="/Login" method="post" >
                <span class="login-form-titulo"> Faça o Login </span>

                <span>${requestScope.message}</span>

                <br>

                <div class="wrap-input">
                    <input class="input-form" type="text" name="email" id="email">
                    <span class="focus-input-form" data-placeholder="E-mail"></span>
                </div>

                <div class="wrap-input">
                    <input class="input-form" type="password" name="senha" id="senha">
                    <span class="focus-input-form" data-placeholder="Senha"></span>
                </div>

                <div class="container-login-botao"> <button class="login-botao" type="submit"> Login </button>
                </div>

                <div class="manterConectado">
                    <input type="checkbox" id="manterConectado" name="manterConectado">
                    <label for="manterConectado">Mantenha-me conectado</label>
                </div>

                <ul class="login-opcoes">
                    <li>
                        <span class="text1"> Esqueceu sua </span>
                        <a href="#" class="text2"> senha? </a>
                    </li>
                    <li>
                        <span class="text1"> Não tem conta? </span>
                        <a href="/cadastro.jsp" class="text2"> Criar </a>
                    </li>
                    <li>
                        <a href="/loginAdm.jsp" class="text2"> Entrar como Administrador </a>
                    </li>
                </ul>
            </form>
        </div>
    </div>
</div>

</body>
</html>