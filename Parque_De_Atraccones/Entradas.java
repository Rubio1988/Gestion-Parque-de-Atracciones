//paquetes para fecha y hora
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;//Paquete para usar JOptionPane
//Paquete para pasar un string a date
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;//Paquete para tratar la excepcion de parse
import java.io.*;//Paquete para poder introducir las entradas en un fichero
/**
 * En esta clase estan las entradas disponibles de un parque de atracciones
 * 
 * @author (Sergio Camara) 
 * @version (1.0)
 */
public class Entradas implements Serializable
{
    public enum tipoEntrada{
        DIALABORABLE(15),
        DETARDE(50);
        
        private final int descuento;
        
        tipoEntrada(int descuento)
        {
            this.descuento = descuento;
        }
        
        public int descuento()
        {
            return descuento;
        }
    }
    private static final long serialVersionUID = 1L;
    //variables con los datos del cliente
    private int edad;
    private int altura;
    //variable con el precio segun temporada de la entrada
    private int precio;
    //variable con el precio final de la entrada
    private int precioTotal;
    //descuento aplicado a la entrada
    private int descuentoEspecial;
    private int descuentoTipo;
    private int descuentoEdad;
    private int descuentoTemporada;
    //variable para definir si la entrada incluye pase VIP y su precio respecto a la edad
    private boolean vip;
    private int precioVip;
    //variables para definirn descuentos especiales 
    private boolean estudiante;
    private boolean carnetJoven;
    private boolean diversidadFuncional;
    private boolean desempleado;
    //fecha en la que se va a entrar al parque
    Calendar fechaEntrada = Calendar.getInstance();
    //fecha temporada alta reyes
    Calendar inicioReyes = Calendar.getInstance();
    Calendar finReyes = Calendar.getInstance();
    
    /**
     * Constructor de la clase Entradas
     */
    public Entradas()
    { 
        precio = 60;
        vip = false;
        precioVip = 50;
        inicioReyes.set(2018,11,31);
        finReyes.set(2019,0,9);
    }
    
    /**
     * Metodo que modifica la edad
     */ 
    public void modificaEdad()
    {
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
    }
    
    /**
     * Metodo que devuelve la edad
     * 
     * @return edad cliente
     */
    public int dimeEdad()
    {
        return edad;
    }
    
    /**
     * Metodo que modifica la altura
     */
    public void modificaAltura()
    {
        altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en centimetros"));
    }
    
    /**
     * Metodo que devuelve la altura
     * 
     * @return altura cliente
     */
    public int dimeAltura()
    {
        return altura;
    }
    
    /**
     * Metodo para saber de que tipo es la entrada que deseas
     * 
     * @param fecha de entrada al parque
     */
    public void caracteristicasEntrada(Calendar fecha)
    {
        String tipoDeEntrada;
        if(fecha.DAY_OF_WEEK > 0 && fecha.DAY_OF_WEEK < 5)
        {
            tipoEntrada ent = tipoEntrada.DIALABORABLE;
            descuentoTipo = ent.descuento();
        }
        tipoDeEntrada = JOptionPane.showInputDialog("¿Quieres comprar una entrada de tarde(entrada al parque a partir de las 16:00)(si/no)?");
        if(tipoDeEntrada.equals("si"))
        {
               tipoEntrada ent = tipoEntrada.DETARDE;
               descuentoTipo = ent.descuento();
        }
    }
    
    /**
     * Modifica el descuento segun el tipo de entrada
     * 
     * @param el decuento a introducir
     */
    public void modificaDescuentoTipo(int descuento)
    {
        descuentoTipo = descuento;
    }
    
    /**
     * Devuelve el descuento segun el tipo de entrada
     * 
     * @return descuento segun tipo de entrada
     */
    public int dameDescuentoTipo()
    {
        return descuentoTipo;
    }
    
    /**
     * Devuelve un string con el nombre del tipo de cliente
     * 
     * @param edad del cliente
     * @return tipo de cliente
     */
    public String tipoCliente(int edad)
    {
        String cliente = "";
        if(edad < 3)
        {
            cliente = "bebe";
        }else if(edad > 3 && edad < 13)
        {
            cliente = "niño";
        }else if(edad > 12 && edad < 65)
        {
            cliente = "adulto";
        }else if(edad > 64)
        {
            cliente = "senior";
        }
        return cliente;
    }
    
