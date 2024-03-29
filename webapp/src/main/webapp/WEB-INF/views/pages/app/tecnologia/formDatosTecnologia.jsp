<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="${pageContext.request.contextPath}/static/js/app/tecnologia.js"></script>

<div class="container-fluid">
	<div class="row-fluid">
		<form:form name="form" id="datosTecnologia" commandName="datosTecnologia"	action="${pageContext.request.contextPath}/auth/tecnologia/edit" method="post" class="form">
			<input type="hidden" value=""/>
			<form:hidden path="id"/>
			<fieldset>
				<legend>
					<h4>Editar Tecnolog�a</h4>
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
				<!-- C�digo Tecnolog�a -->
				<div class="col-md-2">
					<div class="form-group">
						<label><spring:message code="tecnologia.form.datosTecnologia.codTecnologia"></spring:message></label>
						<form:input type="text" maxlength="50" path="codTecnologia" id="inputCodTecnologia" class="form-control" placeholder="C�digo Tecnolog�a"></form:input>
						<div class="text-danger">
							<form:errors path="codTecnologia"></form:errors>
						</div>
					</div>
				</div>
				<!-- Fecha �ltima Modificaci�n --> 
				<div class="col-md-2">
					<div class="form-group">
						<label for="fechaUltMod"><spring:message code="tecnologia.form.datosTecnologia.fechaUltMod" /></label>
						<form:input path="fechaUltMod" id="inputFechaUltMod" class="form-control" readonly="true" />
						<div class="text-danger">
							<form:errors path="fechaUltMod"></form:errors>
						</div>
					</div>
				</div>
				<!-- Descripci�n -->
				<div class="col-md-4">
					<div class="form-group">
						<label for="descripcion"><spring:message code="tecnologia.form.datosTecnologia.descripcion" /></label>
						<form:textarea maxlength="500" placeholder="Descripci�n de la Tecnolog�a" rows="5" cols="50" path="descripcion" id="textareatDescripcion" class="form-control" />
						<div class="text-danger">
							<form:errors path="descripcion"></form:errors>
						</div>
					</div>
				</div>
				<!-- Framework -->
				<div class="col-md-4">
					<div class="form-group">
						<label for="framework"><spring:message code="tecnologia.form.datosTecnologia.framework" /></label>
						<form:textarea maxlength="500" placeholder="Frameworks de la Tecnolog�a" rows="5" cols="50" path="framework" id="textareatFramework" class="form-control" />
						<div class="text-danger">
							<form:errors path="framework"></form:errors>
						</div>
					</div>
				</div>
				<!-- Men� de Botones -->	
				<div class="row-fluid">
					<div class="span12">
						<div class="pull-right">
							<a href="${pageContext.request.contextPath}/auth/tecnologia/return" class="btn btn-primary" title="Volver">Volver</a>
							<input type="submit" name="update" type="button" value="<spring:message code="tecnologia.form.datosTecnologia.botonSubmit" />" class="btn btn-primary" />
						</div>
					</div>
				</div>
			</fieldset>
		</form:form>
	</div>
</div>