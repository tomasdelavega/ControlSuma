<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>

<script
	src="${pageContext.request.contextPath}/static/js/app/administracion.js"></script>

<div class="container">

	<c:if test="${empty listaRoles}">
		<br />
		<div class="alert alert-danger">
			<spring:message code="cargajira.form.personas.warning.noRoles" />
		</div>
	</c:if>

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
	<form:form name="form" modelAttribute="form"
		action="${pageContext.request.contextPath}/auth/administracion/jira/personas"
		method="post" class="form">
		<fieldset>
			<fieldset>
				<legend>ROLES</legend>
				<div class="row-fluid">
					<div class="col-md-3">
						<label><spring:message
								code="cargajira.form.personas.analistafuncionalSUMA" /></label>
						<form:select path="analistafuncionalSUMA" cssClass="form-control">
							<form:option value="" label="No Sincronizar"></form:option>
							<form:options items="${listaRoles}" itemValue="codJira"
								itemLabel="nombre" />
						</form:select>
						<div class="text-danger">
							<form:errors path="analistafuncionalSUMA"></form:errors>
						</div>
					</div>
					<div class="col-md-3">
						<label><spring:message
								code="cargajira.form.personas.desarrolladores" /></label>
						<form:select path="desarrolladores" cssClass="form-control">
							<form:option value="" label="No Sincronizar"></form:option>
							<form:options items="${listaRoles}" itemValue="codJira"
								itemLabel="nombre" />
						</form:select>
						<div class="text-danger">
							<form:errors path="desarrolladores"></form:errors>
						</div>
					</div>
					<div class="col-md-3">
						<label><spring:message
								code="cargajira.form.personas.analistafuncionalGob" /></label>
						<form:select path="analistafuncionalGob" cssClass="form-control">
							<form:option value="" label="No Sincronizar"></form:option>
							<form:options items="${listaRoles}" itemValue="codJira"
								itemLabel="nombre" />
						</form:select>
						<div class="text-danger">
							<form:errors path="analistafuncionalGob"></form:errors>
						</div>
					</div>

					<div class="col-md-3">
						<label><spring:message
								code="cargajira.form.personas.usuarioFinal" /></label>
						<form:select path="usuarioFinal" cssClass="form-control">
							<form:option value="" label="No Sincronizar"></form:option>
							<form:options items="${listaRoles}" itemValue="codJira"
								itemLabel="nombre" />
						</form:select>
						<div class="text-danger">
							<form:errors path="usuarioFinal"></form:errors>
						</div>
					</div>

				</div>
				<br />
			</fieldset>
			<c:if test="${not empty listaRoles}">
				<div class="row-fluid">
					<div class="col-md-4">
						<div class="pull-left">
							<h4>Proyectos a Sincronizar: ${nProyectos}</h4>
						</div>
					</div>
					<div class="col-md-8">
						<div class="pull-right">
							<input type="submit" value="Sincronizar" class="btn btn-primary" />
						</div>
					</div>
				</div>
			</c:if>
			<br />

		</fieldset>
	</form:form>

	<br />
</div>

