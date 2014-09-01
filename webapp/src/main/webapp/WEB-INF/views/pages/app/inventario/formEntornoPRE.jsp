

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<div class="container-fluid">
	<div class="row-fluid">


		<form:form name="form" id="datosEntornoPRE"
			commandName="datosEntornoPRE"
			action="${pageContext.request.contextPath}/auth/inventario/edit/entorno?id=${datosInventario.id}&p=DatosEntornoPRE"
			method="post" class="form">
			<input type="hidden" value="" />
			<form:hidden path="id" />
			<form:hidden path="tEntorno" id="inputTEntorno" />
			<form:hidden path="idInventario" />
			
			<fieldset>
				<%-- 		<legend>
						<spring:message code="inventario.form.datosEntorno.tEntorno" />
					</legend> --%>
				<div class="row">

					<div class="col-md-3">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.fechaAlta" /></label>
							<form:input path="fechaAlta" id="inputFechaAlta" placeholder="Sin guardar" 
								cssClass="form-control" disabled="true" />
						</div>
					</div>

					<div class="col-md-3">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.fechaUltMod" /></label>
							<form:input path="fechaUltMod" id="inputFechaUltMod" placeholder="Sin guardar" 
								cssClass="form-control" disabled="true" />
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.confLdap" /></label>
							<form:textarea path="confLdap" id="inputConfLdap"
								cssClass="form-control"  />
							<div class="text-danger">
								<form:errors path="confLdap"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.datosBbdd" /></label>
							<form:textarea path="datosBbdd" id="inputDatosBbdd"
								cssClass="form-control" />
							<div class="text-danger">
								<form:errors path="datosBbdd"></form:errors>
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.frameworks" /></label>
							<form:textarea path="frameworks" id="inputFrameworks"
								cssClass="form-control"  />
							<div class="text-danger">
								<form:errors path="frameworks"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.herramientaConstruccion" /></label>
							<form:textarea path="herramientaConstruccion"
								id="inputHerramientaConstruccion" cssClass="form-control"
							 />
							<div class="text-danger">
								<form:errors path="herramientaConstruccion"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.observaciones" /></label>
							<form:textarea path="observaciones" id="inputObservaciones"
								cssClass="form-control"  />
							<div class="text-danger">
								<form:errors path="observaciones"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.rutaLog" /></label>
							<form:textarea path="rutaLog" id="inputRutaLog"
								cssClass="form-control"  />
							<div class="text-danger">
								<form:errors path="rutaLog"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.rutaSvn" /></label>
							<form:textarea path="rutaSvn" id="inputRutaSvn"
								cssClass="form-control" />
							<div class="text-danger">
								<form:errors path="rutaSvn"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.servidorDespliegue" /></label>
							<form:textarea path="servidorDespliegue"
								id="inputServidorDespliegue" cssClass="form-control"
							 />
							<div class="text-danger">
								<form:errors path="servidorDespliegue"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.url" /></label>
							<form:textarea path="url" id="inputUrl"
								cssClass="form-control" />
							<div class="text-danger">
								<form:errors path="url"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-5">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosEntorno.versionJava" /></label>
							<form:input path="versionJava" id="inputVersionJava"
								cssClass="form-control"  />
							<div class="text-danger">
								<form:errors path="versionJava"></form:errors>
							</div>
						</div>
					</div>

				</div>



				<div class="row-fluid">
					<div class="span12">
						<div class="pull-right">
							<input type="submit"
								value=<spring:message
										code="inventario.form.datosInventario.botonSubmit" />
								class="btn btn-primary" />
						</div>
					</div>

				</div>
				</fieldset>
		</form:form>

	</div>
</div>