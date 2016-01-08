package agenda;

/**
 * Esta clase representa un
 * contacto para la agenda telefónica.
 *
 * @author miguel
 */
public class Contacto {

    private String nombre;
    private String telefono;
    private String email;
    private String direccion;

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
