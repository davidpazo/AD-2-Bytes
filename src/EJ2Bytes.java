
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class EJ2Bytes {

    static FileOutputStream out;
    static FileInputStream in;

    public static void main(String[] args) throws FileNotFoundException {
        String rutaFichOrigen = "/home/oracle/Desktop/Pruebas/texto1.txt";//Ruta al fichero de origen
        String rutaFichDestino = "/home/oracle/Desktop/Pruebas/texto2.txt"; //Ruta al fichero de destino
        File ficherorigen = new File("/home/oracle/Desktop/Pruebas/texto1.txt");//Creamos objeto de tipo fichero con la ruta origen.
        File ficheroDestino = new File("/home/oracle/Desktop/Pruebas/texto2.txt");//Creamos objeto de tipo fichero con la ruta destino.
        BufferedInputStream lectorFichero;
        BufferedOutputStream escritorFichero;
        try{
            lectorFichero = new BufferedInputStream(new FileInputStream(ficherorigen));//Inicializa el buffer de lectura con un objeto de tipo FileReader(lector de fichero).
            escritorFichero = new BufferedOutputStream(new FileOutputStream(ficheroDestino));//Inicializa el buffer de escritura con un objeto de tipo FileWriter(escritor de fichero).
            int linea;//variable ke ira conteniendo la linea ke leemos para despues escribirla
            while ((linea = lectorFichero.read()) != -1) { //mientras haya lineas...
                escritorFichero.write(linea);//Escribe la linea al fichero destino
          
                System.out.println(linea);//se imprime la linea copiada por consola
            }

            lectorFichero.close();//cerramos el lector
            escritorFichero.close();//cerramos el escritor
        }
    
    catch (FileNotFoundException e) {
            e.printStackTrace();
    }
    catch (IOException e1) {
            e1.printStackTrace();
    }

}
}