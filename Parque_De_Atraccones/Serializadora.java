import java.io.*;
/**
 * Clase para manejar el archivo externo
 * 
 * @author (Sergio Camara) 
 * @version (1.0)
 */


public class Serializadora {

    private ObjectInputStream lector;
    //private MiObjectOutputStream escritor;
    
    /**
     * Metodo para escribir el archivo externo
     * 
     * @param objeto para incluir en el fichero
     * @param nombre del fichero
     */
    public static <T> void escribirObjeto(T objeto,String nombreFichero){
        FileOutputStream fos = null;
        ObjectOutputStream escritor = null;
        try{
            fos=new FileOutputStream(nombreFichero,true);
            escritor=new ObjectOutputStream(fos);
            escritor.writeObject(objeto);
            escritor.flush();
            escritor.reset();
        }   catch (FileNotFoundException e){
                e.printStackTrace();
        }   catch (IOException e){
                e.printStackTrace();
        }   finally {
            if (escritor!=null){
                try{
                    escritor.close();
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
    /**
     * Metodo para escribir el archivo externo
     * 
     * @param nombre del fichero
     * @return datos del fichero
     */
    public Object leerObjeto(String nombreDelArchivo){
        Object retorno=null;
        try{
            lector=new ObjectInputStream(new FileInputStream(nombreDelArchivo));
            retorno=lector.readObject();
        }   catch (FileNotFoundException e){
                e.printStackTrace();
        }   catch (IOException e){
                e.printStackTrace();
        }   catch (ClassNotFoundException e){
                e.printStackTrace();
        }
        return retorno; 
    }
    
}
