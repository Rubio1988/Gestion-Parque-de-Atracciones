
import java.util.*;//paquete para java util
import javax.swing.JOptionPane;//Paquete para usar JOptionPane
import java.util.Collections;
/**
 * Desde esta clase se compran las entradas
 * 
 * @author (Sergio Camara) 
 * @version (1.0)
 */
public class InterfazParque
{
    //Lista para almacenar las entradas compradas
    private HashMap listaEntradas;
    //Variable para acceder a la clase entradas
    private Entradas entrada;
   // private Entradas entrada;
    //Variables para comprar conjuntos de entradas
    private int entradaFamiliar;
    private int variasEntradas;
    //Variable para guardar el descuento tipo en la compra de varias entradas
    int descuento;
    //Variable para almacenar la fecha en la compra de entradas
    String fecha;
    int day = 0;
    int month = 0;
    int year = 0;
    //Variables para manejar el menu
    private boolean salir;
    private String seleccion;
    private int contadorEntradas;
    private int menu;
    private int menuEntradas;
    private int menuEstadisticas;
    ArrayList<AtraccionesFuncionando> lista;
    int totalPersonal = 0;
    
    /**
     * Constructor de la clase InterfazParque
     */
    public InterfazParque()
    {
        //atracciones del parque 
        lista = new ArrayList<AtraccionesFuncionando>();
         AtraccionesFuncionando atraccionA1 = new AtraccionesFuncionando("A1",true,true,false,6);
         AtraccionesFuncionando atraccionA2 = new AtraccionesFuncionando("A2",true,true,false,6);
         AtraccionesFuncionando atraccionA3 = new AtraccionesFuncionando("A3",true,true,false,6);
         AtraccionesFuncionando atraccionA4 = new AtraccionesFuncionando("A4",true,true,false,6);
         AtraccionesFuncionando atraccionB1 = new AtraccionesFuncionando("B1",true,false,true,5);
         AtraccionesFuncionando atraccionB2 = new AtraccionesFuncionando("B2",true,false,true,5);
         AtraccionesFuncionando atraccionB3 = new AtraccionesFuncionando("B3",true,false,true,5);
         AtraccionesFuncionando atraccionB4 = new AtraccionesFuncionando("B4",true,false,true,5);
         AtraccionesFuncionando atraccionB5 = new AtraccionesFuncionando("B5",true,false,true,5);
         AtraccionesFuncionando atraccionB6 = new AtraccionesFuncionando("B6",true,false,true,5);
         AtraccionesFuncionando atraccionC1 = new AtraccionesFuncionando("C1",true,false,true,3);
         AtraccionesFuncionando atraccionC2 = new AtraccionesFuncionando("C2",true,false,true,3);
         AtraccionesFuncionando atraccionC3 = new AtraccionesFuncionando("C3",true,false,true,3);
         AtraccionesFuncionando atraccionC4 = new AtraccionesFuncionando("C4",true,false,true,3);
         AtraccionesFuncionando atraccionD1 = new AtraccionesFuncionando("D1",false,true,false,5);
         AtraccionesFuncionando atraccionD2 = new AtraccionesFuncionando("D2",false,true,false,5);
         AtraccionesFuncionando atraccionD3 = new AtraccionesFuncionando("D3",false,true,false,5);
         AtraccionesFuncionando atraccionE1 = new AtraccionesFuncionando("E1",false,true,true,7);
         AtraccionesFuncionando atraccionE2 = new AtraccionesFuncionando("E2",false,true,true,7);
         AtraccionesFuncionando atraccionE3 = new AtraccionesFuncionando("E3",false,true,true,7);
         AtraccionesFuncionando atraccionE4 = new AtraccionesFuncionando("E4",false,true,true,7);
         AtraccionesFuncionando atraccionE5 = new AtraccionesFuncionando("E5",false,true,true,7);
         AtraccionesFuncionando atraccionE6 = new AtraccionesFuncionando("E6",false,true,true,7);
         AtraccionesFuncionando atraccionE7 = new AtraccionesFuncionando("E7",false,true,true,7);
         //incluir atracciones en una lista
         lista.add(atraccionA1);
         lista.add(atraccionA2);
         lista.add(atraccionA3);
         lista.add(atraccionA4);
         lista.add(atraccionB1);
         lista.add(atraccionB2);
         lista.add(atraccionB3);
         lista.add(atraccionB4);
         lista.add(atraccionB5);
         lista.add(atraccionB6);
         lista.add(atraccionC1);
         lista.add(atraccionC2);
         lista.add(atraccionC3);
         lista.add(atraccionC4);
         lista.add(atraccionD1);
         lista.add(atraccionD2);
         lista.add(atraccionD3);
         lista.add(atraccionE1);
         lista.add(atraccionE2);
         lista.add(atraccionE3);
         lista.add(atraccionE4);
         lista.add(atraccionE5);
         lista.add(atraccionE6);
         lista.add(atraccionE7); 
    }
    
