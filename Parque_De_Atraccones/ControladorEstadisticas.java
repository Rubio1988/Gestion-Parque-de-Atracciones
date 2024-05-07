import java.io.*;
import java.util.*;
/**
 * Clase para poder introducir en el array el archivo externo
 * 
 * @author (Sergio Camara) 
 * @version (1.0)
 */


public class ControladorEstadisticas {
    //variables para crear un arraylist de entradas, escribirlo y tabajar con el
    private Entradas entrada;
    private ArrayList<Entradas> listaEntradas;
    //Variables para manejar el menu
    private Serializadora serializador;
    private InterfazParque interfaz;
    private int menu;
    private int menuEntradas;
    private int menuEstadisticas;
    private int contadorEntradas = 0;
    private int menuVisitantes;
    
    public ControladorEstadisticas() {
        
        listaEntradas = new ArrayList<>();
        interfaz = new InterfazParque();
        serializador = new Serializadora();
        
        listaEntradas = (ArrayList<Entradas>) serializador.leerObjeto("ficheroEntradas.dat");
        
        menu();
    }
    
    /**
     * Menu principal
     */
    private void menu() {
        
        menu = interfaz.menuPrincipal();
        
        switch(menu) {
            case 1:
                menuEntradas();
                break;
            case 2:
                menuEstadisticas();
                break;
            case 3:
                controlAtracciones();
                break;
            case 4:
                manejoArchivo();
                System.out.println();    
                System.out.println("********************************");
                System.out.println("*                              *");
                System.out.println("*         Hasta pronto.        *");
                System.out.println("*                              *");
                System.out.println("********************************");
                System.out.println("");
                System.out.println("");
                System.exit(1);
        }
        
    }

    /**
     * Menu compra de entradas
     */
    private void menuEntradas() {
        
        menuEntradas = interfaz.menuComprarEntradas();
        
        switch(menuEntradas) {
            case 1:
                entradaIndividual();
                menu();
                break;
            case 2:
                entradaFamilia();
                                contadorEntradas++;
                                while(contadorEntradas<4)
                                {
                                    entradaFamilia();
                                    contadorEntradas++;
                                } 
                                menu();
                break;
            case 3:
                entradaGrupo();
                                System.out.println("¿Cuantas entradas mas quieres?");
                                Scanner introducir = new Scanner(System.in);
                                String comprobacion;//variable para comprobar si el dato introducido es un numero
                                comprobacion=introducir.nextLine();
                                if (comprobarSiEsNumero(comprobacion)){
                                    contadorEntradas=Integer.parseInt(comprobacion);
                                }else 
                                {
                                    System.out.println("");
                                    System.out.println("Sólo dígitos sin espacios son admitidos.");
                                }
                                for(int i=0;i<contadorEntradas;i++)
                                {
                                    entradaGrupo();
                                }
                                menu();
                break;
            case 4:
                manejoArchivo();
                System.out.println();    
                System.out.println("********************************");
                System.out.println("*                              *");
                System.out.println("*         Hasta pronto.        *");
                System.out.println("*                              *");
                System.out.println("********************************");
                System.out.println("");
                System.out.println("");
                System.exit(1);
        }
        
     }
    
    /**
     * Metodo para comprobar que lo que se introduce es un numero
     * 
     * @param string a comprobar
     * @return true si es un numero
     */
    public boolean comprobarSiEsNumero(String cadena){  
        try {
            int numero= Integer.parseInt(cadena);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    
    /**
     * Menu manejo de las estadisticas
     */
    private void menuEstadisticas() {
        
        menuEstadisticas = interfaz.menuEstadisticas();
        
        switch(menuEstadisticas) {
            case 1:
                listarEstadisticas();
                break;
            case 2:
                listarEstadisticasVisitantes();
                break;
            case 3:
                listarEstadisticasFinancieras();
                break;
            case 4:
                manejoArchivo();
                System.out.println();    
                System.out.println("********************************");
                System.out.println("*                              *");
                System.out.println("*         Hasta pronto.        *");
                System.out.println("*                              *");
                System.out.println("********************************");
                System.out.println("");
                System.out.println("");
                System.exit(1);
        }
        
    }
    
    /**
     * Metodo para acceder al menu de control de atracciones
     */
    private void controlAtracciones()
    {
        interfaz.menucontrolAtracciones();
        menu();
    }
    
    /**
     * Metodo para acceder al menu de comprar entrada individual
     */
    private void entradaIndividual() {
       entrada = interfaz.comprarEntrada();
       listaEntradas.add(entrada);  
    }
    
    /**
     * Metodo para acceder al menu de comprar entrada familiar
     */
    private void entradaFamilia() {
       entrada = interfaz.comprarEntradaFamilia();
       listaEntradas.add(entrada);
    }

    /**
     * Metodo para acceder al menu de comprar varias entradas
     */
    private void entradaGrupo() {
       entrada = interfaz.comprarEntradaGrupo();
       listaEntradas.add(entrada);
    }
    
    /**
     * Metodo para acceder al menu de estadisticas de entradas
     */
    private void listarEstadisticas() {
        interfaz.listadoEntradas(listaEntradas);
        menu();
    }
    
    /**
     * Metodo para acceder al menu de estadisticas de visitantes
     */
    private void listarEstadisticasVisitantes() {
        interfaz.listadoVisitantes(listaEntradas);
        menu();
    }
    
    /**
     * Metodo para acceder al menu de estadisticas financieras
     */
    private void listarEstadisticasFinancieras() {
        interfaz.menuFinanciero();
        menu();
    }
    
    /**
     * Metodo para acceder al archivo externo, vaciarlo y volver a llenarlo con los datos actualizados
     */
    public void manejoArchivo() {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("ficheroEntradas.dat"));
            bw.write("");
            bw.close();
        } catch (IOException e){
                e.printStackTrace();
        } 
        serializador.escribirObjeto(listaEntradas, "ficheroEntradas.dat");
    }
}