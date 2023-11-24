<!DOCTYPE html>
<html lang="pt-br">
<head>
    <title>ElectraRent</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" type="text/css" href="/css/explorar.css">
    <link rel="icon" type="shorticon" href="https://img.freepik.com/vetores-premium/compre-o-compartilhamento-de-compra-ou-o-logotipo-do-carro-alugado-com-o-negociante-de-carros-de-icones-planos-da-as-chaves-ao-comprador-ilustracao-vetorial-isolada_108855-3539.jpg?w=360"/>
    <link rel="stylesheet" href="/css/StyleComponentes.css">
</head>
<body>
<div class="site">
    <div class="header">
        <div id="header-container"></div>
        <script src="/componentes/Cabecalho.js"></script>
    </div>

    <div class="CardCarroContainer">
        <div id="carCard"></div>
        <script src="/componentes/CardCarro.js"></script>
    </div>

    <c:forEach var="car" items="${cars}">
    <div class="cardCarro">
        <h2>${car.name}</h2>
        <img src="${car.image}" alt="${car.name} Image">
        <div>Selecione abaixo:</div>
        <select class="select" id="kmSelect">
            <option value="1.000">1.000</option>
            <option value="2.000">2.000</option>
            <option value="3.000">3.000</option>
            <option value="4.000">4.000</option>
            <option value="5.000">5.000</option>
            <option value="Mais">Mais</option>
        </select>
        <div>Diária a partir de: ${car.vlDiaria}</div>
        <a class="alugar" href="/aluguel.jsp">Alugar esse</a>
    </div>
    </c:forEach>
</div>
<div id="rodape-container"></div>
<script src="/componentes/Rodape.js"></script>
</body>
</html>