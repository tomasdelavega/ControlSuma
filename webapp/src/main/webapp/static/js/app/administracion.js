/**
 * Fichero Javascript para la Administración
 */


function administracionCargaDatos(){
	$.ajax({
		url: $('#adminitracion.jira.proyectos.action').attr("href"),
		type: "GET",
		
		processData: false,
		async:false,
		success: function( data ) {

			$("#adminitracion.jira.proyectos.respuesta").html(data);
			
		}
	});
}
$(document).ready(function() {
	$('#adminitracion.jira.proyectos.action').bind('click', function() {
		administracionCargaDatos(this);
	});
	
	$('#adminitracion.jira.proyectos.action').bind('click', function() {
		administracionCargaDatos(this);
	});
	
	$("#checkAll").change(function () {
	    $("input:checkbox").prop('checked', $(this).prop("checked"));
	});
	
	 $("input:checkbox").prop('checked', false);

});


