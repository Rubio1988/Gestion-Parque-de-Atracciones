
/**
 * Subclase de la clase trabajadores
 * 
 * @author (Sergio Camara) 
 * @version (1.0)
 */
public class RelaccionesPublicas extends Trabajadores
{
    /**
     * Constructor de la clase RelaccionesPublicas
     */
    public RelaccionesPublicas()
    {
    }

    /**
     * Modifica el sueldo del trabajador
     */
    public void subeSueldo()
    {
        super.modificaSueldo(20);
    }
}
