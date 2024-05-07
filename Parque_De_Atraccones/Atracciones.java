import java.util.*;//paquete para java util
/**
 * Atracciones que hay en el parque de atracciones
 * 
 * @author (Sergio Camara) 
 * @version (1.0)
 */
public class Atracciones
{
    private String nombreAtraccion;
    private boolean accesoVip;
    private boolean alturaLimitada;
    private int alturaMin;
    private int alturaMax;
    private boolean restricionEdad;
    private boolean niños;
    private boolean adultos;
    private int responsables;
    private int ayudantes;
    AyudanteAtraccion ayudante = new AyudanteAtraccion();
    ResponsableAtraccion responsable = new ResponsableAtraccion();
    AtencionAlCliente atencionCliente = new AtencionAlCliente();
    RelaccionesPublicas relaccionesPublicas = new RelaccionesPublicas();
    /**
     * Constructor de la clase Atracciones
     */
    public Atracciones(String nombre, boolean altura, boolean vip, boolean edad, int numAyudantes)
    {
        nombreAtraccion = nombre;
        alturaLimitada = altura;
        accesoVip = vip;
        restricionEdad = edad;
        responsables = 1;
        ayudantes = numAyudantes;
    }
    
    /**
     * Si tiene restricion de altura la atraccion se marca la altura maxima,minima o las 2
     * 
     * @param boleano para saber si hay altura maxima
     * @param boleano para saber si hay altura minima
     */
    public void restricionAltura(boolean maxima, boolean minima)
    {
        if(alturaLimitada == true)
        {
            if(maxima == true)
            {
                Scanner entrada=new Scanner(System.in);
                System.out.print("Altura maxima de la atraccion");
                alturaMin=Integer.parseInt(entrada.nextLine());
            }
            if(minima == true)
            {
                Scanner entrada=new Scanner(System.in);
                System.out.print("Altura minima de la atraccion");
                alturaMin=Integer.parseInt(entrada.nextLine());
            }
        }
    }
    
   /**
     * Si hay restricion por edad de que tipo es
     * 
     * @param boleano para saber si hay restricion de entrada a adultos
     * @param boleano para saber si hay restriccion de entrada a niños
     */
    public void restricionEdad(boolean adultos, boolean niños)
    {
        if(restricionEdad == true)
        {
            this.adultos = adultos;
            this.niños = niños;
        }
    }
    
   /**
    * Devuelve el numero de responsables de atraccion
    * 
    * @return numero de responsables
    */
    public int dameResponsables()
    {
      return responsables; 
    }
   
   /**
    * Devuelve el numero de ayudantes de atraccion
    * 
    * @return numero de ayudantes
    */
    public int dameAyudantes()
    {
      return ayudantes; 
    }
   
   /**
    * Devuelve el nombre de la atraccion
    * 
    * @return nombre de la atraccion
    */
    public String dameNombre()
    {
        return nombreAtraccion;
    }
   
   /**
    * Devuelve el coste de la atraccion
    * 
    * @return coste de la atraccion
    */
    public int calculoCoste()
    {
       int costeAtraccion = 0;
       int personalParcial = 0;
       int atCliente = 0;
       int relPublicos = 0;
       personalParcial = dameAyudantes() + dameResponsables();
       atCliente = (int) (personalParcial*30)/100;
       relPublicos = (int) (personalParcial*10)/100;
       costeAtraccion = (ayudante.dimeSueldo()*dameAyudantes()) + (responsable.dimeSueldo()*dameResponsables()) + (atencionCliente.dimeSueldo()*atCliente) + (relaccionesPublicas.dimeSueldo()*relPublicos);
       return costeAtraccion;
    }
}
