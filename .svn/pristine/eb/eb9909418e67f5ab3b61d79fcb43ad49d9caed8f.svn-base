<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<br />

<div class="container-fluid">


	<!-- -------------------------------------------------------------------------------------  -->
	<!-- COMIENZO DE GRID DE DATOS                                                              -->
	<!-- -------------------------------------------------------------------------------------  -->
	<div class="row-fluid">
		<div class="span12 form">
			<c:if test="${not empty listDesarrolladores}">
				<div class="display-table">

					<display:table name="listDesarrolladores" requestURI=""
						id="inventarioPersona" pagesize="10"
						class="table table-striped table-bordered table-hover"
						defaultsort="1" export="false" defaultorder="ascending">

						<display:setProperty name="basic.empty.showtable" value="true" />
						<display:column property="fechaAlta" headerClass="sortable"
							sortable="true" title="Fecha Alta" />
						<display:column property="persona.nombre" headerClass="sortable"
							sortable="true" title="Nombre Desarrollador" />
						<display:column property="persona.primerApellido"
							headerClass="sortable" sortable="true" title="Primer Apellido" />
						<display:column property="persona.segundoApellido"
							headerClass="sortable" sortable="true" title="Segundo Apellido" />
						<display:column property="persona.email" headerClass="sortable"
							sortable="true" title="email" />
						<display:column property="persona.telefonoContacto"
							headerClass="sortable" sortable="true"
							title="Telefono de Contacto" />
					</display:table>
					</div>
			</c:if>
		</div>
		<c:if test="${empty listDesarrolladores}">

			<div class="container content" role="main">
				<div class="row"></div>

				<div class="alert alert-danger info-entrada">
					<div class="text-center">
						<h4>No hay Registros</h4>
					</div>



				</div>
			</div>

		</c:if>


		<br />

	</div>
</div>


