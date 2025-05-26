
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> invitados = new ArrayList<>(Arrays.asList("Michael", "Anthonny", "Katherine", "Marlene",
                "Alberto", "Juan", "Luis", "Daya", "Kiara", "Vicente"));
        System.out.println("La lista original es: " + invitados);
        invitados.remove(0);
        System.out.println("La lista sin el primer invitado es: " + invitados);
        invitados.add("Pepi");
        invitados.add("Silvester");
        System.out.println("La lista añadiendo 2 invitados es: " + invitados);
        invitados.add(2, "Eva");
        System.out.println("La lista de invitados aumentando a Eva en la posición 3 es: " + invitados);

        ArrayList<String> invitados2 = new ArrayList<>(Arrays.asList("Elizabeth", "Pedro", "María", "Elena", "Darío",
                "Fernanda", "Pepe", "Juan", "Luisa", "Sandra"));

        ArrayList<String> totalInvitados = new ArrayList<>();
        totalInvitados.addAll(invitados);
        totalInvitados.addAll(invitados2);
        System.out.println("La lista de invitados junto a los invitados de la otra fiesta es: " + totalInvitados);
        Collections.sort(totalInvitados);
        System.out.println("La lista total de invitados ordenados alfabéticamente es: " + totalInvitados);

        if (totalInvitados.contains("Pedro")) {
            int position = totalInvitados.indexOf("Pedro");
            System.out.println("Pedro se encuentra en la posición " + (position + 1) + " de la lista de invitados");
        } else {
            System.out.println("Pedro no está en la lista de invitados");
        }
        // EJERCICIO 2
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Cuántos números quieres introducir?");
        int totalNumeros = teclado.nextInt();
        int suma = 0;
        teclado.nextLine();
        for (int i = 0; i < totalNumeros; i++) {
            System.out.println("Ingrese el " + (i + 1) + "º número");
            int valorActual = teclado.nextInt();
            suma = suma + valorActual;
            numeros.add(valorActual);
            teclado.nextLine();
        }

        float promedio = (float) suma / totalNumeros;

        System.out.println("El promedio de los números ingresados es: " + promedio);

        teclado.close();

        // EJERCICIO 3
        String fraseAleatoria = "Los errores del pasado son la sabiduría del presente";
        int totalE = 0;
        char[] fraseSeparada = fraseAleatoria.toCharArray();
        ArrayList<Integer> posiciones = new ArrayList<>();
        for (int i = 0; i < fraseSeparada.length; i++) {
            if (fraseSeparada[i] == 'e') {
                totalE++;
                posiciones.add(i);
            }
        }

        if (totalE != 0) {
            System.out.println("Existe la \"E\" en la frase");
            System.out.println("El número total de veces que aparece la \"E\" es: " + totalE);
            System.out.println("Las posiciones en las que se encuentra cada letra \"E\" es: " + posiciones);

        }else{
            System.out.println("La letra \"E\" no se encuentra en la frase ");
        }

    }
}
