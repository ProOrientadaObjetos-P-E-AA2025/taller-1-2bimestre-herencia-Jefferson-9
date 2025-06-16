package paquete3;

import paquete2.Prestamo;
import paquete4.Persona;

public class PrestamoAutomovil extends Prestamo {
    private String tipoAuto;
    private String marcaAuto;
    private Persona garante1;
    private double valorAuto;
    private double valorMensual;

    public PrestamoAutomovil(String tipoAuto, String marcaAuto, Persona garante1, double valorAuto, Persona beneficiario, int tiempoMeses, String ciudad) {
        super(beneficiario, tiempoMeses, ciudad.toLowerCase());
        this.tipoAuto = tipoAuto;
        this.marcaAuto = marcaAuto;
        this.garante1 = garante1;
        this.valorAuto = valorAuto;
        calcularValorMensual();
    }
    
    public void calcularValorMensual() {
        valorMensual = valorAuto / tiempoMeses;
    }
    
    @Override
    public String toString() {
        return
        String.format("=== Préstamo Automóvil ===\n%s\nTipo Auto: %s\nMarca: %s\nGarante: %s\nValor Auto: %.2f\nValor mensual: %.2f", 
                super.toString(), tipoAuto, marcaAuto, garante1, valorAuto, valorMensual);
    }
}
