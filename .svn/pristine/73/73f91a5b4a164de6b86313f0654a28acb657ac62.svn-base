<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<nav class="menubar" role="navigation">
	<div class="container">
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="${pageContext.request.contextPath}">
						<img
						src="${pageContext.request.contextPath}/static/images/home.png"
						alt="home" />&nbsp;Home
				</a></li>
				<li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Aplicaciones<b class="caret"></b></a>
					<ul class="dropdown-menu">

						<%-- <li><a href="${pageContext.request.contextPath}/auth/inventario/new">Nueva Aplicaci&oacute;n</a></li> --%>
						<li><a id="linkAplicaciones"
							href="${pageContext.request.contextPath}/auth/inventario/list">B&uacute;squeda
								de aplicaciones</a></li>
					</ul> <sec:authorize
						access="hasAnyRole('ROLE_CONTROLSUMA.GESTOR','ROLE_CONTROLSUMA.ADMIN')">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Tablas Maestras <b class="caret"></b></a>
							<ul class="dropdown-menu">

								<li><a href="${pageContext.request.contextPath}/auth/areaFuncional/listAreaFuncional">Áreas Funcionales</a></li>
								<li><a href="${pageContext.request.contextPath}/auth/persona/listPersona">Personas</a></li>
								<li><a href="${pageContext.request.contextPath}/auth/tecnologia/listTecnologia">Tecnología</a></li>
								<li><a href="${pageContext.request.contextPath}/auth/rol/listRol">Roles</a></li>
							</ul></li>
					</sec:authorize> <sec:authorize access="hasRole('ROLE_CONTROLSUMA.ADMIN')">
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Cargas JIRA<b class="caret"></b></a>
							<ul class="dropdown-menu">

								<li><a
									href="${pageContext.request.contextPath}/auth/administracion/jira/projects">Proyectos</a></li>
								<li><a href="${pageContext.request.contextPath}/auth/administracion/jira/roles">Roles</a></li>
								<li><a href="${pageContext.request.contextPath}/auth/administracion/jira/personas">Personas</a></li>


							</ul></li>
					</sec:authorize>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><spring:message
							code="app.menu.informacion.titulo" /> <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a
							href="${pageContext.request.contextPath}/auth/utils/changelog">
								<spring:message code="app.menu.informacion.changelog" />
						</a></li>
						<li><a
							href="${pageContext.request.contextPath}/auth/utils/informacion">
								<spring:message code="app.menu.informacion.tecnica" />
						</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
	<!-- /.container-fluid -->
</nav>

