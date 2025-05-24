import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // EJERCICIO 1
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 20; i <= 50; i++) {
            numeros.add(i);
        }
        System.out.println(numeros);

        // EJERCICIO 2
        ArrayList<String> elementosSJ = new ArrayList<>();
        String elemento = "";
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingresa un elemento típico de la fiesta de Sant Jordi:  (Para terminar escribe SALIR)");
            elemento = teclado.nextLine();
            if (!elemento.equalsIgnoreCase("salir")) {
                elementosSJ.add(elemento);
            }
        } while (!elemento.equalsIgnoreCase("salir"));
        System.out.println(elementosSJ);
        teclado.close();

        // EJERCICIO 3
        ArrayList<String> invitados = new ArrayList<>();
        invitados.add("Carla");
        invitados.add("Albert");
        invitados.add("Elizabeth");
        invitados.add("Daya");
        invitados.add("Luis");

        System.out.println("La lista original es: " + invitados);

        invitados.remove(1);
        invitados.remove(1);
        System.out.println("La lista actualizada eliminando a los invitados 2 y 3 es: " + invitados);

        invitados.add(1, "Anthonny");
        System.out.println("La lista actualizada añadiendo el invitado 2 es: " + invitados);
        invitados.set(invitados.size() - 1, "Daniel");
        System.out.println("La lista actualizada actualizando el último invitado es: " + invitados);
        invitados.add(2, "Katherine");
        System.out.println("La lista actualizada añadiendo el invitado 3 es: " + invitados);

    }
}
