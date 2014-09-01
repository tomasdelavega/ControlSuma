<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>




<!-- -------------------------------------------------------------------------------------  -->
<!-- COMIENZO DE GRID DE DATOS                                                              -->
<!-- -------------------------------------------------------------------------------------  -->
<c:if test="${not empty listRoles}">
<div class="container">
<div class="row-fluid">
	<div class="span2"></div>
		<div class="row-fluid">
			<div class="span12 form">
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
				<div class="display-table">
					<display:table name="listRoles" requestURI="" id="rol" pagesize="10" class="table table-striped table-bordered table-hover" defaultsort="1" export="true" defaultorder="ascending">
						<display:caption>
							<h2>Lista de Roles</h2>
						</display:caption>
						<display:setProperty name="basic.empty.showtable" value="true" />
						<display:column property="nombre" title="Nombre" headerClass="sortable" sortable="true" />
						<display:column property="fechaUltMod" title="Fecha de �ltima Modificaci�n" headerClass="sortable" sortable="true" format="{0,date,MM/dd/yyyy}"/>
						<display:column property="descripcion" title="Descripci�n" headerClass="sorteable" sortable="true" />
						<sec:authorize access="hasAnyRole('ROLE_CONTROLSUMA.GESTOR','ROLE_CONTROLSUMA.ADMIN')">
							<display:column media="html" title="Acciones">
								<a href="${pageContext.request.contextPath}/auth/rol/edit?id=${rol.id}" class="btn btn-xs btn-info" title="Editar">
								<i class="icon-folder-open icon-white"></i> <span class="glyphicon glyphicon-edit"></span></a>
								<a href="${pageContext.request.contextPath}/auth/rol/delete?id=${rol.id}" class="btn btn-xs btn-info" title="Eliminar" onclick="return confirm('�Est�s seguro de eliminar ${rol.nombre} ?')">
								<i class="icon-folder-open icon-white"></i> <span class="glyphicon glyphicon-trash"></span></a>
							</display:column>
						</sec:authorize>
					</display:table>
				</div>
			</div>
		</div>
	</div>
</div>
</c:if>
<c:if test="${empty listRoles}">
	<div class="container content" role="main">
		<div class="row"></div>  
		<div class="alert alert-danger info-entrada">
	 		<div class="text-center"><h4>No hay Registros</h4></div>
		</div>
	</div>
</c:if>