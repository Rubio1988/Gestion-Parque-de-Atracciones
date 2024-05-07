import java.util.*;
/**
 * Metodo main con el programa del parque
 * 
 * @author (Sergio Camara) 
 * @version (1.0)
 */
public class Parque
{
    private ControladorEstadisticas controlador;
	
	public Parque() {
		controlador = new ControladorEstadisticas();
	}
    
    public static void main(String [] args){
        new Parque();
    }
}
