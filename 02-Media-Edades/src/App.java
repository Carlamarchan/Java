import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // EJERCICIO1
        Scanner teclado = new Scanner(System.in);
        int age = 5;
        while (age < 6 || age > 120) {
            System.out.println("Ingresa tu edad: ");
            age = teclado.nextInt();

        }

        teclado.nextLine();
        if (age > 6 && age <= 12) {
            System.out.println("Estás en primaria ");
        } else if (age > 13 && age <= 18) {
            System.out.println("Estás en la secundaria");
        } else if (age > 18 && age <= 23) {
            System.out.println("Estás en la universidad");
        } else {
            System.out.println("Estás trabajando");
        }

        // EJERCICIO 2

        for (int i = 20; i >= 10; i--) {
            System.out.println("El cuadrado de " + i + " es: " + (i * i));
        }

        // EJERCICIO 3
        System.out.println("Ingresa el nombre de tu madre:");
        String mothersName = teclado.nextLine();
        System.out.println("Ingresa la edad de tu madre");
        int mothersAge = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa el nombre de tu padre:");
        String fathersName = teclado.nextLine();
        System.out.println("Ingresa la edad de tu madre");
        int fathersAge = teclado.nextInt();
        teclado.nextLine();
        float average =  (((float) mothersAge + fathersAge) / 2);
        System.out.println("Tu madre se llama " + mothersName + " y tiene " + mothersAge + " años de edad.");
        System.out.println("Tu padre se llama " + fathersName + " y tiene " + fathersAge
                + " años de edad. La media de sus edades es: " + average);

        teclado.close();

    }
}
