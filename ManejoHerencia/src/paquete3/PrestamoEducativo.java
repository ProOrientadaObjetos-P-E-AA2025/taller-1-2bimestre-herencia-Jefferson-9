package paquete3;

import paquete2.Prestamo;
import paquete4.InstitucionEducativa;
import paquete4.Persona;

public class PrestamoEducativo extends Prestamo {
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera, Persona beneficiario, int tiempoMeses, String ciudad) {
        super(beneficiario, tiempoMeses, ciudad.toUpperCase());
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        calcularValorMensual();
    }
    
    public void calcularValorMensual() {
        double base = valorCarrera / tiempoMeses;
        valorMensual = base - (base * 0.10);
    }
    
    @Override
    public String toString() {
        return
        String.format("=== Préstamo Educativo ===\n%s\nNivel: %s\nCentro: %s\nValor Carrera: %.2f\nValor mensual: %.2f",
                super.toString(), nivelEstudio, centroEducativo, valorCarrera, valorMensual);
    }
}
