
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<div class="container content" role="main">
	<div class="row">
		<div class="col-md-4">	 
			<div class="alert alert-success">
				<p class="text-center"><strong>Informaci&oacute;n general</strong></p>
				<hr> 
				<p>nombre abreviado: <spring:message code="app.name.abrev"/></p>
				<p>versi&oacute;n: <spring:message code="app.version"/></p>ç
				<p>versi&oacute;n del arquetipo: 1.0.1</p>
				<c:set var="timeOut" scope="page" value="${pageContext.session.maxInactiveInterval/60}" />
				<p>tiempo m&aacute;ximo de inactividad: ${fn:substringBefore(timeOut,'.')} minutos</p>
				<p>fecha primera liberaci&oacute;n: <spring:message code="app.first.release"/></p>
				<p>fecha &uacute;ltima liberaci&oacute;n: <spring:message code="app.last.release"/></p>
				<p>n&uacute;mero de versiones liberadas: <spring:message code="app.num.release"/></p>
				<p>estado actual: <spring:message code="app.status"/></p> 
				<p class="text-center"><a href="${pageContext.request.contextPath}/auth/utils/changelog">registro de cambios</a></p> 
			</div>
		 
		</div>  
		<div class="col-md-8">	 
			<div class="alert alert-success">
				<p class="text-center"><strong>Informaci&oacute;n T&eacute;cnica</strong></p>
				<hr>
				<p>versi&oacute;n de java: <spring:message code="app.java.version"/></p>				
				<p>desarrollado por: <spring:message code="app.developBy"/></p>
				<p>supervisado por: <spring:message code="app.aprobedBy"/></p>
				<p>servidor de despliegue: <spring:message code="app.server.deploy"/></p>
				<p>framework base: <spring:message code="app.framework.base"/></p>
				<p>url framework base: <a href="<spring:message code='app.framework.base.url'/>" target="_blank"><spring:message code='app.framework.base.url'/></a></p>
				<p>frameworks js: <spring:message code="app.frameworks.js"/></p>
				<p>frameworks css: <spring:message code="app.frameworks.css"/></p>
			</div>
			
		</div>
	</div>

	<div class="row">
		<div class="alert alert-info col-md-12">
			<p class="text-center"><strong>Informaci&oacute;n  de contacto</strong></p>
			<hr>
			<p>en caso de error debe ponerse en contacto con <spring:message code="app.technical.support"/> en el siguiente n&uacute;mero de tel&eacute;fono <spring:message code="app.technical.tlf"/></p>
			<p>si quiere proponer alguna mejora puede ponerse en contacto con <spring:message code="app.improvements.user"/> escribiendo a la siguiente direci&oacute;n de email <a href="mailto:<spring:message code='app.improvements.email'/>"><spring:message code="app.improvements.email"/></a> o llamando al siguiente n&uacute;mero de tel&eacute;fono <spring:message code="app.improvements.tlf"/></p>
		</div>
	</div>
</div>
