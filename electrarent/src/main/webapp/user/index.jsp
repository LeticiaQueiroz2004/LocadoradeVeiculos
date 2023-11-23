<html lang="pt-br">
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
        <title> ElectraRent </title>

        <link href="/css/dashboard.css" rel="stylesheet">
        <link href="/css/style.css" rel="stylesheet">
        <link rel="icon" type="shorticon" href="https://img.freepik.com/vetores-premium/compre-o-compartilhamento-de-compra-ou-o-logotipo-do-carro-alugado-com-o-negociante-de-carros-de-icones-planos-da-as-chaves-ao-comprador-ilustracao-vetorial-isolada_108855-3539.jpg?w=360"/>
        <link href="/webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
    <header class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
        <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3 fs-6" href="#">ElectraRent</a>
        <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <input class="form-control form-control-dark w-100 rounded-0 border-0" type="text" placeholder="Search" aria-label="Search">
        <div class="navbar-nav">
            <div class="nav-item text-nowrap">
                <a class="nav-link px-3" href="/logout">Sair</a>
            </div>
        </div>
    </header>

        <div class="container-fluid">
            <div class="row">
                    <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
                        <div class="position-sticky pt-3 sidebar-sticky">
                            <ul class="nav flex-column">
                                <li class="nav-item">
                                    <a class="nav-link" aria-current="page" href="#"><span data-feather="user" class="align-text-bottom"></span>

                                        <c:if test="${sessionScope.loggedUser != null}">
                                            <span>${sessionScope.loggedUser}</span>
                                        </c:if>
                                    </a>
                                </li>
                            </ul>
                            <hr>
                            <ul class="nav flex-column">
                                <li class="nav-item">
                                    <a class="nav-link" aria-current="page" href="/admin/find-all-cars"><span data-feather="home" class="align-text-bottom"></span> Home </a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="/admin/"><span data-feather="file-text" class="align-text-bottom"></span> New Car</a>
                                </li>
                            </ul>
                        </div>
                    </nav>

                    <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
                        <div class="table-responsive">
                            <form action="/create-car" method="post" enctype="multipart/form-data" class="container">

                                <input type="hidden" id="id" name="id" value="${param.id}">

                                <div class="mb-3">
                                    <label class="form-label" for="car-name">Car Name</label>
                                    <input class="form-control" type="text" name="car-name" id="car-name" value="${param.name}">
                                </div>

                                <div class="mb-3">
                                    <label class="form-label" for="placa">Placa</label>
                                    <input class="form-control" type="text" name="placa" id="placa" value="${param.placa}">
                                </div>

                                <div class="mb-3">
                                    <label class="form-label" for="cor">Cor</label>
                                    <input class="form-control" type="text" name="cor" id="cor" value="${param.cor}">
                                </div>

                                <div class="mb-3">
                                    <label class="form-label" for="vlDiaria">Valor Diária</label>
                                    <input class="form-control" type="text" name="vlDiaria" id="vlDiaria" value="${param.vlDiaria}">
                                </div>

                                <div class="mb-3">
                                    <label class="form-label" for="kmRodados">KM Rodados </label>
                                    <input class="form-control" type="text" name="kmRodados" id="kmRodados" value="${param.kmRodados}">
                                </div>

                                <div class="mb-3">
                                    <label class="form-label" for="qtdPortas">Qtd. portas</label>
                                    <input class="form-control" type="text" name="qtdPortas" id="qtdPortas" value="${param.qtdPortas}">
                                </div>

                                <div class="mb-3">
                                    <label class="form-label" for="qtdAcentos">Qtd. Acentos </label>
                                    <input class="form-control" type="text" name="qtdAcentos" id="qtdAcentos" value="${param.qtdAcentos}">
                                </div>

                                <div class="mb-3">
                                    <label class="form-label"> Image </label>
                                    <input class="form-control" type="file" name="image" id="image">
                                </div>
                                <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                                    <button type="submit" class="btn btn-primary">Save</button>
                                </div>
                            </form>
                        </div>
                    </main>
                <script src="http://localhost:8080/webjars/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
                <script src="../js/feather.min.js"></script>
                <script src="../js/dashboard.js"></script>
            </div>
        </div>
    </body>
</html>