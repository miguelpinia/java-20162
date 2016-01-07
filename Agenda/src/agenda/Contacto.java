package agenda;

/**
 * Esta clase representa un
 * contacto para la agenda telefónica.
 *
 * @author miguel
 */
public class Contacto {

    String nombre;

    String telefono;

    String email;

    String direccion;

    public Contacto() {
        nombre = "";
        telefono = "";
        email = "";
        direccion = "";
    }

    public Contacto(String nombre, String telefono
                    , String email, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

}
