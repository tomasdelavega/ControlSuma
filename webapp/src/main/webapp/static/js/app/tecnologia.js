/**
 * Fichero Javascript para tecnología
 */

/**
 * Método para limpiar los filtros de la página de listado de Tecnologías
 */

$(document).ready(function(){
	$('#btnReset').bind('click', function(){
		$('#inputCodTecnologia').prop('value','');
		$('#inputId').prop('value','');
	});
});

$(document).ready(function(){
	$('#btnResetFormEdit').bind('click', function(){
		$('#inputCodTecnologia').prop('value','');
		$('#textareatDescripcion').prop('value','');
		$('#inputFechaAlta').prop('value','');
	});
});

