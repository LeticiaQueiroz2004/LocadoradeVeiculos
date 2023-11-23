<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>ElectraRent</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" type="text/css" href="/css/cadastro.css">
    <link rel="icon" type="shorticon" href="https://img.freepik.com/vetores-premium/compre-o-compartilhamento-de-compra-ou-o-logotipo-do-carro-alugado-com-o-negociante-de-carros-de-icones-planos-da-as-chaves-ao-comprador-ilustracao-vetorial-isolada_108855-3539.jpg?w=360"/>
</head>
<body>

<div class="container">
    <div class="container-login">
        <div class="wrap-login">
            <form class="login-form" action="/Cadastro" method="post">
                <span class="login-form-titulo"> Olá, seja bem vindo! </span>

                <div class="wrap-input">
                    <input class="input-form" type="text" name="primeiroNome" id="primeiroNome">
                    <span class="focus-input-form" data-placeholder="Primeiro noome"></span>
                </div>

                <div class="wrap-input">
                    <input class="input-form" type="text" name="sobrenome" id="sobrenome">
                    <span class="focus-input-form" data-placeholder="Sobrenome"></span>
                </div>

                <div class="wrap-input">
                    <input class="input-form" type="email" name="email" id="email">
                    <span class="focus-input-form" data-placeholder="E-mail"></span>
                </div>

                <div class="wrap-input">
                    <input class="input-form" type="number" name="telefone" id="telefone">
                    <span class="focus-input-form" data-placeholder="Telefone"></span>
                </div>

                <div class="wrap-input">
                    <input class="input-form" type="password" name="senha" id="senha">
                    <span class="focus-input-form" data-placeholder="Senha"></span>
                </div>

                <div class="container-login-botao"> <button class="login-botao" type="submit"> Criar conta </button>
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
                        <span class="text1"> Já tem uma conta? </span>
                        <a href="/Login" class="text2"> Logar </a>
                    </li>
                </ul>
            </form>
        </div>
    </div>
</div>

</body>
</html>