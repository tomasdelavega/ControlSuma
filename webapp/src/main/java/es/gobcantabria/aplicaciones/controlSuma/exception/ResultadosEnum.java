package es.gobcantabria.aplicaciones.controlSuma.exception;


public enum ResultadosEnum
{

    BD001_ERROR_CONEXION_BD("BD001", "Error de conexión a Base de datos", "3"),

    BD002_ERROR_TRANSACCION("BD002", "Se ha producido un error en la transacción", "3"),

    BD003_ERROR_SQL("BD003", "Se ha producido un error SQL", "3")

    ;

    private final String mensaje;

    private final String codigo;

    private final String tipo;


    ResultadosEnum(String codigo, String mensaje, String tipo)
    {

	this.mensaje = mensaje;

	this.codigo = codigo;

	this.tipo = tipo;

    }


    /**
     * @return the mensaje
     */
    public String getMensaje()
    {

	return mensaje;
    }


    /**
     * @return the codigo
     */
    public String getCodigo()
    {

	return codigo;
    }


    /**
     * @return the tipo
     */
    public String getTipo()
    {

	return tipo;
    }

}