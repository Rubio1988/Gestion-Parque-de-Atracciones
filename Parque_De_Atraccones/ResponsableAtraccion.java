
/**
 * Subclase de la clase trabajadores
 * 
 * @author (Sergio Camara) 
 * @version (1.0)
 */
public class ResponsableAtraccion extends Trabajadores
{
    
    /**
     * Constructor de la clase ResponsableAtraccion
     */
    public ResponsableAtraccion()
    {
    }

    /**
     * Modifica el sueldo del trabajador
     */
    public void subeSueldo()
    {
        super.modificaSueldo(15);
    }
}
