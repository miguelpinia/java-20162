package archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritura {

    public static void main(String args[]) {
        FileWriter fw = null;
        try {
            File f = new File("miArchivo2.txt");
            fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);
            System.out.println("Dame un texto: ");
            String salida1 = sc.nextLine();
            bw.write(salida1);
            bw.flush();
        } catch (IOException ex) {
            System.out.println("Error de I/O");
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                System.out.println("Error de I/O");
            }
        }
    }

}
