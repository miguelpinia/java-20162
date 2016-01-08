/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OpcionesAgenda menu = new OpcionesAgenda();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            String opciones = "Bienvenido\n"
            + "1) Agregar contacto\n"
            + "2) Eliminar contacto\n"
            + "3) Modificar contacto\n"
            + "4) Buscar contacto\n"
            + "0) Salir";
            System.out.println(opciones);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Dame el nombre: ");
                    String nom = sc.next();
                    System.out.println("Dame el telefono: ");
                    String tel = sc.next();
                    System.out.println("Dame el correo: ");
                    String email = sc.next();
                    System.out.println("Dame la direccion: ");
                    String dir = sc.next();
                    Contacto nuevo = new Contacto(nom, tel, email, dir);
                    boolean agregado = menu.agregarContacto(nuevo);
                    if (agregado) {
                        System.out.println("Se agregó el contacto");
                    } else {
                        System.out.println("Hubo un error");
                    }
                    break;
                case 2:
                    System.out.println("Dame el nombre: ");
                    String nomBorrar = sc.next();
                    boolean eliminado = menu.eliminaContacto2(nomBorrar);
                    if (eliminado) {
                        System.out.println("Se borró correctamente");
                    } else {
                        System.out.println("Error al eliminar el contacto");
                    }
                    break;
                case 3:
                    System.out.println("Dame el nombre: ");
                    String nom1 = sc.next();
                    boolean modificado = menu.modificarContacto(nom1);
                    if (modificado) {
                        System.out.println("Se modificó correctamente");
                    } else {
                        System.out.println("Error al modificar");
                    }
                    break;
                case 4:
                    System.out.println("Dame el nombre: ");
                    String nomBusqueda = sc.next();
                    Contacto c = menu.busqueda(nomBusqueda);
                    System.out.println("Nombre: " + c.getNombre());
                    System.out.println("Telefono: " + c.getTelefono());
                    System.out.println("Correo: " + c.getEmail());
                    System.out.println("Dirección: " + c.getDireccion());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

}
