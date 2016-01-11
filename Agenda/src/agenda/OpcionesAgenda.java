package agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa las operaciones que debe
 * tener la agenda telefónica.
 * @author miguel
 */
public class OpcionesAgenda {

    private ArrayList<Contacto> listaDeContactos;

    /**
     * Constructor de la clase.
     */
    public OpcionesAgenda() {
        listaDeContactos = new ArrayList<>();
        leeArchivo();
    }

    /**
     * Método encargado de realizar búsqueda sobre la lista.
     * Si no hay
     * un contacto con el nombre especificado regresa null.
     *
     * @param nombre El nombre a buscar.
     *
     * @return El contacto si existe,
     * null en caso de que no exista
     */
    public Contacto busqueda(String nombre) {
        for (int i = 0; i < listaDeContactos.size(); i++) {
            Contacto c = listaDeContactos.get(i);
            if (c.getNombre().equals(nombre)) {
                return c;
            }
        }
        return null;
    }

    public boolean agregarContacto(Contacto contacto) {
        return listaDeContactos.add(contacto);
    }

    public boolean eliminaContacto(String nombre) {
        for (int i = 0; i < listaDeContactos.size(); i++) {
            Contacto c = listaDeContactos.get(i);
            if (c.getNombre().equals(nombre)) {
                listaDeContactos.remove(c);
                return true;
            }
        }
        return false;
    }

    public boolean eliminaContacto2(String nombre) {
        return listaDeContactos.remove(busqueda(nombre));
    }

    public boolean modificarContacto(String nombre) {
        Contacto c = busqueda(nombre);
        Scanner sc = new Scanner(System.in);
        String menu = "¿Qué quieres modificar?\n"
                      + "1) Nombre\n"
                      + "2) Telefono\n"
                      + "3) Email\n"
                      + "4) Dirección\n";
        System.out.println(menu);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Dame el nombre: ");
                String nom = sc.next();
                listaDeContactos.remove(c);
                c.setNombre(nom);
                listaDeContactos.add(c);
                return true;
            case 2:
                System.out.println("Dame el telefono: ");
                String tel = sc.next();
                listaDeContactos.remove(c);
                c.setTelefono(tel);
                listaDeContactos.add(c);
                return true;
            case 3:
                System.out.println("Dame el correo: ");
                String email = sc.next();
                listaDeContactos.remove(c);
                c.setEmail(email);
                listaDeContactos.add(c);
                return true;
            case 4:
                System.out.println("Dame la dirección: ");
                String dir = sc.next();
                listaDeContactos.remove(c);
                c.setDireccion(dir);
                listaDeContactos.add(c);
                return true;
            default:
                System.out.println("Opción incorrecta!");
        }
        return false;
    }

    /**
     * Este método se encarga de leer el archivo
     * de contactos.
     */
    public void leeArchivo() {
        FileReader fr = null;
        try {
            File f = new File("contactos.txt");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String datos = null;
            while ((datos = br.readLine()) != null) {
                String info[] = datos.split(";");
                String nombre = info[0];
                String telefono = info[1];
                String email = info[2];
                String direccion = info[3];
                Contacto c = new Contacto(nombre
                                          , telefono
                                          , email
                                          , direccion);
                listaDeContactos.add(c);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error de I/O");
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                System.out.println("Error de I/O");
            }
        }
    }

    public void escribeArchivo() {
        FileWriter fw = null;
        try {
            File f = new File("contactos.txt");
            fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < listaDeContactos.size(); i++) {
                Contacto c = listaDeContactos.get(i);
                String salida = c.getNombre() + ";" +
                c.getTelefono() + ";" +
                c.getEmail() + ";" +
                c.getDireccion() + "\n";
                bw.write(salida);
            }
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
