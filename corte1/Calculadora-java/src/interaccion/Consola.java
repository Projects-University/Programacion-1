package interaccion;
import java.util.Scanner;

public class Consola {
    public double leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        double num = scanner.nextDouble();
        return num;
    }
    public String tercerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Quieres ingresar el tercer número? (si/no)");
        String desicion = scanner.nextLine();
        return desicion;
    }
}
