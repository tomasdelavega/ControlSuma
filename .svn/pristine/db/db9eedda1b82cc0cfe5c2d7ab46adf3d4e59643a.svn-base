package es.gobcantabria.aplicaciones.controlSuma.exception;


public class ControlSumaException extends Exception
{

    private static final long serialVersionUID = 1L;

    private ResultadosEnum resultado;


    /**
     * Metodo para controlar los errores de la aplicaicon
     * 
     * @param mensaje
     */
    public ControlSumaException(String mensaje)
    {

	super(mensaje);
    }


    /**
     * Metodo para controlar los errores de la aplicaicon
     * 
     * @param mensaje
     * @param ex
     */
    public ControlSumaException(String mensaje, Throwable ex)
    {

	super(mensaje, ex);
    }


    /**
     * Metodo para controlar los errores de la aplicaicon
     * 
     * @param resultado
     */
    public ControlSumaException(ResultadosEnum resultado)
    {

	super(resultado.getMensaje());
	this.resultado = resultado;
    }


    /**
     * Metodo para controlar los errores de la aplicaicon
     * 
     * @param resultado
     * @param ex
     */
    public ControlSumaException(ResultadosEnum resultado, Throwable ex)
    {

	super(resultado.getMensaje(), ex);
	this.resultado = resultado;
    }


    /**
     * Metodo para controlar los errores de la aplicaicon
     * 
     * @return
     */
    public ResultadosEnum getResultado()
    {

	return resultado;
    }


    /**
     * Metodo para controlar los errores de la aplicaicon
     * 
     * @param resultado
     */
    public void setResultado(ResultadosEnum resultado)
    {

	this.resultado = resultado;
    }
}