    /**
     * Modifica el descuento de la entrada segun la edad
     * 
     * @param int edad del cliente
     * @return descuento respecto edad del cliente
     */
    public int descuentoEdad(int edad)
    {
        if(edad>=3 && edad<13)
        {
            descuentoEdad = 50;
        }else if(edad>64)
        {
            descuentoEdad = 35;
        }else if (edad<3)
        {
            descuentoEdad = 100;   
        }
        return descuentoEdad;
    }
    
    /**
     * Crea un precio para la entrada vip
     * 
     * @pàram  int descuento que se aplica dependiendo de la edad
     * @return precio modificado de la entrada vip
     */
    public int modificaPrecioVip(int porcentaje)
    {
        String entradaVip;
        entradaVip = JOptionPane.showInputDialog("Deseas comprar el suplemento de entrada VIP (si/no)");
        if(entradaVip.equals("si")){
            vip = true;
            precioVip -= (precioVip * porcentaje) / 100;
            }
        return precioVip;
    }
    
    /**
     * Modifica el precio de la entrada VIP a 0€ para entradas familiares
     */
    public void modificaVip()
    {
        vip = true;
        precioVip = 0;
    }
    
    /**
     * Devuelve true si se ha elegido entrada VIP
     * 
     * @return booleano VIP
     */
    public boolean esVip()
    {
        return vip;
    }
    
    /**
     * Devuelve el precio de la entrada VIP
     * 
     * @return precio entrada VIP
     */
    public int dameVip()
    {
        return precioVip;
    }
    
    /**
     * Modifica el descuento de la entrada en funcion de las caracteristicas especiales del cliente
     */
    public void descuentoEspecial()
    {
        String entradaEstudiante;
        entradaEstudiante = JOptionPane.showInputDialog("¿Tienes carnet de estudiante (si/no)?");
        if(entradaEstudiante.equals("si")){
            estudiante = true;
            descuentoEspecial += 10;
            }
        String entradaCarnetJoven;
        entradaCarnetJoven = JOptionPane.showInputDialog("¿Tienes carnet joven (si/no)?");
        if(entradaCarnetJoven.equals("si")){
            carnetJoven = true;
            descuentoEspecial += 10;
            }
        String entradaDiversidadFuncional;
        entradaDiversidadFuncional = JOptionPane.showInputDialog("¿Tienes alguna diversidad funcional (si/no)?");
        if(entradaDiversidadFuncional.equals("si")){
            diversidadFuncional = true;
            descuentoEspecial += 10;
            }
        String entradaDesempleado;
        entradaDesempleado = JOptionPane.showInputDialog("¿Tienes la tarjeta de desempleado (si/no)?");
        if(entradaDesempleado.equals("si")){
            desempleado = true;
            descuentoEspecial += 20;
            }
    }
    
    /**
     * Introduce la fecha de entrada al parque
     */
    public void introduceFecha()
    {
        int dia= Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia de entrada al parque"));
        int mes= Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes de entrada al parque"));
        int año= Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de entrada al parque"));
        if(mes < 0 || mes > 12 || dia < 1 || dia > 31)
            {
                JOptionPane.showMessageDialog(null,"Debes introducir una fecha correcta");
                introduceFecha();
            }
        fechaEntrada.set(Calendar.DATE, dia);
        fechaEntrada.set(Calendar.MONTH, mes-1);
        fechaEntrada.set(Calendar.YEAR, año);
    }
    
    /**
     * Modifica la fecha de entrada al parque
     * 
     * @param int con el dia de entrada al parque
     * @param int con el mes de entrada al parque
     * @param int con el año de entrada al parque
     */
    public void modificaFecha(int dia,int mes,int año)
    {
        fechaEntrada.set(Calendar.DATE, dia);
        fechaEntrada.set(Calendar.MONTH, mes);
        fechaEntrada.set(Calendar.YEAR, año);
    }
    
