import interaccion.Consola;
import util.OperacionesMath;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio del programa");
        Consola consola = new Consola();
        OperacionesMath operacionesMath = new OperacionesMath();
        double num1 = consola.leer();
        double num2 = consola.leer();
        String decision = consola.tercerNumero();
        if (decision.equals("si")) {
            double num3 = consola.leer();
            System.out.println("Suma: " + operacionesMath.suma(num1, num2, num3));
            System.out.println("Resta: " + operacionesMath.resta(num1, num2, num3));
            System.out.println("Multiplicacion: " + operacionesMath.multiplicacion(num1, num2, num3));
            System.out.println("Division: " + operacionesMath.division(num1, num2, num3));
        }else{
            System.out.println("Suma: " + operacionesMath.suma(num1, num2));
            System.out.println("Resta: " + operacionesMath.resta(num1, num2));
            System.out.println("Multiplicacion: " + operacionesMath.multiplicacion(num1, num2));
            System.out.println("Division: " + operacionesMath.division(num1, num2));
        }
    }
}
