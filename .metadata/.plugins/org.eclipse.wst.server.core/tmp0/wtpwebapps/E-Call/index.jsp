<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="fr">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="E-Callers">
  <meta name="author" content="Bilounga Abomo Marcelin">

  <title>ECall</title>

  <!-- Bootstrap Core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom Fonts -->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">
  <link href="vendor/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">

  <!-- Custom CSS -->
  <link href="css/stylish-portfolio.min.css" rel="stylesheet">

</head>

<body id="page-top">

  <!-- Navigation -->
  <a class="menu-toggle rounded" href="#">
    <i class="fas fa-bars"></i>
  </a>
  <nav id="sidebar-wrapper">
    <ul class="sidebar-nav">
      <li class="sidebar-brand">
        <a class="js-scroll-trigger" href="#page-top">ECall</a>
      </li>
      <li class="sidebar-nav-item">
        <a class="js-scroll-trigger" href="#page-top">Accueil</a>
      </li>
      <li class="sidebar-nav-item">
        <a class="js-scroll-trigger" href="connexion.jsp">Connexion</a>
      </li>
       <li class="sidebar-nav-item">
        <a class="js-scroll-trigger" href="inscription.jsp">Inscription</a>
      </li>
      <li class="sidebar-nav-item">
        <a class="js-scroll-trigger" href="#Download">Telecharger</a>
      </li>
      <li class="sidebar-nav-item">
        <a class="js-scroll-trigger" href="#about">A Propos</a>
      </li>
      <li class="sidebar-nav-item">
        <a class="js-scroll-trigger" href="#services">Services</a>
      </li>
      <li class="sidebar-nav-item">
        <a class="js-scroll-trigger" href="#contact">Contact</a>
      </li>
      <li class="sidebar-nav-item">
        <a class="js-scroll-trigger" href="#sondages">Notre blog</a>
      </li>
    </ul>
  </nav>

  <!-- Header -->
  <header class="masthead d-flex">
    <div class="container text-center my-auto">
      <h1 class="mb-1">ECall</h1>
      <h3 class="mb-5">
        <em> Les numeros inconnus sur notre application ne le sont plus !!! </em>
      </h3>
      <a class="btn btn-primary btn-xl js-scroll-trigger" href="inscription.jsp">Inscrivez-vous</a>
    </div>
    <div class="overlay"></div>
  </header>

   <!-- about -->
   <section class="content-section bg-light" id="about">
   	<div class="container text-center">
   		<h1 class="mx-auto mb-5">A PROPOS</h1>
      <div class="content-section-heading">
        <div class="row">
          <div class="col-lg-10 mx-auto">
            <h2>Notre application vous donne la possibilité</h2>
            <p class="lead mb-5"> d'idenfier les numeros inconnus 
            qui vous contacte et vous donne la possibilité de participer aux sondages.
            </p>
          </div>
        </div>
      </div>
    </div>
   </section>

  <!-- Services -->
  <section class="content-section bg-primary text-white text-center" id="services">
    <div class="container">
      <div class="content-section-heading">
        <h3 class="text-secondary mb-0">Services</h3>
        <h2 class="mb-5">Ce que nous vous offrons</h2>
      </div>
      <div class="row">
        <div class="col-lg-3 col-md-6 mb-5 mb-lg-0">
          <span class="service-icon rounded-circle mx-auto mb-3">
            <i class="icon-screen-smartphone"></i>
          </span>
          <h4>
            <strong>Responsive</strong>
          </h4>
          <p class="text-faded mb-0">Looks great on any screen size!</p>
        </div>
        <div class="col-lg-3 col-md-6 mb-5 mb-lg-0">
          <span class="service-icon rounded-circle mx-auto mb-3">
            <i class="icon-pencil"></i>
          </span>
          <h4>
            <strong>Redesigned</strong>
          </h4>
          <p class="text-faded mb-0">Freshly redesigned for Bootstrap 4.</p>
        </div>
        <div class="col-lg-3 col-md-6 mb-5 mb-md-0">
          <span class="service-icon rounded-circle mx-auto mb-3">
            <i class="icon-like"></i>
          </span>
          <h4>
            <strong>Favorited</strong>
          </h4>
          <p class="text-faded mb-0">Millions of users
            <i class="fas fa-heart"></i>
            Start Bootstrap!</p>
        </div>
        <div class="col-lg-3 col-md-6">
          <span class="service-icon rounded-circle mx-auto mb-3">
            <i class="icon-mustache"></i>
          </span>
          <h4>
            <strong>Questions</strong>
          </h4>
          <p class="text-faded mb-0">Posez vos questions ...</p>
        </div>
      </div>
    </div>
  </section>

  

  <!-- download apk android -->
  <section class="callout" id="Download">
    <div class="container text-center">
      <h2 class="mx-auto mb-5">ECall versions android ta nouvelle application securisée !</h2>
      <a class="btn btn-primary btn-xl" href="https://startbootstrap.com/template-overviews/stylish-portfolio/">Telecharger notre application android maintenant !</a>
    </div>
  </section>

  

  <!-- contact -->
  <section class="content-section bg-primary text-white text-center" id="contact" >
  	
  </section>

  <!-- Footer -->
  <footer class="footer text-center">
    <div class="container">
      <ul class="list-inline mb-5">
        <li class="list-inline-item">
          <a class="social-link rounded-circle text-white mr-3" href="">
            <i class="icon-social-facebook"></i>
          </a>
        </li>
        <li class="list-inline-item">
          <a class="social-link rounded-circle text-white mr-3" href="">
            <i class="icon-social-twitter"></i>
          </a>
        </li>
      </ul>
      <p class="text-muted small mb-0"> Copyright ECall; Votre site où vous serez securité 2019 </p>
    </div>
  </footer>

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded js-scroll-trigger" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Plugin JavaScript -->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for this template -->
  <script src="js/stylish-portfolio.min.js"></script>

</body>

</html>
