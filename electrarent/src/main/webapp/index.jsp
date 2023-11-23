<!doctype html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="generator" content="">
    <meta name="theme-color" content="#7952b3">
    <title>Car Store</title>

    <link href="/css/home.css" rel="stylesheet">
    <link href="/css/StyleComponentes.css" rel="stylesheet">

    <!-- link to default album template -->
    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/album/">

</head>
<body>
    <div class="site">
        <div class="header">
            <div id="header-container"></div>
            <script src="/componentes/Cabecalho.js"></script>
        </div>

        <div class="container">
            <div class="textoCard">
                <div class="titulo"> PRETENDE ALUGAR UM CARRO EM SP? </div>
                <div class="texto"> A ElectraRent tem a ferramenta mais completa para te ajudar nessa missão. Aqui você encontrará os melhores carros elétricos de SP disponíveis para aluguéis semanais ou mensais. </div>
                <div class="botao"> <button> <a href="/explorar.jsp"> Carros Disponíveis </a> </button></div>
            </div>
        </div>

        <div class="container2">
            <div>
                <div class="titulo"> CARROS DISPONÍVEIS PARA ALUGUEL - Sugestão </div>
                <div class="car-list">
                    <div id="card-list"></div>
                    <script src="/componentes/Card.js"></script>
                </div>
                <div class="botao"> <button> <a href="/explorar.jsp"> Buscar mais carros disponíveis </a> </button></div>
            </div>
        </div>

        <div class="container3">
            <div>
                <div id="container-esquerda"></div>
                <script src="/componentes/VantagensTextos.js"></script>
            </div>
        </div>

        <div class="container4">
            <div class="img"></div>
        </div>
    </div>
    <div id="rodape-container"></div>
    <script src="/componentes/Rodape.js"></script>
</body>
</html>
