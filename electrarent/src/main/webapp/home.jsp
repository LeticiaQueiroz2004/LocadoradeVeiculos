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
	
	<link href="http://localhost:8080/webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
	<link href="/css/style-album.css" rel="stylesheet">
	
	<!-- link to default album template -->
	<link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/album/">

</head>
<body>

	<header>
		<div class="navbar navbar-dark bg-dark shadow-sm">
			<div class="container">
				<a href="#" class="navbar-brand d-flex align-items-center"> <svg
						xmlns="http://www.w3.org/2000/svg" width="20" height="20"
						fill="none" stroke="currentColor" stroke-linecap="round"
						stroke-linejoin="round" stroke-width="2" aria-hidden="true"
						class="me-2" viewBox="0 0 24 24">
						<path d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z" />
						<circle cx="12" cy="13" r="4" /></svg> <strong>CarStore</strong>
				</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarHeader"
					aria-controls="navbarHeader" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
			</div>
		</div>
	</header>

	<main>
	
		<div class="album py-5 bg-light">
			
			<div class="container">
	
				<div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">

					<!-- init card-->
					<c:forEach var="car" items="${cars}">
						<div class="col">
							<div class="card shadow-sm">

								<img src="${car.image}" alt="">

								<div class="card-body">
									<p class="card-text"> ${car.name}</p>
									<p class="card-text"> ${car.cor}</p>
									<p class="card-text"> ${car.qtdPortas}</p>
									<p class="card-text"> ${car.qtdAcentos}</p>
									<p class="card-text"> ${car.vlDiaria}</p>
									<div class="d-flex justify-content-between align-items-center">
										<div class="btn-group">
											<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
					<!-- end card-->
					
				</div>
			</div>
	
	</main>

	<footer class="text-muted py-5">
		<div class="container">
			<p class="float-end mb-1">
				<a href="#">Back to top</a>
			</p>
			<p class="mb-1">Create by &copy; CarStore 2023!</p>
		</div>
	</footer>

	<script src="http://localhost:8080/webjars/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>

</body>
</html>
