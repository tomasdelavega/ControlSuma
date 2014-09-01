<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container-fluid">
	<div class="row-fluid">
		<form:form name="form" id="tecnologia" commandName="tecnologia"	action="${pageContext.request.contextPath}/auth/tecnologia/add" method="post" class="form">
			<input type="hidden" value=""/>
			<form:hidden path="id"/>
			<fieldset>
				<legend>
					<h4>Editar Tecnología</h4>
				</legend>
				<!-- Código Tecnología -->
				<div class="col-md-2">
					<div class="form-group">
						<label><spring:message code="tecnologia.form.datosTecnologia.codTecnologia"></spring:message></label>
						<form:input type="text" maxlength="50" path="codTecnologia" id="inputCodTecnologia" class="form-control" placeholder="Código Tecnología"></form:input>
						<div class="text-danger">
							<form:errors path="codTecnologia"></form:errors>
						</div>
					</div>
				</div>
				<!-- Descripción -->
				<div class="col-md-5">
					<div class="form-group">
						<label for="descripcion"><spring:message code="tecnologia.form.datosTecnologia.descripcion" /></label>
						<form:textarea maxlength="500" placeholder="Descripción de la Tecnología" rows="5" cols="50" path="descripcion" id="textareatDescripcion" class="form-control" />
						<div class="text-danger">
							<form:errors path="descripcion"></form:errors>
						</div>
					</div>
				</div>
				<!-- Framework -->
				<div class="col-md-5">
					<div class="form-group">
						<label for="framework"><spring:message code="tecnologia.form.datosTecnologia.framework" /></label>
						<form:textarea maxlength="500" placeholder="Frameworks de la Tecnología" rows="5" cols="50" path="framework" id="textareatFramework" class="form-control" />
						<div class="text-danger">
							<form:errors path="framework"></form:errors>
						</div>
					</div>
				</div>
				<!-- Menú de Botones -->	
				<div class="row-fluid">
					<div class="span12">
						<div class="pull-right">
							<a href="${pageContext.request.contextPath}/auth/tecnologia/return" class="btn btn-primary" title="Volver">Volver</a>
							<%--<input  type="submit" name="volver" value="<spring:message code="tecnologia.form.datosTecnologia.botonVolver" />" class="btn btn-primary" />--%>
							<input type="submit" name="agregar" type="button" value="<spring:message code="tecnologia.form.datosTecnologia.botonSubmit" />" class="btn btn-primary" />
						</div>
					</div>
				</div>
			</fieldset>
		</form:form>
	</div>
</div>
<c:if test="${mensajeError != null}">
	<br />
	<div class="alert alert-danger">${mensajeError}</div>
</c:if>

<c:if test="${mensajeInfo != null}">
	<br />
	<div class="alert alert-info">${mensajeInfo}</div>
</c:if>