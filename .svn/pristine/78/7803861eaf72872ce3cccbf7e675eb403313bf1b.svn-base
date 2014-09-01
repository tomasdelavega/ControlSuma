/**
 * Fichero Javascript para el inventario
 */

/**
 * Méotodo para limpiar los filtros de la pagína de listado
 */
function limpiarFiltro() {
	$('#inputCodInventario').prop('value', '');
	$('#inputCodJira').prop('value', '');
	$('#inputNombreInventario').prop('value', '');
	$('#inputAreaFuncional').prop('value', '');

}

/**
 * Método para activar/desactivar las pestañas del formulario de Inventario
 */
$(function() {

	var tipoInventario = $('#tipoFormulario').val();

	if (tipoInventario == "create") {
		$('.pestanasInventario').removeClass('active').addClass('disabledTab');
	} else if (tipoInventario == "update") {
		$('.pestanasInventario').removeClass('disabledTab').removeClass(
				'disabled');
	}
	var pestana2 = getURLParameter('p');
	if (pestana2 != null) {
		$('a[href=#'+pestana2+']').tab('show');
		//prueba.tab('show');
	}
});

$(function() {

	$("[id*=fechaAct]")
			.datepicker(
					{
						dateFormat : 'dd/mm/yy',
						firstDay : 1,
						dayNamesMin : [ "Dom", "Lun", "Mar", "Mie", "Jue",
								"Vie", "Sab" ],
						monthNames : [ "Enero", "Febrero", "Marzo", "Abril",
								"Mayo", "Junio", "Julio", "Agosto",
								"Septiembre", "Octubre", "Noviembre",
								"Diciembre" ]
					});
});

$(document).ready(function() {

	$('#btnReset').bind('click', function() {
		limpiarFiltro();
	});

	// revisarTab();

});

function getURLParameter(name) {
	  return decodeURI(
	   (RegExp(name + '=' + '(.+?)(&|$)').exec(location.search)||[,null])[1]
	   );
	}
