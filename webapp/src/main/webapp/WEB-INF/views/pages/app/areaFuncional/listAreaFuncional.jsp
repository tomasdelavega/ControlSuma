<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>


<script src="${pageContext.request.contextPath}/static/js/app/areaFuncional.js"></script>

<c:if test="${not empty listAreas}">
		<div class="container">
		<div class="row-fluid">
			<div class="span2"></div>
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
			<%--  
			<div class="span8">
				<form:form name="form" id="filtroAreaFuncional" commandName="filtroAreaFuncional" 
					action="${pageContext.request.contextPath}/auth/areaFuncional/search#search"
					method="post" class="form">
					<fieldset>
						<legend id="legendfiltro">
							<i class="icon-search icon-white"></i>Filtro <span> <i
								id="imagenfiltroUp" class="icon-chevron-up icon-white"></i> <i
								id="imagenfiltroDown" class="icon-chevron-down icon-white"></i></span>

						</legend>
						
						<div class="row-fluid">
							<div class="col-md-2">
								<div class="input-prepend filterQuarterLine">
									<center>
										<label>Nombre:</label>
									</center>
									<span class="add-on"><i class="icon-barcode"></i></span>
									<form:input path="nombre" id="inputNombre" cssClass="input-small input-usuario"	placeholder="Nombre" />
								</div>
							</div>
							<div class="col-md-2">
								<div class="input-prepend filterQuarterLine">
									<center>
										<label>ID:</label>
									</center>
									<span class="add-on"><i class="icon-barcode"></i></span>
									<form:input path="id" id="inputId" cssClass="input-small input-usuario" placeholder="Identificador" />
								</div>
							</div>
						</div>
						<div class="row-fluid">
							
							<div class="span12">
								<div class="pull-right">
									<input id="btnReset" type="button" value="Limpiar" class="btn btn-primary" /> 
									<input type="submit" value="Filtrar" class="btn btn-primary" />
								</div>
							</div>
						</div>

					</fieldset>
				</form:form>
				<div class="span2"></div>
			</div>
			--%>
			<!-- -------------------------------------------------------------------------------------  -->
			<!-- COMIENZO DE GRID DE DATOS                                                              -->
			<!-- -------------------------------------------------------------------------------------  -->
			<div class="row-fluid">
				<div class="span12 form">
					<div class="display-table">
						<display:table name="listAreas" requestURI="" id="areaFuncional" pagesize="10" class="table table-striped table-bordered table-hover" defaultsort="1" export="true" defaultorder="ascending">
							<display:caption>
								<h2>Lista de �reas Funcionales</h2>
							</display:caption>
							<display:setProperty name="basic.empty.showtable" value="true" />
>							<display:column property="nombre" title="Nombre" headerClass="sortable" sortable="true" />
							<display:column property="fechaUltMod" title="Fecha �ltima Modificaci�n" headerClass="sortable" format="{0,date,MM/dd/yyyy}" sortable="true" />
							<sec:authorize access="hasAnyRole('ROLE_CONTROLSUMA.GESTOR','ROLE_CONTROLSUMA.ADMIN')">
								<display:column media="html" title="Acciones">
									<a href="${pageContext.request.contextPath}/auth/areaFuncional/edit?id=${areaFuncional.id}" class="btn btn-xs btn-info" title="Editar">
									<i class="icon-folder-open icon-white"></i> <span class="glyphicon glyphicon-edit"></span></a>
									<a href="${pageContext.request.contextPath}/auth/areaFuncional/delete?id=${areaFuncional.id}" class="btn btn-xs btn-info" title="Eliminar">
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
<c:if test="${empty listAreas}">
	<div class="container content" role="main">
		<div class="row"></div>  
		<div class="alert alert-danger info-entrada">
	 		<div class="text-center"><h4>No hay Registros</h4></div>
		</div>
	</div>
</c:if>