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
	<div class="span12 form">
		<fieldset>
			<legend>
				<i class="icon-file icon-white">SINCRONIZACI�N CON JIRA</i>
			</legend>
			<div id="MostrarInformacion">
				<dl class="text-overflow">
					<dt>${RolesSincronizados}</dt>
				</dl>
				<dl class="text-overflow">
					<dt>${RolesPendienteSincronizar}</dt>
				</dl>
				</div>
		</fieldset>
	</div>

	<fieldset>
		<div class="text-danger">
			<form:errors path="rolesSeleccionados"></form:errors>
		</div>
		<form:form name="form" modelAttribute="form"
			action="${pageContext.request.contextPath}/auth/administracion/jira/roles"
			method="post" class="form">
			<c:if test="${Sincronizar}">
				<div class="row-fluid">
					<div class="span12">
						<div class="pull-right">
							<input type="submit" value="Sincronizar" class="btn btn-primary" />
						</div>
					</div>
				</div>
			</c:if>
			<br/>
			<!-- -------------------------------------------------------------------------------------  -->
			<!-- COMIENZO DE GRID DE DATOS                                                              -->
			<!-- -------------------------------------------------------------------------------------  -->
			<div class="row-fluid">
				<div class="span12 form">
					<c:if test="${not empty listRoles}">
						<div class="display-table">
							<display:table name="listRoles" requestURI="" id="roles" 
								export="false" pagesize="${pagination}" class="table table-striped table-bordered table-hover" defaultsort="2"
								 defaultorder="ascending" >
								<display:caption>
									<h2>Roles</h2>
								</display:caption>
								<display:column   media="html" title="<input type='checkbox' id='checkAll' />" >
									<form:checkbox path="rolesSeleccionados" value="${roles.nombre}" />
������� ������� ������� �����</display:column>
								<display:column property="nombre" headerClass="sortable"
									sortable="true" title="Nombre" />

								<display:column property="fechaAlta" headerClass="sortable" format="{0,date,MM/dd/yyyy}"
									sortable="true" title="Fecha Alta" />
								<display:column property="descripcion" headerClass="sortable"
									sortable="true" title="Descripci�n" />

								<display:column property="sincronizado" headerClass="sortable"
									sortable="true" title="�Est� Sincronizado?" />

							</display:table>
						</div>
					</c:if>
					<br />

				</div>
			</div>

			<br />
		
		</form:form>
	</fieldset>
	<br />
</div>