    /**
     * Menu principal
     * 
     * @return numero elegido en el menu
     */
    public int menuPrincipal()
    {
        
        salir=false;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("        Menu principal       ");
        System.out.println("-----------------------------");
        System.out.println("1: Comprar entradas.");
        System.out.println("2: Estadisticas parque.");
        System.out.println("3: Control atracciones.");
        System.out.println("4: Salir.");
        System.out.println("");
        
        do {
            System.out.print("Seleccionar acción: ");
            seleccion=entrada.nextLine();
            
            switch(seleccion){
                case "1":
                    salir=true;
                    menu=1;
                    break;
                case "2":
                    salir=true;
                    menu=2;
                    break;  
                case "3":
                    salir=true;
                    menu=3;
                    break;
                case "4":
                    salir=true;
                    menu=4;
                    break;
                default: 
                    salir=false;
                    System.out.println("");
                    System.out.println("Opción no válida");    
            }
            
        } while(!salir);
        System.out.println("-----------------------------");
        System.out.println("");
        
        return menu;
    }
    
    /**
     * Menu para comprar entradas
     * 
     * @return numero elegido en el menu
     */
    public int menuComprarEntradas(){
        
        salir=false;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("      Compra de entradas     ");
        System.out.println("-----------------------------");
        System.out.println("1: Comprar entrada individual.");
        System.out.println("2: Comprar entrada familiar(2 adultos y 2 niños).");
        System.out.println("3: Comprar varias entradas.");
        System.out.println("4: Salir.");
        System.out.println("-----------------------------");
        System.out.println("");
        
        do {
            System.out.print("Seleccionar acción: ");
            seleccion=entrada.nextLine();
            
            switch(seleccion){
                case "1":
                    salir=true;
                    menuEntradas=1;
                    break;
                case "2":
                    salir=true;
                    menuEntradas=2;
                    break; 
                case "3":
                    salir=true;
                    menuEntradas=3;
                    break; 
                case "4":
                    salir=true;
                    menuEntradas=4;
                    break;
                default: 
                    salir=false;
                    System.out.println("");
                    System.out.println("Opción no válida");    
            }
            
        } while(!salir);
        System.out.println("-----------------------------");
        System.out.println("");
        
        return menuEntradas;
    }
    
