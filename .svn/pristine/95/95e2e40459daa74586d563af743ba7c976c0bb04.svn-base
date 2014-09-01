<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ attribute name="name" required="true" rtexprvalue="true" %>
<%@ attribute name="label" required="true" rtexprvalue="true" %>
<%@ attribute name="value" required="false" rtexprvalue="true" %>
<%@ attribute name="readonly" required="false" rtexprvalue="true" type="java.lang.Boolean"%>
<%@ attribute name="required" required="false" rtexprvalue="true" type="java.lang.Boolean"%>


<c:choose >
	<c:when test="${!readonly}">
		<label for="input-${name}">${label} <c:if test="${required == null || required}"><span class="required">*</span></c:if></label>
		<div class="input-prepend">
		<span class="add-on"><i class="icon-calendar"></i></span>
		<form:input path="${name}" id="input-${name}" cssClass="input-small" readonly="true" style="background:white;" value="${value}"/>										
		</div>
		<form:errors path="${name}" cssClass="alert" />
	</c:when>
	<c:otherwise>
		<label for="input-${name}">${label} <c:if test="${required == null || required}"><span class="required">*</span></c:if></label>
		<div class="readOnlyField">
		${value}
		</div>
	</c:otherwise>
</c:choose>
	