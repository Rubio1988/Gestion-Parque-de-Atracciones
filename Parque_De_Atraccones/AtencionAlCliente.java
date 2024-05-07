
/**
 * Subclase de la clase trabajadores
 * 
 * @author (Sergio Camara) 
 * @version (1.0)
 */
public class AtencionAlCliente extends Trabajadores
{
    /**
     * Constructor de la clase AtencionAlCliente
     */
    public AtencionAlCliente()
    {
    }

    /**
     * Modifica el sueldo del trabajador
     */
    public void subeSueldo()
    {
        super.modificaSueldo(10);
    }
}
