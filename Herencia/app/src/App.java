import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Gato gato1 = new Gato("Miau", 3, true);
        Gato gato2 = new Gato("Dulce", 2, false);

        Perro perro1 = new Perro("Luna", 2, "Schnauzer");
        Perro perro2 = new Perro("Perla", 8, "Caniche");

        ArrayList<Mascota> listadeMascotas=new ArrayList<>();
        listadeMascotas.add(gato1);
        listadeMascotas.add(gato2);
        listadeMascotas.add(perro1);
        listadeMascotas.add(perro2);
        System.out.println(listadeMascotas);

    }
}
