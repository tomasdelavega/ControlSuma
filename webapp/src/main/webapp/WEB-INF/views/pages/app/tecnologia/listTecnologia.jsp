<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>

<script src="${pageContext.request.contextPath}/static/js/app/tecnologia.js"></script>

<c:if test="${not empty listTecnologias}">
		<div class="container">
		<div class="row-fluid">
			<div class="span2"></div>
			<%--  
			<div class="span8">
				<form:form name="form" id="filtroTecnologia" commandName="filtroTecnologia" 
					action="${pageContext.request.contextPath}/auth/tecnologia/search#search"
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
										<label>C�digo:</label>
									</center>
									<span class="add-on"><i class="icon-barcode"></i></span>
									<form:input path="codTecnologia" id="inputCodTecnologia" cssClass="input-small input-usuario"	placeholder="C�digo de Tecnolog�a" />
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
			<!-- -------------------------------------------------------------------------------------  -->
			<!-- COMIENZO DE GRID DE DATOS                                                              -->
			<!-- -------------------------------------------------------------------------------------  -->
			<div class="row-fluid">
				<div class="span12">
					<div class="pull-right">
						<br/>
						<a href="${pageContext.request.contextPath}/auth/tecnologia/add"  title="A�adir"><strong>A�adir Tecnolog�a</strong></a>
					</div>
				</div>
				<div class="span12 form">
					<div class="display-table">
						<display:table name="listTecnologias" requestURI="" id="tecnologia" pagesize="10" class="table table-striped table-bordered table-hover" defaultsort="1" export="true" defaultorder="ascending">
							<display:caption>
								<h2>Lista de Tecnolog�as</h2>
							</display:caption>
							<display:setProperty name="basic.empty.showtable" value="true" />
							<display:column property="codTecnologia" title="C�digo Tecnolog�a" headerClass="sortable" sortable="true" />
							<display:column property="descripcion" title="Descripcion" headerClass="sortable" sortable="true" />
							<display:column property="framework" title="Framework" headerClass="sortable" sortable="true"></display:column>
							<sec:authorize access="hasAnyRole('ROLE_CONTROLSUMA.GESTOR','ROLE_CONTROLSUMA.ADMIN')">
								<display:column media="html" title="Acciones">
									<a href="${pageContext.request.contextPath}/auth/tecnologia/edit?id=${tecnologia.id}" class="btn btn-xs btn-info" title="Editar">
									<i class="icon-folder-open icon-white"></i> <span class="glyphicon glyphicon-edit"></span></a>
									<a href="${pageContext.request.contextPath}/auth/tecnologia/delete?id=${tecnologia.id}" class="btn btn-xs btn-info" title="Eliminar" onclick="return confirm('�Est�s seguro de eliminar ${tecnologia.codTecnologia} ?')">
									<i class="icon-folder-open icon-white"></i><span class="glyphicon glyphicon-trash"></span></a>
								</display:column>
							</sec:authorize>
						</display:table>
					</div>
				</div>
			</div>
		</div>
	</div>
</c:if>
<c:if test="${empty listTecnologias}">
	<div class="container content" role="main">
		<div class="row"></div>  
		<div class="alert alert-danger info-entrada">
	 		<div class="text-center"><h4>No hay Registros</h4></div>
		</div>
	</div>
</c:if>