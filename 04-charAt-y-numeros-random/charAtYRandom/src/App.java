import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // EJERCICIO 1
        int contador = 0;
        int intento;
        int randomNumber = (int) (Math.random() * 5 + 1);
        do {
            System.out.println("He pensado en un número entre el 1 y el 5. Podrás adivinar cuál es?");
            intento = teclado.nextInt();
            teclado.nextLine();
            contador++;
        } while (intento != randomNumber);
        System.out.println("Has adivinado el número en el " + contador + "º intento");

        // EJERCICIO 2
        String color = "Green";
        System.out.println("He pensado en un color, podrás adivinar en el primer intento dicho color?");
        String intentoColor = teclado.nextLine();
        if (intentoColor.equalsIgnoreCase(color)) {
            System.out.println("Has adivinado el color en el primer intento!");
        } else {
            System.out.println("Lo siento, no has adivinado el color :(");
        }

        // EJERCICIO 3
        System.out.println("Ingresa una frase");
        String frase = teclado.nextLine();
        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.println("");

        // EJERCICIO 4
        System.out.println("Ingresa un número de teléfono");
        String phone = teclado.nextLine();
        System.out.println("El número sin guiones es: " + phone.replace("-",
                "").replace(".", "").replace(" ", ""));

        // EJERCICIO 5 //FORMA 1
        System.out.println("Ingresa una frase ");
        String frase2 = teclado.nextLine();
        // String frase2Temp = frase2.toUpperCase();

        // if (frase2.equals(frase2Temp)) {
        // System.out.println("La frase contiene solo mayúsculas");
        // } else {
        // frase2Temp = frase2.toLowerCase();
        // if (frase2.equals(frase2Temp)) {
        // System.out.println("La frase contiene solo minúsculas");
        // } else {
        // System.out.println("La frase contiene mayúsculas y minúsculas");
        // }
        // }

        // EJERCICIO 5 //FORMA 2
        Boolean min = false;
        Boolean may = false;
        for (int i = 0; i < frase2.length(); i++) {
            if (Character.isUpperCase(frase2.charAt(i))) {
                may = true;
            } else if (Character.isLowerCase(frase2.charAt(i))) {
                min = true;
            }
        }

        if (min && may) {
            System.out.println("La frase contiene mayúsculas y minúsculas");
        }

        if (min && !may) {
            System.out.println("La frase contiene solo minúsculas");
        }

        if (!min && may) {
            System.out.println("La frase contiene solo mayúsculas");
        }
        teclado.close();
    }
}
