package ejecutarprestamo;

public class Persona {
    private String nombre;
    private String apellido;
    private String username;

    public Persona(String nombre, String apellido, String username) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
    }
    
    @Override
    public String toString() {
        return
        String.format("Nombre: %s %s - Username: %s", nombre, apellido, username);
    }
}
