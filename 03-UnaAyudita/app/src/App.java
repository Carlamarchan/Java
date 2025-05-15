import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // EJERCICIO 1
        int month = 0;
        do {
            System.out.println("Ingresa un número del mes");
            month = teclado.nextInt();
        } while (month <= 0 || month > 12);
        {

            teclado.nextLine();
            switch (month) {
                case 12, 1, 2:
                    System.out.println("Es invierno y odio el frio!");
                    break;
                case 3, 4, 5:
                    System.out.println("La primavera me altera!");
                    break;
                case 6, 7, 8:
                    System.out.println("Es verano y odio el calor!");
                    break;
                case 9, 10, 11:
                    System.out.println("El otoño si que es una buena época del año");
                    break;
                default:
                    break;
            }

        }

        // EJERCICIO 2

        System.out.println("Una ayudita?");
        String respuesta = teclado.nextLine();

        Float dineroRecaudado = 0F;
        int totalPersonas = 0;
        while (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Cuánto desea donar?");
            dineroRecaudado += teclado.nextFloat();
            teclado.nextLine();
            totalPersonas++;

            System.out.println("Una ayudita?");
            respuesta = teclado.nextLine();
        }

        System.out.println("Que mal, me voy a mi casa");
        System.out.println("Total recaudado: " + dineroRecaudado);
        System.out.println("Total personas: " + totalPersonas);

        // EJERCICIO 3
        Byte sound = 0;
        System.out.println("Quieres escuchar un sonido?");
        String pregunta = teclado.nextLine();
        while (pregunta.equalsIgnoreCase("si")) {
            System.out.println("Qué sonido quieres escuchar?");
            sound = teclado.nextByte();
            teclado.nextLine();
            switch (sound) {
                case 1:
                    System.out.println("Has escogido el cohete y hace ziuuuummm!");
                    break;
                case 2:
                    System.out.println("Has escogido el coche y hace piiiiiiiii");
                    break;
                case 3:
                    System.out.println("Has escogido la moto y suena Brrmmmmm!");
                    break;

                default:
                    System.out.println("No has escogido un valor correcto");
                    break;
            }
            System.out.println("Quieres escuchar otro sonido?");
            pregunta = teclado.nextLine();
        }
        teclado.close();
    }

}
