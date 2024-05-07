
/**
 * En esta clase estan los tipos de trabajadores de un parque de atracciones
 * 
 * @author (Sergio Camara) 
 * @version (1.0)
 */
public class Trabajadores
{
    private int sueldo;

    /**
     * Constructor de la clase Trabajadores
     */
    public Trabajadores()
    {
        sueldo = 950;//sueldo del trabajador
    }

    /**
     * Modifica el sueldo del trabajador
     * 
     * @param int modificador del sueldo
     */
    public void modificaSueldo(int porcentaje)
    {
        sueldo =+ (sueldo * porcentaje) / 100;
    }
    
    /**
     * Devuelve el sueldo del trabajador
     * 
     * @return int sueldo del trabajador
     */
    public int dimeSueldo()
    {
        return sueldo;
    }
}