    /**
     * Menu estadisticas del parque
     * 
     * @return numero elegido en el menu
     */
    public int menuEstadisticas()
    {
        salir=false;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("     Estadisticas parque     ");
        System.out.println("-----------------------------");
        System.out.println("1: Listado entradas.");
        System.out.println("2: Listado visitantes y precio.");
        System.out.println("3: Resumen financiero.");
        System.out.println("4: Salir.");
        System.out.println("-----------------------------");
        System.out.println();
        
        do {
            System.out.print("Seleccionar acción: ");
            seleccion=entrada.nextLine();
            
            switch(seleccion){
                case "1":
                    salir=true;
                    menuEstadisticas=1;
                    break;  
                case "2":
                    salir=true;
                    menuEstadisticas=2;
                    break;
                case "3":
                    salir=true;
                    menuEstadisticas=3;
                    break;
                case "4":
                    salir=true;
                    menuEstadisticas=4;
                    break;
                default: 
                    salir=false;
                    System.out.println("");
                    System.out.println("Opción no válida");    
            }
            
        } while(!salir);
        System.out.println("-----------------------------");
        System.out.println("");
        
        return menuEstadisticas;
    }
    
    /**
     * Menu para comprar entrada individual
     * 
     * @return entrada comprada
     */
    public Entradas comprarEntrada()
    {
        Entradas entrada = new Entradas();
        entrada.modificaEdad();
        //si eres menor de 12 años no puedes comprar una entrada individual
        if(entrada.dimeEdad()>12)
        {
            entrada.introduceFecha();
            entrada.modificaAltura();
            entrada.caracteristicasEntrada(entrada.dameFecha());
            entrada.modificaPrecioVip(entrada.descuentoEdad(entrada.dimeEdad()));
            entrada.descuentoEspecial();
            entrada.modificaPrecioTemporada(entrada.precioTemporada(entrada.dameFecha()));
            entrada.modificaPrecio(entrada.compruebaDescuento(entrada.dimeEdad()));
            entrada.imprimirEntrada();
        }else{
            JOptionPane.showMessageDialog(null,"Para comprar una entrada de niño compra antes la entrada de adulto o senior");
            comprarEntrada();
        }
        return entrada;
    }
    
    /**
     * Menu para comprar entrada familiar
     * 
     * @return entrada comprada
     */
    public Entradas comprarEntradaFamilia()
    {
       Entradas entrada = new Entradas();
       Calendar fechaEntrada = Calendar.getInstance();
       if(entradaFamiliar == 0)
       {
        entrada.modificaEdad();
        if(entrada.dimeEdad()>12)
        {
            entrada.introduceFecha();
            day = entrada.dameDia();
            month = entrada.dameMes();
            year = entrada.dameAño();
            entrada.modificaAltura();
            entrada.caracteristicasEntrada(entrada.dameFecha());
            entrada.modificaVip();
            entrada.descuentoEspecial();
            entrada.modificaPrecioTemporada(entrada.precioTemporada(entrada.dameFecha()));
            entrada.modificaPrecio(entrada.compruebaDescuento(entrada.dimeEdad()));
            entrada.imprimirEntrada();
            descuento = entrada.dameDescuentoTipo();
            entradaFamiliar++;
        }else{
            JOptionPane.showMessageDialog(null,"Para comprar una entrada de niño compra antes las entradas de adulto o senior");
            comprarEntradaFamilia();
        }
       }else if(entradaFamiliar == 1)
       {
        entrada.modificaEdad();
        if(entrada.dimeEdad()>12)
        {
            entrada.modificaFecha(day,month,year);
            entrada.modificaDescuentoTipo(descuento);
            entrada.modificaAltura();
            entrada.caracteristicasEntrada(entrada.dameFecha());
            entrada.modificaVip();
            entrada.descuentoEspecial();
            entrada.modificaPrecioTemporada(entrada.precioTemporada(entrada.dameFecha()));
            entrada.modificaPrecio(entrada.compruebaDescuento(entrada.dimeEdad()));
            entrada.imprimirEntrada();
            entradaFamiliar++;
        }else{
            JOptionPane.showMessageDialog(null,"Para comprar una entrada de niño compra antes las entradas de adulto o senior");
            comprarEntradaFamilia();
        }
       }else
       {
           do{         
               entrada.modificaEdad();
               if(entrada.dimeEdad() > 13)
               {
                   JOptionPane.showMessageDialog(null,"Debes comprar una entrada de niño");
                   entrada.modificaEdad();
                } 
            }while(entrada.dimeEdad() > 13);
             if(entrada.dimeEdad() < 3)        
             {
                 entrada.modificaAltura();
                 entrada.modificaDescuentoTipo(descuento);
                 entrada.descuentoEdad(entrada.dimeEdad());
                 entrada.modificaFecha(day,month,year);
                 entrada.modificaVip();
                 entrada.modificaPrecioTemporada(entrada.precioTemporada(entrada.dameFecha()));
                 entrada.modificaPrecio(entrada.compruebaDescuento(entrada.dimeEdad()));
                 entrada.imprimirEntrada();
                 entradaFamiliar++;
                }else
                {
                    entrada.modificaAltura();
                    entrada.modificaDescuentoTipo(descuento);
                    entrada.descuentoEdad(entrada.dimeEdad());
                    entrada.modificaFecha(day,month,year);
                    entrada.modificaVip();
                    entrada.modificaPrecioTemporada(entrada.precioTemporada(entrada.dameFecha()));
                    entrada.modificaPrecio(entrada.compruebaDescuento(entrada.dimeEdad()));
                    entrada.imprimirEntrada();
                    entradaFamiliar++;
                } 
            }         
       
        return entrada;
    }
    
