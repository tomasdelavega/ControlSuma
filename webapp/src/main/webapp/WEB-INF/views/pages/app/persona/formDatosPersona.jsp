<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="${pageContext.request.contextPath}/static/js/app/persona.js"></script>

<div class="container-fluid">
	<div class="row-fluid">
		<form:form name="form" id="datosPersona" commandName="datosPersona"	action="${pageContext.request.contextPath}/auth/persona/edit" method="post" class="form">
			<input type="hidden" value=""/>
			<form:hidden path="id"/>
			<fieldset>
				<legend>
					<h4>Editar Persona</h4>
				</legend>
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
				<!-- C�digo Persona -->
				<div class="col-md-4">
					<div class="form-group">
						<label><spring:message code="persona.form.datosPersona.codPersona"></spring:message></label>
						<form:input  path="codPersona" id="inputCodPersona" class="form-control" minlength="1" maxlength="30" placeholder="C�digo Persona"></form:input>
						<div class="text-danger">
							<form:errors path="codPersona"></form:errors>
						</div>
					</div>
				</div>
				<!-- C�digo Jira -->
				<div class="col-md-4">
					<div class="form-group">
						<label for="codJira"><spring:message code="persona.form.datosPersona.codJira"></spring:message></label>
						<form:input  path="codJira" id="inputCodJira" placeholder="C�digo Jira" class="form-control" minlength="1" maxlength="30" disabled="false"></form:input>
						<div class="text-danger">
							<form:errors path="codJira"></form:errors>
						</div>
					</div>
				</div>
				<!-- Fecha �ltima Modificaci�n -->
				<div class="col-md-4">
					<div class="form-group">
						<label><spring:message code="persona.form.datosPersona.fechaUltMod"></spring:message></label>
						<form:input path="fechaUltMod" id="inputFechaUltMod" placeholder="Fecha �ltima Modificaci�n" class="form-control" readonly="true"></form:input>
						<div class="text-danger">
							<form:errors path="fechaUltMod"></form:errors>
						</div>
					</div>
				</div>
				<!-- Nombre -->
				<div class="col-md-4">
					<div class="form-group">
						<label for="nombre"><spring:message code="persona.form.datosPersona.nombre"></spring:message></label>
						<form:input  type="text" minlength="1" maxlength="50" path="nombre" placeholder="Nombre" id="inputNombre" cssClass="form-control"></form:input>
						<div class="text-danger">
							<form:errors path="nombre"></form:errors>
						</div>
					</div>
				</div>
				<!-- Primer Apellido -->
				<div class="col-md-4">
					<div class="form-group">
						<label for="primerApellido"><spring:message code="persona.form.datosPersona.primerApellido"></spring:message></label>
						<form:input  type="text" minlength="1" maxlength="50" placeholder="Primer Apellido" path="primerApellido" id="inputPrimerApellido" cssClass="form-control"></form:input>
						<div class="text-danger">
							<form:errors path="primerApellido"></form:errors>
						</div>
					</div>
				</div>
				<!-- Segundo Apellido -->
				<div class="col-md-4">
					<div class="form-group">
						<label for="segundoApellido"><spring:message code="persona.form.datosPersona.segundoApellido"></spring:message></label>
						<form:input  type="text" minlength="1" maxlength="50" path="segundoApellido" placeholder="Segundo Apellido" id="inputSegundoApellido" class="form-control"></form:input>
						<div class="text-danger">
							<form:errors path="segundoApellido"></form:errors>
						</div>
					</div>
				</div>
				<!-- Rol de usuario -->
				<div class="col-md-4">
					<div class="form-group">
						<label for="rol"><spring:message code="persona.form.datosPersona.rol" /></label>
						<form:select path="rol" id="rolSelect" class="form-control">
							<%-- <form:option value="0" label="Seleccionar"></form:option> --%>
							<form:options items="${listOfRoles}" itemValue="id" itemLabel="nombre" />
						</form:select>
						<div class="text-danger">
							<form:errors path="rol"></form:errors>
						</div>
					</div>
				</div>
				<!-- Email -->
				<div class="col-md-4">
					<div class="form-group">
						<label for="email"><spring:message code="persona.form.datosPersona.email"></spring:message></label>
						<form:input type="email" path="email" id="inputEmail" placeholder="email" class="form-control"></form:input>
						<div class="text-danger">
							<form:errors path="email"></form:errors>
						</div>
					</div>
				</div>
				<!-- Tel�fono de Contacto -->
				<div class="col-md-4">
					<div class="form-group">
						<label for="telefonoContacto"><spring:message code="persona.form.datosPersona.telefonoContacto"></spring:message></label>
						<form:input type="text" path="telefonoContacto" id="inputTelefonoContacto" maxlength="9" placeholder="Tel�fono de Contacto" class="form-control"></form:input>
						<div class="text-danger">
							<form:errors path="telefonoContacto"></form:errors>
						</div>
					</div>
				</div>
				<!-- Men� de Botones -->	
				<div class="row-fluid">
					<div class="span12">
						<div class="pull-right">
							<input type="submit" name="volver" value="<spring:message code="persona.form.datosPersona.botonVolver" />" class="btn btn-primary" />
							<input type="submit" name="update" type="button" value="<spring:message code="persona.form.datosPersona.botonSubmit" />" class="btn btn-primary" />
						</div>
					</div>
				</div>
			</fieldset>
		</form:form>
	</div>
</div>

