package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivos {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            // Lectura de archivos
            File f = new File("miArchivo.txt");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String lectura = null;
            while((lectura = br.readLine()) != null) {
                System.out.println("====================");
                String[] datos = lectura.split(";");
                for(int i = 0; i < datos.length; i++) {
                    System.out.println("Dato "  + i + ":"
                                        + datos[i]);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo");
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar la lectura");
            }
        }
    }

}
