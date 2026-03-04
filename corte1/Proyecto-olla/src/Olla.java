public class Olla {

    public String metal;
    public String color;

    public Olla(String metal, String color) {
        this.metal = metal;
        this.color = color;
    }
    public Olla(String metal) {
        this.metal = metal;
    }
    public static void main(String[] args) throws Exception {
        Olla olla1 = new Olla("Acero", "Rojo");
        Olla olla2 = new Olla("Aluminio");
        System.out.println("Olla 1: " + olla1.metal + " " + olla1.color);
        System.out.println("Olla 2: " + olla2.metal);
    }
}
