package interaccion;

import util.Utilidades;

import java.util.Date;
import java.util.Scanner;

public class Consola {
    private Scanner sc = new Scanner(System.in);

    public long leerNumero(String mensaje) {
        System.out.print(mensaje + " : ");
        long numero = sc.nextLong();
        sc.nextLine(); // Consumir nueva línea dejada por nextLong()
        return numero;
    }

    public String leerCadena(String mensaje) {
        System.out.print(mensaje + " : ");
        String cadena = sc.nextLine();
        return cadena;
    }

    public Date leerFecha(String mensaje) {
        String fechaS = this.leerCadena(mensaje);
        Utilidades util = new Utilidades();
        Date fecha = util.convertirStringDate(fechaS);
        return fecha;
    }

    public void imprimir(String datoImprimir) {
        System.out.println(datoImprimir);
    }
}
