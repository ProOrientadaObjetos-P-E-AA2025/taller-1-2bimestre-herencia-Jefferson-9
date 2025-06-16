package ejecutarprestamo;

import java.util.Scanner;
import java.util.ArrayList;

public class EjecutarPrestamo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("        === MENÚ ===");
            System.out.println("¿Qué préstamo desea ingresar?");
            System.out.println("1. Automóvil");
            System.out.println("2. Educativo");
            System.out.println("3. Terminar");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            
            if (opcion == 1) {
                System.out.println("--- Datos del Beneficiario ---");
                Persona p = leerPersona(sc);
                
                System.out.print("Ciudad: ");
                String ciudad = sc.nextLine();
                
                System.out.print("Tiempo (en meses): ");
                int meses = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Tipo Auto: ");
                String tipo = sc.nextLine();
                
                System.out.print("Marca Auto: ");
                String marca = sc.nextLine();
                
                System.out.println("--- Datos del Garante ---");
                Persona garante = leerPersona(sc);
                
                System.out.print("Valor Auto: ");
                double valorAuto = sc.nextDouble();
                sc.nextLine();
                
                PrestamoAutomovil pa = new PrestamoAutomovil(tipo, marca, garante, valorAuto, p, meses, ciudad); 
                prestamos.add(pa);
            } else if (opcion == 2) {
                System.out.println("--- Datos del Beneficiario ---");
                Persona p = leerPersona(sc);
                
                System.out.print("Ciudad: ");
                String ciudad = sc.nextLine();
                
                System.out.print("Tiempo (en meses): ");
                int meses = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Nivel de estudio: ");
                String nivel = sc.nextLine();
                
                System.out.print("Nombre institución: ");
                String nombreInst = sc.nextLine();
                
                System.out.print("Siglas institución: ");
                String siglas = sc.nextLine();
                
                InstitucionEducativa inst = new InstitucionEducativa(nombreInst, siglas);
                
                System.out.print("Valor carrera: ");
                double valorCarrera = sc.nextDouble();
                sc.nextLine();
                
                PrestamoEducativo pe = new PrestamoEducativo(nivel, inst, valorCarrera, p, meses, ciudad);
                prestamos.add(pe);
                
            } else if (opcion == 3) {
                continuar = false;
            } else {
                System.out.println("Opción inválida.");
            }
        }
        
        System.out.println("\n=== Lista de Préstamos Registrados ===");
        for (Prestamo pr : prestamos) {
            System.out.println("---------------------------------------");
            System.out.println(pr);
        }
    }
    
    public static Persona leerPersona(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        
        System.out.print("Username: ");
        String username = sc.nextLine();
        
        return new Persona(nombre, apellido, username);
    }
}
