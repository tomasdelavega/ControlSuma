
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="container content" role="main">
	<div class="loginbox">		
		<h3><spring:message code="app.login.title"/></h3>
		<span><spring:message code="app.login.heading.credenciales"/></span>
		<form name="login" id="login" class="login-form" action="${pageContext.request.contextPath}/j_spring_security_check" method="post" role="form">
			<div class="form-group">
				<div class="row">
					<div class="col-md-8">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
<%-- 							<input id="username" name="j_username" type="text" class="form-control" placeholder="<spring:message code="app.login.placeholder.usuario.codigo"/>"/>
 --%>							<input id="username" name="j_username" value="administrador" type="text" class="form-control" placeholder="<spring:message code="app.login.placeholder.usuario.codigo"/>"/>

						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-8">
						<div class="input-group">
							<span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
<%-- 							<input id="password" name="j_password" type="password" class="form-control" placeholder="<spring:message code="app.login.placeholder.usuario.password"/>"/>
 --%>							<input id="password" value="administrador" name="j_password" type="password" class="form-control" placeholder="<spring:message code="app.login.placeholder.usuario.password"/>"/>

						</div>
					</div>						
					<div class="col-md-4" style="text-align:center;">
						<input type="submit" name="submit" value="<spring:message code="app.login.button.acceder"/>" class="btn btn-primary"/>
					</div>								
				</div>
			</div>
			<div class="form-group">
				<div class="row">
					<ul id="messageBox" class="text-error">					
						<!--  Errores de autenticacion en spring security -->
						<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION.message}">
							<li><label generated="true" class="error" style="display: inline-block;">${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</label></li>
						</c:if>
					</ul>	
				</div>	
			</div>
			</div>			
		</form>
	</div>
	
	<div class="loginpie">
		<a href="<spring:message code="sistemas.global.ldap.changepassword.url"/>" target="_blank">
			<spring:message code="app.login.link.password.recordar"/>
		</a> | 
		<a href="<spring:message code="sistemas.global.ldap.rememberpassword.url"/>" target="_blank">
			<spring:message code="app.login.link.password.cambiar"/>
		</a>		
	</div>
</div><!-- /.container -->

<div class="container">
	<div class="row">
		<div id="textoEntrada"><spring:message code="app.avisolegal"/></div>
	</div>

	<div class="alert alert-info info-entrada">
		<button type="button" class="close" data-dismiss="alert">&times;</button>
		<p>Cualquier duda en relaci&oacute;n a este servicio ser&aacute; resuelta por el <b><a href="mailto:<spring:message code="app.technical.email"/>"><spring:message code="app.technical.support"/></a></b> en el siguiente n&uacute;mero de tel&eacute;fono <spring:message code="app.technical.tlf"/></p>		
	</div> 	
	
	<div class="footer">
		<p class="text-center"><spring:message code="app.name.abrev"/> <spring:message code="app.login.label.version"/>: <spring:message code="app.version"/> (<spring:message code="app.last.release"/>)</p>
	</div>	
</div><!-- /.container -->
