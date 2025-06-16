package ejecutarprestamo;

public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoMeses;
    protected String ciudad;

    public Prestamo(Persona beneficiario, int tiempoMeses, String ciudad) {
        this.beneficiario = beneficiario;
        this.tiempoMeses = tiempoMeses;
        this.ciudad = ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString() {
        return
        String.format("%s\nTiempo: %d meses\nCiudad: %s", beneficiario, tiempoMeses, ciudad);
    }
}
