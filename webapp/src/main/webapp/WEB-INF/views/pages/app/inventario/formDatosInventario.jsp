<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!-- <p>Date: <input type="text" id="inputDatepicker"></p> -->
<div class="container-fluid">
	<div class="row-fluid">
		<form:form name="form" id="datosInventario"
			commandName="datosInventario"
			action="${pageContext.request.contextPath}/auth/inventario/edit?id=${datosInventario.id}"
			method="post" class="form">
			<input type="hidden" value=""/>
			<form:hidden path="id"/>
			<fieldset>

				<div class="row">
					<div class="col-md-5">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosInventario.codInventario" /></label>
							<form:input path="codInventario" id="inputCodInventario"
								cssClass="form-control" placeholder="Obligatorio" />
							<div class="text-danger">
								<form:errors path="codInventario"></form:errors>
							</div>
						</div>
					</div>

					<div class="col-md-5">
						<div class="form-group">
							<label for="codJira"><spring:message
									code="inventario.form.datosInventario.codJira" /></label>

							<form:input path="codJira" id="inputCodJira"
								cssClass="form-control" readonly="true" />
							<form:hidden path="codJira" id="inputCodJira"
								cssClass="form-control" disabled="true" />
							<div class="text-danger">
								<form:errors path="codJira"></form:errors>
							</div>
						</div>
					</div>

					<div class="col-md-2">
						<div class="form-group">
							<label for="fechaAlta"><spring:message
									code="inventario.form.datosInventario.fechaUltMod" /></label>
							<form:input path="fechaUltMod" id="inputFechaUltMod"
								cssClass="form-control" readonly="true" />
							<div class="text-danger">
								<form:errors path="fechaAlta"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-10">
						<div class="form-group">
							<label for="nombreInventario"><spring:message
									code="inventario.form.datosInventario.nombreInventario" /></label>

							<form:input path="nombreInventario" id="inputNombreInventario"
								cssClass="form-control" placeholder="Obligatorio" readonly="true" />
							<div class="text-danger">
								<form:errors path="nombreInventario"></form:errors>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="form-group">
							<label for="version"><spring:message
									code="inventario.form.datosInventario.version" /></label>
							<form:input path="version" id="inputVersion"
								cssClass="form-control" />
							<div class="text-danger">
								<form:errors path="version"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label for="descripcion"><spring:message
									code="inventario.form.datosInventario.descripcion" /></label>
							<form:textarea path="descripcion" id="inputDescripcion"
								cssClass="form-control" />
							<div class="text-danger">
								<form:errors path="descripcion"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<label for="responsableSUMA"><spring:message
									code="inventario.form.datosInventario.responsableSUMA" /></label>
							<form:input path="responsableSUMA" id="inputResponsableSUMA"
								cssClass="form-control" placeholder="Sin Información"
								readonly="true" />
						
							<div class="text-danger">
								<form:errors path="responsableSUMA"></form:errors>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<label for="responsableGob"><spring:message
									code="inventario.form.datosInventario.responsableGob" /></label>
							<form:input path="responsableGob" id="inputResponsableGob"
								cssClass="form-control" placeholder="Sin Información"
								readonly="true" />
							<div class="text-danger">
								<form:errors path="responsableGob"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<label for="usuarioFinal"><spring:message
									code="inventario.form.datosInventario.usuarioFinal" /></label>
							<form:input path="usuarioFinal" id="inputUsuarioFinal"
								cssClass="form-control" placeholder="Sin Información"
								readonly="true" />
						
							<div class="text-danger">
								<form:errors path="usuarioFinal"></form:errors>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="form-group">
							<label for="tecnologia"><spring:message
									code="inventario.form.datosInventario.tecnologia" /></label>
							<%-- <form:input path="tecnologia" id="inputTecnologia"
								cssClass="form-control" placeholder="obligatorio" /> --%>
								<form:select path="tecnologia" id="tecnologiaSelect" cssClass="form-control">
										<form:option value="" label="Seleccionar"></form:option>
										<form:options items="${listTecnologia}" itemValue="id" itemLabel="codTecnologia"/>
								</form:select>
							<div class="text-danger">
								<form:errors path="tecnologia"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-5">
						<div class="form-group">
							<label for="areaFuncional"><spring:message
									code="inventario.form.datosInventario.areaFuncional" /></label>
							<%-- <form:input path="areaFuncional" id="inputAreaFuncional"
								cssClass="form-control" placeholder="obligatorio" /> --%>
								<form:select path="areaFuncional" id="AreaFuncionalSelect" cssClass="form-control">
										<form:option value="" label="Seleccionar"></form:option>
										<form:options items="${listAreaFuncional}" itemValue="id" itemLabel="nombre"/>
								</form:select>
							<div class="text-danger">
								<form:errors path="areaFuncional"></form:errors>
							</div>
						</div>
					</div>
					<div class="col-md-7">
						<div class="form-group">
							<label for="subAreaFuncional"><spring:message
									code="inventario.form.datosInventario.subAreaFuncional" /></label>
							<form:input path="subAreaFuncional" id="inputSubAreaFuncional"
								cssClass="form-control" />
							<div class="text-danger">
								<form:errors path="subAreaFuncional"></form:errors>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label for="observaciones"><spring:message
									code="inventario.form.datosInventario.observaciones" /></label>
							<form:textarea path="observaciones" id="inputObservaciones"
								cssClass="form-control" />
							<div class="text-danger">
								<form:errors path="observaciones"></form:errors>
							</div>
						</div>
					</div>
				</div>
				
				<!-- INICIO CAMPOS OCULTOS -->
	
			  <form:input path="idResponsableSUMA" type="hidden" id="inputIdResponsableSUMA"
					cssClass="form-control" placeholder="obligatorio" 
					/>							
				<form:input path="idResponsableGob" type="hidden"  id="inputIdResponsableGob"
					cssClass="form-control" placeholder="obligatorio"
					/>						
				<form:input path="idUsuarioFinal" type="hidden" id="inputIdUsuarioFinal"
					cssClass="form-control" placeholder="obligatorio" 
					 />		
				<form:input path="idTecnologia" type="hidden" id="inputIdTecnologia"
					cssClass="form-control" placeholder="obligatorio" 
					 />		
				<form:input path="activo" type="hidden"  id="inputActivo"
					cssClass="form-control" placeholder="Obligatorio" />

							
		<!-- FIN CAMPOS OCULTOS  -->
		
				<div class="row-fluid">
					<div class="span12">
						<div class="pull-left">
							<a href="${pageContext.request.contextPath}/auth/inventario/generarCertificado?id=${datosInventario.id}" target="_blank" class="btn btn-primary" title="Generar Certificado">Generar Certificado</a>
							<!-- <button type="button" class="btn btn-primary">Generar Certificado</button> -->
						</div>
						
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