    /**
     * Devuelve el dia de entrada al parque
     * 
     * @return dia de entrada al parque
     */
    public int dameDia()
    {
        return dameFecha().get(Calendar.DATE);
    }
    
    /**
     * Devuelve el mes de entrada al parque
     * 
     * @return mes de entrada al parque
     */
    public int dameMes()
    {
        return dameFecha().get(Calendar.MONTH);
    }
    
    /**
     * Devuelve el año de entrada al parque
     * 
     * @return año de entrada al parque
     */
    public int dameAño()
    {
        return dameFecha().get(Calendar.YEAR);
    }
    
    /**
     * Devuelve la fecha de entrada al parque
     * 
     * @return fecha de entrada al parque
     */
    public Calendar dameFecha()
    {
        return fechaEntrada;
    }
    
    /**
     *  Modifica el descuento segun la temporada
     *  
     *  @param fecha de entrada al parque
     *  @return descuento segun temporada
     */
    public int precioTemporada(Calendar fecha)
    {
        
        if(fecha.before(inicioReyes) && fecha.after(finReyes))
        {
            descuentoTemporada = -15;
        }else if(fecha.get(Calendar.MONTH) == 3 && fecha.get(Calendar.YEAR) == 2019)
        {
            descuentoTemporada = -15;
        }else if(fecha.get(Calendar.MONTH) == 7 && fecha.get(Calendar.YEAR) == 2019)
        {
            descuentoTemporada = -15;
        }else if(fecha.get(Calendar.MONTH) == 11 && fecha.get(Calendar.YEAR) == 2019)
        {
            descuentoTemporada = -15;
        }else if(fecha.get(Calendar.MONTH) == 1 && fecha.get(Calendar.YEAR) == 2019)
        {
            descuentoTemporada = 15;
        }else if(fecha.get(Calendar.MONTH) == 10 && fecha.get(Calendar.YEAR) == 2019)
        {
            descuentoTemporada = 15;
        }
        return descuentoTemporada;
    }
    
    /**
     * Modifica el precio de la entrada en funcion de la temporada
     * 
     * @pàram  int porcentaje con el que se modifica el precio
     */
    public void modificaPrecioTemporada(int porcentaje)
    {
        precio -= (precio * porcentaje) / 100;
    }
    
    /**
     * Metodo que devuelve el precio de la entrada segun temporada
     * 
     * @return precio entrada
     */
    public int dimePrecio()
    {
        return precio;
    }
    
    /**
     * Modifica el precio de la entrada en funcion de un parametro
     * 
     * @pàram  int porcentaje con el que se modifica el precio
     */
    public void modificaPrecio(int porcentaje)
    {
        precioTotal = precio - ((precio * porcentaje) / 100);
        if(vip == true)
        {
         precioTotal += precioVip;   
        }
       
    }
    
    /**
     * Metodo que devuelve el precio final de la entrada
     * 
     * @return precio entrada
     */
    public int dimePrecioTotal()
    {
        return precioTotal;
    }
    
    /**
     * Metodo que suma los descuentos y comprueba que el descuento aplicado a la entrada no supere el 90%
     * 
     * @param edad del cliente
     * @return descuento aplicado, si el descuento supera el 90%, devuelve el 90%(exceptuando menores de 2 años, que no pagan)
     */
    public int compruebaDescuento(int edad)
    {
        int aux;
        aux = descuentoTipo + descuentoEspecial + descuentoEdad;
        if(edad<3)
        {
            aux = 100;
        }else if(aux > 90)
        {
            aux = 90;
        }
        return aux;
    }
    
    /**
     * Metodo para imprimir entradas
     */
    public void imprimirEntrada()
    {
        System.out.println("******************************");
        System.out.println("***********TICKET*************");
        System.out.println("******************************");
        System.out.println(dameFecha().getTime());
        System.out.println("******************************");
        System.out.println("Precio General: " + dimePrecio());
        System.out.println("Descuento: " + compruebaDescuento(dimeEdad()) + "%");
        if(vip == true)
        {
            System.out.println("Precio VIP: " + dameVip());
        }
        System.out.println("");
        System.out.println("Precio Entrada: " + dimePrecioTotal());
        System.out.println("******************************");
        System.out.println("");
    }
}
