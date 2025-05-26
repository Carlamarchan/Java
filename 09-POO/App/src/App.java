import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Ordenador ordenador1 = new Ordenador("Dell", "i7", "16Gb", 700, false);
        Ordenador ordenador2 = new Ordenador("Acer", "i5", "8Gb", 500, true);
        Ordenador ordenador3 = new Ordenador("Asus", "intel", "32Gb", 580, true);

        ArrayList<Ordenador> listaOrdenadores = new ArrayList<>(Arrays.asList(ordenador1, ordenador2, ordenador3));

        System.out.println(ordenador1.toString());
        System.out.println(ordenador2.toString());
        System.out.println(ordenador3.toString());

        System.out.println("Deseas una lista con los ordenadores de oferta? (S/N)");
        Scanner teclado = new Scanner(System.in);
        String imprimirOrdenadoresOferta = teclado.nextLine();
        if (imprimirOrdenadoresOferta.equalsIgnoreCase("s")) {
            for (Ordenador ordenador : listaOrdenadores) {
                if (ordenador.isOferta()) {
                    System.out.println(ordenador);
                }
            }
        }
        System.out.println("Entre los ordenadores de oferta, la marca hace la diferencia! " + ordenador2.getMarca()
                + " es una excelente marca!");
        System.out.println("Sin embargo, la memoria del ordenador " + ordenador3.getMarca() + "es inmejorable!");
        System.out.println("Además, si te llevas más de un ordenador (repetido), se te hará un excelente descuento.");
        System.out.println("Deseas ordenar más de un ordenador? (S/N)");
        String ordenar = teclado.nextLine();
        System.out.println("Qué ordenador deseas ordenar?");
        String marca = teclado.nextLine();
        Ordenador ordenadorPorMarca = null;

        for (Ordenador ordenador : listaOrdenadores) {
            if (ordenador.getMarca().equalsIgnoreCase(marca)) {
                ordenadorPorMarca = ordenador;
            }
        }
        if (ordenar.equalsIgnoreCase("S")) {
            System.out.println("Cuántos ordenadores quieres?");
            int totalOrdenadores = teclado.nextInt();
            teclado.nextLine();
            System.out.println("El total a pagar es: " + totalAPagar(totalOrdenadores, ordenadorPorMarca));
        }

        teclado.close();
    }

    public static double totalAPagar(int totalOrdenadores, Ordenador ordenador) {
        double total = ordenador.getPrecio() * 0.8 * totalOrdenadores;
        return total;
    }

}
