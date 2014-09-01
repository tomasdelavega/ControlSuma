<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="html" tagdir="/WEB-INF/tags/html"%>



<div class="container-fluid">
	<div class="row-fluid">
		<form:form name="form" id="datosInformacionAdicional"
			commandName="datosInformacionAdicional"
			action="${pageContext.request.contextPath}/auth/inventario/edit/info?id=${datosInventario.id}&p=InformacionAdicional"
			method="post" class="form">
			<input type="hidden" value="" />
			<form:hidden path="id" />
			<fieldset>
				<div class="row">
					<div class="col-md-2">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosInformacionAdicional.fechaUltMod" /></label>
							<form:input path="fechaUltMod" id="inputFechaUltMod"
								cssClass="form-control" disabled="true"
								placeholder="Sin guardar" />
							<div class="text-danger">
								<form:errors path="fechaUltMod"></form:errors>
							</div>
						</div>
					</div>
					<div class="col-md-2">
						<div class="form-group">
							<label><spring:message
									code="inventario.form.datosInformacionAdicional.tipoTransicion" /></label>
							<form:select path="tipoTransicion" id="tipoTransicionSelect"
								cssClass="form-control">
								<form:option value="" label="Seleccionar"></form:option>
								<form:options items="${listTipoTrancision}" />
							</form:select>
							<div class="text-danger">
								<form:errors path="tipoTransicion"></form:errors>
							</div>
						</div>
					</div>
				</div>


				<fieldset>
					<legend> Situación para Mantenimiento </legend>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.mantCorrectivoPrevisto" /></label>
								<form:select path="mantCorrectivoPrevisto"
									id="mantCorrectivoPrevistoSelect" cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listLogicos}" />
								</form:select>


								<div class="text-danger">
									<form:errors path="mantCorrectivoPrevisto"></form:errors>
								</div>
							</div>
						</div>
						<div class="col-md-8">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.correctivo" /></label>
								<form:textarea path="correctivo" id="inputCorrectivo"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="correctivo"></form:errors>
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.mantEvolutivoPrevisto" /></label>
								<form:select path="mantEvolutivoPrevisto"
									id="mantEvolutivoPrevistoSelect" cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listLogicos}" />
								</form:select>
								<div class="text-danger">
									<form:errors path="mantEvolutivoPrevisto"></form:errors>
								</div>
							</div>
						</div>
						<div class="col-md-8">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.evolutivo" /></label>
								<form:textarea path="evolutivo" id="inputEvolutivo"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="evolutivo"></form:errors>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.nivelIncidencias" /></label>
								<form:select path="nivelIncidencias" id="nivelIncidenciasSelect"
									cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listNivelIncidencias}" />
								</form:select>
								<div class="text-danger">
									<form:errors path="nivelIncidencias"></form:errors>
								</div>
							</div>
						</div>
						<div class="col-md-8">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.periodoUsoAplicacion" /></label>
								<form:textarea path="periodoUsoAplicacion"
									id="inputPeriodoUsoAplicacion" cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="periodoUsoAplicacion"></form:errors>
								</div>
							</div>
						</div>

					</div>



					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.integracion" /></label>
								<form:select path="integracion" id="integracionSelect"
									cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listNivelIntegracion}" />
								</form:select>
								<div class="text-danger">
									<form:errors path="integracion"></form:errors>
								</div>
							</div>
						</div>
						<div class="col-md-8">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.detalleIntegracion" /></label>
								<form:textarea path="detalleIntegracion"
									id="inputDetalleIntegracion" cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="detalleIntegracion"></form:errors>
								</div>
							</div>
						</div>

					</div>




					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.incidencia" /></label>
								<form:select path="incidencia" id="incidenciasSelect"
									cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listLogicos}" />
								</form:select>
								<div class="text-danger">
									<form:errors path="incidencia"></form:errors>
								</div>
							</div>
						</div>
						<div class="col-md-8">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.detalleIncidencia" /></label>
								<form:textarea path="detalleIncidencia"
									id="inputDetalleIncidencia" cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="detalleIncidencia"></form:errors>
								</div>
							</div>
						</div>
					</div>



					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.requiereSW" /></label>
								<form:select path="requiereSW" id="requiereSWSelect"
									cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listLogicos}" />
								</form:select>
								<div class="text-danger">
									<form:errors path="incidencia"></form:errors>
								</div>
							</div>
						</div>
						<div class="col-md-8">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.inventarioObjetos" /></label>
								<form:textarea path="inventarioObjetos"
									id="inputInventarioObjetos" cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="inventarioObjetos"></form:errors>
								</div>
							</div>
						</div>
					</div>




					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.garantia" /></label>
								<form:select path="garantia" id="garantiaSelect"
									cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listLogicos}" />
								</form:select>
								<div class="text-danger">
									<form:errors path="garantia"></form:errors>
								</div>
							</div>
						</div>
						<div class="col-md-8">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.detalleGarantia" /></label>
								<form:textarea path="detalleGarantia" id="inputDetalleGarantia"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="detalleGarantia"></form:errors>
								</div>
							</div>
						</div>
					</div>
				</fieldset>



				<fieldset>
					<legend> Estado de Documentación</legend>

					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.docAnalisisFuncional" /></label>
								<form:select path="docAnalisisFuncional"
									id="docAnalisisFuncionalSelect" cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listLogicos}" />
								</form:select>
								<div class="text-danger">
									<form:errors path="docAnalisisFuncional"></form:errors>
								</div>
							</div>
						</div>

						<div class="col-md-3">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.fechaUltActAnalisisFuncional" /></label>
								<form:input path="fechaUltActAnalisisFuncional"
									id="fechaActAnalisisFuncional inputFechaUltActAnalisisFuncional" 
									cssClass="form-control" />



								<div class="text-danger">
									<form:errors path="fechaUltActAnalisisFuncional"></form:errors>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.analisisFuncionalvaloracion" /></label>
								<form:textarea path="analisisFuncionalvaloracion"
									id="inputAnalisisFuncionalvaloracion" cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="analisisFuncionalvaloracion"></form:errors>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.detalleAnalisis" /></label>
								<form:textarea path="detalleAnalisis" id="inputDetalleAnalisis"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="detalleAnalisis"></form:errors>
								</div>
							</div>
						</div>
					</div>


					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.docDisenoTecnico" /></label>
								<form:select path="docDisenoTecnico" id="docDisenoTecnicoSelect"
									cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listLogicos}" />
								</form:select>
								<div class="text-danger">
									<form:errors path="docDisenoTecnico"></form:errors>
								</div>
							</div>
						</div>

						<div class="col-md-3">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.fechaUltActDiseno" /></label>
								<form:input path="fechaUltActDiseno"
									id="fechaActUltActDiseno inputFechaUltActDiseno"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="fechaUltActDiseno"></form:errors>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.valoracionDiseno" /></label>
								<form:textarea path="valoracionDiseno" id="inputValoracionDiseno"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="valoracionDiseno"></form:errors>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.detalleDiseno" /></label>
								<form:textarea path="detalleDiseno" id="inputDetalleDiseno"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="detalleDiseno"></form:errors>
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.docPlanPruebas" /></label>
								<form:select path="docPlanPruebas" id="docPlanPruebasSelect"
									cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listLogicos}" />
								</form:select>
								<div class="text-danger">
									<form:errors path="docPlanPruebas"></form:errors>
								</div>
							</div>
						</div>
						
						<div class="col-md-3">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.fechaUltActPlanPrueba" /></label>
								<form:input path="fechaUltActPlanPrueba"
									id="fechaActPlanPrueba inputFechaUltActPlanPrueba"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="fechaUltActPlanPrueba"></form:errors>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
					<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.valoracionPlanPrueba" /></label>
								<form:textarea path="valoracionPlanPrueba"
									id="inputValoracionPlanPrueba" cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="valoracionPlanPrueba"></form:errors>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.detallePlanPrueba" /></label>
								<form:textarea path="detallePlanPrueba"
									id="inputDetallePlanPrueba" cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="detallePlanPrueba"></form:errors>
								</div>
							</div>
						</div>
					</div>


					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.docManualInstalacion" /></label>
								<form:select path="docManualInstalacion"
									id="docManualInstalacionSelect" cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listLogicos}" />
								</form:select>
								<div class="text-danger">
									<form:errors path="docManualInstalacion"></form:errors>
								</div>
							</div>
						</div>

						
						<div class="col-md-2">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.fechaUltActManualInstalacion" /></label>
								<form:input path="fechaUltActManualInstalacion"
									id="fechaActManualInstalacion inputFechaUltActManualInstalacion"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="fechaUltActManualInstalacion"></form:errors>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
					<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.valoracionManualInstalacion" /></label>
								<form:textarea path="valoracionManualInstalacion"
									id="inputValoracionManualInstalacion" cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="valoracionManualInstalacion"></form:errors>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.detalleManualInstalacion" /></label>
								<form:textarea path="detalleManualInstalacion"
									id="inputDetalleManualInstalacion" cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="detalleManualInstalacion"></form:errors>
								</div>
							</div>
						</div>
					</div>
				</fieldset>


				<fieldset>
					<legend>Calidad de la Aplicacion</legend>


					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.rutaDoc" /></label>
								<form:input path="rutaDoc" id="inputRutaDoc"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="rutaDoc"></form:errors>
								</div>
							</div>
						</div>
					</div>




					<div class="row">

						<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.nivelCalidadCodigo" /></label>
								<form:textarea path="nivelCalidadCodigo"
									id="inputNivelCalidadCodigo" cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="nivelCalidadCodigo"></form:errors>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.docuCodigo" /></label>
								<form:textarea path="docuCodigo" id="inputDocuCodigo"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="docuCodigo"></form:errors>
								</div>
							</div>
						</div>


					</div>

					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.trabajosVuelo" /></label>
								<form:select path="trabajosVuelo" id="trabajosVueloSelect"
									cssClass="form-control">
									<form:option value="" label="Seleccionar"></form:option>
									<form:options items="${listLogicos}" />
								</form:select>
								<div class="text-danger">
									<form:errors path="trabajosVuelo"></form:errors>
								</div>
							</div>
						</div>
						<div class="col-md-8">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.descripciontrabajosVuelo" /></label>
								<form:textarea path="descripciontrabajosVuelo"
									id="inputDescripciontrabajosVuelo" cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="descripciontrabajosVuelo"></form:errors>
								</div>
							</div>
						</div>
					</div>




					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label><spring:message
										code="inventario.form.datosInformacionAdicional.observaciones" /></label>
								<form:textarea path="observaciones" id="inputObservaciones"
									cssClass="form-control" />
								<div class="text-danger">
									<form:errors path="observaciones"></form:errors>
								</div>
							</div>
						</div>
					</div>

					<!-- Campo oculto con el id del inventario -->
					<div class="col-md-7">
						<div class="form-group">
							<form:input path="idInventario" type="hidden"
								id="inputIdInventario" cssClass="form-control"
								placeholder="Obligatorio" />
							<div class="text-danger">
								<form:errors path="idInventario"></form:errors>
							</div>
						</div>
					</div>
					<!-- Fin campo oculto  -->

					<div class="row-fluid">
						<div class="span12">
							<div class="pull-right">
								<input type="submit"
									value=<spring:message
										code="inventario.form.datosInformacionAdicional.botonSubmit" />
									class="btn btn-primary" />
							</div>
						</div>

					</div>
				</fieldset>
		</form:form>



	</div>
</div>
