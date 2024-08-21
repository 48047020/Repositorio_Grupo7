
package programas;
import java.util.Scanner;
public class Programa03 {    
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    System.out.print("Nombre del Vendedor: ");
    String vendedor = lectura.nextLine();
    System.out.print("Sueldo Mensual: ");
    double sm = lectura.nextDouble();
    System.out.print("Venta 1: ");
    double v1 = lectura.nextDouble();
    System.out.print("Venta 2: ");
    double v2 = lectura.nextDouble();
    System.out.print("Venta 3: ");
    double v3 = lectura.nextDouble();   
    double c = (v1 + v2 +v3) * 0.10;
    double st = sm + c;    
    System.out.println("\n********* Registro *********");
    System.out.println("\nNombre: " + vendedor);
    System.out.println("Sueldo Mensual: S/" + sm);
    System.out.println("Venta 1: S/" + v1);
    System.out.println("Venta 2: S/" + v2);
    System.out.println("Venta 3: S/" + v3);
    System.out.println("Comision: S/" + c);
    System.out.println("Sueldo Total: S/" + st);            
    }     
} // Versión 1: {Proyecto Final - Grupo 7}
  // Integración NetBeans - GitHub - Jenkins {Proyecto Final - Grupo 7}
