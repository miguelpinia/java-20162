package agenda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa las operaciones que debe
 * tener la agenda telefónica.
 * @author miguel
 */
public class OpcionesAgenda {

    private ArrayList<Contacto> listaDeContactos;

    public OpcionesAgenda() {
        listaDeContactos = new ArrayList<>();
    }

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

}
