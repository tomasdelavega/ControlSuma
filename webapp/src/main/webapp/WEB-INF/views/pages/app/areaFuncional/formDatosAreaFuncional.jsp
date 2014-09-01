<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="${pageContext.request.contextPath}/static/js/app/areaFuncional.js"></script>

<div class="container-fluid">
	<div class="row-fluid">
		<form:form name="form" id="datosAreaFuncional" commandName="datosAreaFuncional"	action="${pageContext.request.contextPath}/auth/areaFuncional/edit" method="post" class="form">
			<input type="hidden" value=""/>
			<form:hidden path="id"/>
			<fieldset>
				<legend>
					<h4>Editar Área Funcional</h4>
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
				<!-- Nombre -->
				<div class="col-md-6">
					<div class="form-group col-md-8">
						<label><spring:message code="areaFuncional.form.datosAreaFuncional.nombre"></spring:message></label>
						<form:input type="text" minlength="1" maxlength="100" path="nombre" id="inputNombre" class="form-control" placeholder="Nombre"></form:input>
						<div class="text-danger">
							<form:errors path="nombre"></form:errors>
						</div>
					</div>
				</div>
				<!-- Fecha Última Modificación -->
				<div class="col-md-6">
					<div class="form-group col-md-8">
						<label for="fechaUltMod"><spring:message code="areaFuncional.form.datosAreaFuncional.fechaUltMod"></spring:message></label>
						<form:input  path="fechaUltMod" id="inputFechaUltMod" class="form-control" readonly="true"></form:input>
						<div class="text-danger">
							<form:errors path="fechaUltMod"></form:errors>
						</div>
					</div>
				</div>
				<!-- Menú de Botones -->	
				<div class="row-fluid">
					<div class="span12">
						<div class="pull-right">
							<input type="submit" name="volver" value="<spring:message code="areaFuncional.form.datosAreaFuncional.botonVolver" />" class="btn btn-primary" /> 
							<input type="submit" name="update" type="button" value="<spring:message code="areaFuncional.form.datosAreaFuncional.botonSubmit" />" class="btn btn-primary" />
						</div>
					</div>
				</div>
			</fieldset>
		</form:form>
	</div>
</div>