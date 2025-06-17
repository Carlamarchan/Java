public class Camion {
    static int numRuedas = 6;
    boolean traccionTrasera;

    

    public Camion(boolean traccionTrasera) {
        this.traccionTrasera = traccionTrasera;
    }

    public static void acelerar() {
        System.out.println("Estoy acelerandooooo");

    }

    public static void frenar() {
        System.out.println("Estoy frenandoooooo");
    }

    @Override
    public String toString() {
        return "Camion [Número de ruedas= " + numRuedas + ", traccionTrasera= " + traccionTrasera + "]";
    }

}
