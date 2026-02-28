import herencia.Gato;
import herencia.Perro;

public class App {
    public static void main(String[] args) throws Exception {
        Gato miGato = new Gato();
        miGato.nombreGato = "Mishu";
        miGato.color = "Negro";
        miGato.peso = 4.5;
        miGato.edad = 3;
        miGato.salvaje = false;

        Perro miPerro = new Perro();
        miPerro.nombrePerro = "Firulais";
        miPerro.raza = "Labrador";
        miPerro.peso = 30.0;
        miPerro.edad = 5;
        miPerro.salvaje = false;

        System.out.println("Gato: " + miGato.nombreGato + " (" + miGato.color + ") - Edad: " + miGato.edad);
        System.out.println("Perro: " + miPerro.nombrePerro + " (" + miPerro.raza + ") - Edad: " + miPerro.edad);
    }
}
