import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // EJERCICIO 1º

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        int arrayLenght = teclado.nextInt();
        teclado.nextLine();
        String nombres[] = new String[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            System.out.println("Ingrese el " + (i + 1) + "º" + " nombre:");
            nombres[i] = teclado.nextLine();
        }
        System.out.println(Arrays.toString(nombres));

        // EJERCICIO 2º
        int numeros[] = new int[20];
        numeros[0] = 10;
        numeros[1] = 2;
        numeros[2] = 5;
        numeros[3] = 8;
        numeros[4] = 6;
        numeros[5] = 3;
        numeros[6] = 13;
        numeros[7] = 15;
        numeros[8] = 7;
        numeros[9] = 20;
        numeros[10] = 3;
        numeros[11] = 9;
        numeros[12] = 4;
        numeros[13] = 1;
        numeros[14] = 2;
        numeros[15] = 10;
        numeros[16] = 2;
        numeros[17] = 10;
        numeros[18] = 6;
        numeros[19] = 11;

        int totalPares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                totalPares++;
            }
        }

        int paresArray[] = new int[totalPares];
        int imparesArray[] = new int[numeros.length - totalPares];
        int posicionPar = 0;
        int posicionImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {

                paresArray[posicionPar] = numeros[i];
                posicionPar++;

            } else {
                imparesArray[posicionImpar] = numeros[i];
                posicionImpar++;
            }

        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(paresArray));
        System.out.println(Arrays.toString(imparesArray));

        // EJERCICIO 3º

        String names[] = new String[5];
        names[0] = "Carla";
        names[1] = "Anthonny";
        names[2] = "Albert";
        names[3] = "Elizabeth";
        names[4] = "Daya";

        String randomGanador = "si";
        while (randomGanador.equalsIgnoreCase("si")) {
            int ganador = (int) (Math.random() * 5);
            System.out.println(ganador);
            System.out.println("Quieres generar un ganador para las vacaciones a Ibiza? SI-NO");
            randomGanador = teclado.nextLine();
            if (randomGanador.equalsIgnoreCase("si")) {
                System.out.println("El ganador de las vacaciones es: " + names[ganador]);
            }
        }
        teclado.close();
    }
}