    /**
     * Menu para comprar varias entradas 
     * 
     * @return entrada comprada
     */
    public Entradas comprarEntradaGrupo()
    {
        Entradas entrada = new Entradas();
        Calendar fechaEntrada = Calendar.getInstance();if(variasEntradas == 0)
        {
            entrada.modificaEdad();
            //si eres menor de 12 años no puedes comprar una entrada individual
            if(entrada.dimeEdad()>12)
            {
                entrada.introduceFecha();
                day = entrada.dameDia();
                month = entrada.dameMes();
                year = entrada.dameAño();
                entrada.modificaAltura();
                entrada.caracteristicasEntrada(entrada.dameFecha());
                entrada.modificaPrecioVip(entrada.descuentoEdad(entrada.dimeEdad()));
                entrada.descuentoEspecial();
                entrada.modificaPrecioTemporada(entrada.precioTemporada(entrada.dameFecha()));
                entrada.modificaPrecio(entrada.compruebaDescuento(entrada.dimeEdad()));
                entrada.imprimirEntrada();
                descuento = entrada.dameDescuentoTipo();
                variasEntradas++;
            }else{
            JOptionPane.showMessageDialog(null,"Para comprar una entrada de niño compra antes las entradas de adulto o senior");
            comprarEntradaGrupo();
            }
        }else
        {
            entrada.modificaEdad();
            if(entrada.dimeEdad() < 3)
            {
                          
                entrada.modificaAltura();
                entrada.modificaDescuentoTipo(descuento);
                entrada.descuentoEdad(entrada.dimeEdad());
                entrada.modificaFecha(day,month,year);
                entrada.modificaPrecioTemporada(entrada.precioTemporada(entrada.dameFecha()));
                entrada.modificaPrecio(entrada.compruebaDescuento(entrada.dimeEdad()));
                entrada.imprimirEntrada();
                variasEntradas++;
            }else if(entrada.dimeEdad() > 3 && entrada.dimeEdad() < 13)        
            {          
                entrada.modificaAltura();
                entrada.modificaDescuentoTipo(descuento);
                entrada.modificaFecha(day,month,year);
                entrada.modificaPrecioVip(entrada.descuentoEdad(entrada.dimeEdad()));
                entrada.modificaPrecioTemporada(entrada.precioTemporada(entrada.dameFecha()));
                entrada.modificaPrecio(entrada.compruebaDescuento(entrada.dimeEdad()));
                entrada.imprimirEntrada();
                variasEntradas++;
            }else       
            {          
                entrada.modificaAltura();
                entrada.modificaDescuentoTipo(descuento);
                entrada.modificaFecha(day,month,year);
                entrada.modificaPrecioVip(entrada.descuentoEdad(entrada.dimeEdad()));
                entrada.descuentoEspecial();
                entrada.modificaPrecioTemporada(entrada.precioTemporada(entrada.dameFecha()));
                entrada.modificaPrecio(entrada.compruebaDescuento(entrada.dimeEdad()));
                entrada.imprimirEntrada();
                variasEntradas++;  
            }
        }
        return entrada;   
    }
    
