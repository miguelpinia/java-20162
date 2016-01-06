package agenda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa las operaciones que debe
 * tener la agenda telefónica.
 * @author miguel
 */
public class Menu {

    ArrayList<Contacto> listaDeContactos;

    public Contacto busqueda(String nombre) {
        for (int i = 0; i < listaDeContactos.size(); i++) {
            Contacto c = listaDeContactos.get(i);
            if (c.nombre.equals(nombre)) {
                return c;
            }
        }
        return null;
    }

    public void agregarContacto(Contacto contacto) {
        listaDeContactos.add(contacto);
    }

    public boolean eliminaContacto(String nombre) {
        for (int i = 0; i < listaDeContactos.size(); i++) {
            Contacto c = listaDeContactos.get(i);
            if (c.nombre.equals(nombre)) {
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
    }

}
