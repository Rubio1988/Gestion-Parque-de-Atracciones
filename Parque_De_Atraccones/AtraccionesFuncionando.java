import java.util.*;
/**
 * Esta clase maneja las atraciones que hay funcionando y en base a ello crea las estadisticas del parque
 * 
 * @author (Sergio Camara) 
 * @version (1.0)
 */
public class AtraccionesFuncionando extends Atracciones
{
    private boolean funciona;
    private int mesMantenimiento = 0;
    /**
     * Constructor de la clase AtraccionesFuncionando
     */
    public AtraccionesFuncionando(String nombre, boolean altura, boolean vip, boolean edad, int numAyudantes)
    {
        super(nombre,altura,vip,edad,numAyudantes);
        funciona = true;
    }

    /**
     * Metodo para manejar si una atraccion funciona
     */
    public void estadoAtraccon()
    {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Mes en el que la atraccion va a estar fuera de servicio(introducir el numero del mes)");
        try {
            mesMantenimiento=Integer.parseInt(entrada.nextLine()) - 1;
            funciona = false;
        }catch (NumberFormatException e) {
            System.out.println("");
            System.out.println("Sólo el numero del mes es admitido.");
        }
        
    }
    
    /**
     * Metodo que devuelve el mes en el que la atraccion no funciona
     * 
     * @return numero del mes que la atraccion no funciona
     */
    public int dameMesMantenimiento()
    {
        return mesMantenimiento;
    }
    
    /**
     * Metodo que devuelve boolean del estado de funcionamiento de la atraccion
     * 
     * @return false si la atraccion no funciona
     */
    public boolean dameFunciona()
    {
        return funciona;
    }
}
