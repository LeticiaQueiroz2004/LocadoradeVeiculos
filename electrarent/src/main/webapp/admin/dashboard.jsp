<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">

    <link href="/webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/dashboard.css" rel="stylesheet">
    <link href="/css/style.css" rel="stylesheet">
    <title>Dashboard</title>
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
                <a class="nav-link px-3" href="/logout">Sign out</a>
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
                            <a class="nav-link" href="/admin/"><span data-feather="file-text" class="align-text-bottom"></span> Novo Veículo </a>
                        </li>
                    </ul>

                </div>

            </nav>

            <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">

                <div class="table-responsive">
                    <h1>Veiculos cadastrados</h1>
                    <table class="table table-striped table-sm">
                        <tr>
                            <th></th>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Valor Diária</th>
                            <th>Qtd. Disponível </th>
                            <c:if test="${sessionScope.loggedUser != null}">
                                <th>Actions</th>
                            </c:if>
                        </tr>
                        <c:forEach var="car" items="${cars}">
                            <tr>
                                <td></td>
                                <td>${car.id}</td>
                                <td>${car.name}</td>
                                <td>${car.vlDiaria}</td>

                                <td>
                                    <c:if test="${sessionScope.loggedUser != null}">
                                        <form action="/delete-car" method="post">
                                            <input type="hidden" id="id" name="id" value="${car.id}">
                                            <button type="submit" class="btn btn-primary">Delete</button>
                                            <a class="btn btn-secondary" href="index.jsp?id=${car.id}&name=${car.name}&image=${car.image}&placa=${car.placa}&cor=${car.cor}&vlDiaria=${car.vlDiaria}&kmRodados=${car.kmRodados}&qtdPortas=${car.qtdPortas}&qtdAcentos=${car.qtdAcentos}">Update</a>
                                        </form>
                                    </c:if>
                                </td>
                            </tr>
                        </c:forEach>

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
                    </table>
                </div>
            </main>

            <script src="http://localhost:8080/webjars/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
            <script src="../js/feather.min.js"></script>
            <script src="../js/dashboard.js"></script>

        </div>
    </div>
</body>
</html>