    /**
     * Metodo para listar las entradas vendidas en el parque
     * 
     * @param ArrayList con la lista a crear
     */
    public void listadoEntradas(ArrayList<Entradas> listaEntradas) {
        System.out.println("\n------------------- Listado de las entradas -----------------------------");
        Collections.sort(listaEntradas, new Comparator<Entradas>() {
    @Override
    public int compare(Entradas entrada1, Entradas entrada2) {
       
        
        return entrada1.dameFecha().compareTo(entrada2.dameFecha());
    }
    
}) ;

        for (Entradas indiceEntradas : listaEntradas) {
            System.out.print("Tipo de cliente: " + indiceEntradas.tipoCliente(indiceEntradas.dimeEdad()) + " / ");
            System.out.print("Descuento: " + indiceEntradas.compruebaDescuento(indiceEntradas.dimeEdad()) + " / ");
            System.out.print("VIP: " + indiceEntradas.esVip() + " / ");
            System.out.print("Precio entrada: " + indiceEntradas.dimePrecioTotal() + " / ");
            System.out.println("Fecha entrada: " + indiceEntradas.dameFecha().getTime());
            System.out.println("");
        }
        
        System.out.println("-------------------------------------------------------------------------");
    }
    
    /**
     * Metodo para listar los visitantes que han visitado el parque
     * 
     * @param ArrayList con la lista a crear
     */
    public void listadoVisitantes(ArrayList<Entradas> listaEntradas) {
        int contadorClientes[] = new int[31];
        int contador = 0;
        int contadorClientesMensual = 0;
        int contadorClientesAnual = 0;
        int sumaPrecio[] = new int[31];
        int suma = 0;
        int sumaPrecioMensual = 0;
        int sumaPrecioAnual = 0;
        System.out.println("\nLISTADO DE VISITANTES Y PRECIO MEDIO DE LAS ENTRADAS: ");
        System.out.println("");
        System.out.println("\nEnero: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        System.out.print("                           ");
        for(int i = 1;i<=31;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.JANUARY && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<31;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Enero: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Enero: 0€");
        }else{ System.out.println("Precio medio de entrada Enero: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");
        System.out.println("\nFebrero: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        System.out.print("                           ");
        for(int i = 1;i<=28;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.FEBRUARY && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<28;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<28;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Febrero: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Febrero: 0€");
        }else{ System.out.println("Precio medio de entrada Febrero: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");
        System.out.println("\nMarzo: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        System.out.print("                           ");
        for(int i = 1;i<=31;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.MARCH && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<31;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Marzo: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Marzo: 0€");
        }else{ System.out.println("Precio medio de entrada Marzo: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");
        System.out.println("\nAbril: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        System.out.print("                           ");
        for(int i = 1;i<=30;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.APRIL && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<30;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<30;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Abril: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Abril: 0€");
        }else{ System.out.println("Precio medio de entrada Abril: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");
        System.out.println("\nMayo: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        System.out.print("                           ");
        for(int i = 1;i<=31;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.MAY && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<31;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Mayo: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Mayo: 0€");
        }else{ System.out.println("Precio medio de entrada Mayo: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");
        System.out.println("\nJunio: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        System.out.print("                           ");
        for(int i = 1;i<=30;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.JUNE && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<30;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<30;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Junio: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Junio: 0€");
        }else{ System.out.println("Precio medio de entrada Junio: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");
        System.out.println("\nJulio: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        System.out.print("                           ");
        for(int i = 1;i<=31;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.JULY && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<31;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Julio: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Julio: 0€");
        }else{ System.out.println("Precio medio de entrada Julio: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");
        System.out.println("\nAgosto: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        System.out.print("                           ");
        for(int i = 1;i<=31;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.AUGUST && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<31;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Agosto: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Agosto: 0€");
        }else{ System.out.println("Precio medio de entrada Agosto: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");
        System.out.println("\nSeptiembre: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        System.out.print("                           ");
        for(int i = 1;i<=30;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.SEPTEMBER && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<30;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<30;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Septiembre: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Septiembre: 0€");
        }else{ System.out.println("Precio medio de entrada Septiembre: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");
        System.out.println("\nOctubre: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        System.out.print("                           ");
        for(int i = 1;i<=31;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.OCTOBER && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<31;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Octubre: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Octubre: 0€");
        }else{ System.out.println("Precio medio de entrada Octubre: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");
        System.out.println("\nNoviembre: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        System.out.print("                           ");
        for(int i = 1;i<=30;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.NOVEMBER && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<30;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<30;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Noviembre: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Noviembre: 0€");
        }else{ System.out.println("Precio medio de entrada Noviembre: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");
        System.out.println("\nDiciembre: ");
        contadorClientesMensual = 0;
        sumaPrecioMensual = 0;
        for(int h = 0;h<31;h++){contadorClientes[h] = 0;}
        System.out.print("                           ");
        for(int i = 1;i<=31;i++)
        {
            suma = 0;
            contador = 0;
            System.out.print("Dia " + i+"  ");
            for (Entradas indiceEntradas : listaEntradas) {
                if(indiceEntradas.dameFecha().get(Calendar.MONTH) == Calendar.DECEMBER && indiceEntradas.dameFecha().get(Calendar.DAY_OF_MONTH) == i){ 
                    contador++;
                    contadorClientes[i-1] = contador;
                    contadorClientesMensual++;
                    contadorClientesAnual++;
                    suma += indiceEntradas.dimePrecioTotal();
                    sumaPrecio[i-1] = suma;
                    sumaPrecioMensual += indiceEntradas.dimePrecioTotal();
                    sumaPrecioAnual += indiceEntradas.dimePrecioTotal();
                }
            }
        }
        System.out.println("");
        System.out.print("Cantidad de clientes:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d",contadorClientes[j]);
            }else{System.out.printf("%8d",contadorClientes[j]);}
        }
        System.out.println("");
        System.out.print("Precio medio de entrada: ");
        for(int k=0;k<31;k++)
        {
            if(contadorClientes[k] == 0)
            {
                if(k<9)
                {
                    System.out.printf("%6d€",0);
                }else{System.out.printf("%7d€",0);}
            }else{ 
                if(k<9)
                {
                    System.out.printf("%6d€",sumaPrecio[k]/contadorClientes[k]);
                }else{System.out.printf("%7d€",sumaPrecio[k]/contadorClientes[k]);}
                }
            
        }
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes Diciembre: " + contadorClientesMensual);
        if(contadorClientesMensual == 0)
        {
             System.out.println("Precio medio de entrada Diciembre: 0€");
        }else{ System.out.println("Precio medio de entrada Diciembre: " + sumaPrecioMensual/contadorClientesMensual + "€"); }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Cantidad de clientes anual: " + contadorClientesAnual);
        System.out.println("Precio medio de entrada Anual: " + sumaPrecioAnual/contadorClientesAnual + "€");
    }
    
    /**
     * Metodo para controlar si funcionan las atracciones
     */
    public void menucontrolAtracciones()
    {
        boolean nombre = true;
        System.out.println("Dime el nombre de la atraccion a la que deseas modificar el estado");
        Scanner entrada = new Scanner(System.in);
        String atraccion = entrada.next();
        for (AtraccionesFuncionando indiceAtracciones : lista)
        {
            if(indiceAtracciones.dameNombre().equalsIgnoreCase(atraccion))
            {
                indiceAtracciones.estadoAtraccon();
                nombre = true;
                break;
            }else 
            {
                nombre = false;
            }
        }
        if(nombre == false) { System.out.println("La atraccion no existe");}
    }
    
    /**
     * Metodo para listar los gastos del parque
     */
    public void menuFinanciero()
    {
        int gastoPersonalDiario = 0;
        int gastoPersonalMensual;
        int gastoPersonalAnual = 0;
        System.out.println("");
        System.out.println("\nEnero: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=31;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.JANUARY & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/31;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Enero: " + gastoPersonalMensual + "€");
        
        System.out.println("");
        System.out.println("\nFebrero: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=28;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.FEBRUARY & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/28;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/28;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/28;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<28;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Febrero: " + gastoPersonalMensual + "€");
        
        System.out.println("");
        System.out.println("\nMarzo: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=31;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.MARCH & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/31;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Marzo: " + gastoPersonalMensual + "€");
        
        System.out.println("");
        System.out.println("\nAbril: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=30;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.APRIL & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/30;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/30;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/30;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<30;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Abril: " + gastoPersonalMensual + "€");
        
        System.out.println("");
        System.out.println("\nMayo: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=31;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.MAY & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/31;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Mayo: " + gastoPersonalMensual + "€");
        
        System.out.println("");
        System.out.println("\nJunio: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=30;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.JUNE & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/30;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/30;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/30;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<30;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Junio: " + gastoPersonalMensual + "€");
        
        System.out.println("");
        System.out.println("\nJulio: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=31;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.JULY & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/31;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Julio: " + gastoPersonalMensual + "€");
        
        System.out.println("");
        System.out.println("\nAgosto: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=31;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.AUGUST & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/31;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Agosto: " + gastoPersonalMensual + "€");
        
        System.out.println("");
        System.out.println("\nSeptiembre: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=30;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.SEPTEMBER & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/30;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/30;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/30;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<30;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Septiembre: " + gastoPersonalMensual + "€");
        
        System.out.println("");
        System.out.println("\nOctubre: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=31;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.OCTOBER & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/31;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Octubre: " + gastoPersonalMensual + "€");
        
        System.out.println("");
        System.out.println("\nNoviembre: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=30;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.NOVEMBER & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/30;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/30;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/30;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<30;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Noviembre: " + gastoPersonalMensual + "€");
        
        System.out.println("");
        System.out.println("\nDiciembre: ");
        gastoPersonalMensual = 0;
        System.out.print("                      ");
        for(int i = 1;i<=31;i++)
        {
            gastoPersonalDiario = 0;
            System.out.print("Dia " + i+"   ");
            for (AtraccionesFuncionando indiceAtracciones : lista) {
                if(indiceAtracciones.dameMesMantenimiento() == Calendar.DECEMBER & indiceAtracciones.dameFunciona() == false)
                {}else {
                    gastoPersonalDiario += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalMensual += (int)indiceAtracciones.calculoCoste()/31;
                    gastoPersonalAnual += (int)indiceAtracciones.calculoCoste()/31;  
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Gasto personal:    ");
        for(int j=0;j<31;j++)
        {
            if(j<9)
            {
                System.out.printf("%7d€",gastoPersonalDiario);
            }else{System.out.printf("%8d€",gastoPersonalDiario);}
        }
        
        System.out.println("");   
        System.out.println("");
        System.out.println("Gasto personal Diciembre: " + gastoPersonalMensual + "€");
        
        System.out.println(""); 
        System.out.println("");
        System.out.println("");
        System.out.println("Gasto personal anual: " + gastoPersonalAnual + "€");
    }
}
