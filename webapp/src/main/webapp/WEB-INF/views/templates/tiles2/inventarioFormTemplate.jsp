<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><spring:message code="app.name" /></title>


<!-- Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/jquery-ui/jquery-ui-1.10.0.custom.min.css" />

<link
	href="${pageContext.request.contextPath}/static/css/bootstrap/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/main.css" />

<script
	src="${pageContext.request.contextPath}/static/js/jquery/jquery-1.9.1.min.js"></script>

<script
	src="${pageContext.request.contextPath}/static/js/jquery-ui/jquery-ui-1.10.0.custom.js"></script>
<script
	src="${pageContext.request.contextPath}/static/js/jquery-ui/jquery-ui-timepicker-addon.js"></script>

<script
	src="${pageContext.request.contextPath}/static/js/bootstrap/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/static/js/app/inventario.js"></script>



<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="appbar" />
	<tiles:insertAttribute name="menu" />

	<input type="hidden" id="pestanaActiva" value="${pestanaActiva}" />

	<%-- 	<ul class="breadcrumb">
		<li><a href="${pageContext.request.contextPath}/auth/home">Home</a></li>
		<li class="active">Nuevo Inventario</li>
	</ul> --%>
	<div class="container">
		<div class="row-fluid">
			<div class="span2"></div>
			<div id="formularios">
				<fieldset>
					<legend id="legendfiltro">
						<br />
						<div class="row">
							<div class="col-md-1"></div>
							<div class="col-md-4">
								<div class="center-block">Aplicación</div>
							</div>
							<div class="col-md-7"></div>
						</div>
						<input type="hidden" id="tipoFormulario" value="${tipoFormulario}" />

					</legend>
					<ul class="nav nav-tabs" role="tablist">
						<!-- <li class="active"><a href="#DatosInventario" role="tab" -->
						<li class="active"><a href="#DatosInventario" role="tab"
							data-toggle="tab">Datos Inventarios</a></li>
						<li class="pestanasInventario disabled disabledTab"><a
							href="#Desarrolladores" role="tab" data-toggle="tab">Desarrolladores</a></li>
						<li class="pestanasInventario disabled disabledTab"><a
							href="#InformacionAdicional" role="tab" data-toggle="tab">Información
								adicional</a></li>
						<li class="pestanasInventario disabled disabledTab"><a
							href="#DatosEntornoDES" role="tab" data-toggle="tab">Conf.
								Entorno Desarrollo</a></li>
						<li class="pestanasInventario disabled disabledTab"><a
							href="#DatosEntornoPRE" role="tab" data-toggle="tab">Conf.
								Entorno PreProducción</a></li>
						<li class="pestanasInventario disabled disabledTab"><a
							href="#DatosEntornoPRO" role="tab" data-toggle="tab">Conf.
								Entorno Producción</a></li>

					</ul>


					<c:if test="${mensajeError != null}">
						<br />
						<div class="alert alert-danger">${mensajeError}</div>
					</c:if>

					<c:if test="${mensajeInfo != null}">
						<br />
						<div class="alert alert-info">${mensajeInfo}</div>
					</c:if>

					<c:if test="${mensajeWarning != null}">
						<br />
						<div class="alert alert-warning">${mensajeWarning}</div>
					</c:if>

					<div class="tab-content">
						<div class="tab-pane fade  in active" id="DatosInventario">
							<tiles:insertAttribute name="datosInventario" />
						</div>
						<div class="tab-pane fade" id="Desarrolladores">
							<tiles:insertAttribute name="listDesarrolladores" />
						</div>
						<div class="tab-pane fade" id="InformacionAdicional">
							<tiles:insertAttribute name="datosInformacionAdicional" />
						</div>
						<div class="tab-pane fade " id="DatosEntornoDES">
							<tiles:insertAttribute name="datosEntornoDES" />
						</div>
						<div class="tab-pane fade " id="DatosEntornoPRE">
							<tiles:insertAttribute name="datosEntornoPRE" />
						</div>
						<div class="tab-pane fade " id="DatosEntornoPRO">
							<tiles:insertAttribute name="datosEntornoPRO" />
						</div>

					</div>
					<div class="row-fluid">
						<div class="span2">
							<form action="${pageContext.request.contextPath}/auth/inventario/volver">
								<input type="submit" value="Volver" class="btn btn-primary" />
							</form>
						</div>
					</div>
				</fieldset>
				<div class="span2"></div>
			</div>
		</div>
</body>
</html>


