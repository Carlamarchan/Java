import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // EJERCICIO 1.1:
        System.out.println("EJERCICIO 1.1");
        saludar1(teclado);

        // EJERCICIO 1.2:
        System.out.println("EJERCICIO 1.2");

        System.out.println("Ingresa el saludo");
        String saludo = teclado.nextLine();
        System.out.println("Ingresa el nombre");
        String nombre = teclado.nextLine();
        saludar2(saludo, nombre);

        // EJERCICIO 1.3:
        System.out.println("EJERCICIO 1.3");
        System.out.println("Ingresa el saludo");
        String saludo3 = teclado.nextLine();
        System.out.println("Ingresa el nombre");
        String nombre3 = teclado.nextLine();
        System.out.println(saludar3(saludo3, nombre3));

        // EJERCICIO 2:
        System.out.println("EJERCICIO 2");
        String operacion="";
        while(!operacion.equalsIgnoreCase("salir")){
        System.out.println("Ingresa el número 1");
        int numero1 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa el número 2");
        int numero2 = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa la operación a realizar ( +, -, *, /, salir )");
        operacion = teclado.nextLine();

        switch (operacion) {
            case "+":
                System.out.println(sumar(numero1, numero2));
                break;
            case "-":
                System.out.println(restar(numero1, numero2));
                break;
            case "*":
                System.out.println(multiplicar(numero1, numero2));
                break;
            case "/":
                if (numero2 == 0) {
                    do {
                        System.out.println("No existe división para 0, Ingresa el número 2");
                        numero2 = teclado.nextInt();
                        teclado.nextLine();
                    } while (numero2 == 0);
                }
                System.out.println(dividir(numero1, numero2));
                break;
            case "salir":
            System.out.println("Gracias por participar");
            break;

            default:
            System.out.println("No has ingresado una opción válida");
                break;
            }
        }
        

        // EJERCICIO 3
        String comida = "";
        while (!comida.equalsIgnoreCase("cacahuetes")) {
            System.out.println("Qué comida le das a la cacatúa?");
            comida = teclado.nextLine();
            if (comida.equalsIgnoreCase("cacahuetes")) {
                dormirse();
            } else {
                comer(comida);
            }
        }
        // EJERCICIO 4

        System.out.println("Ingresa la frase");
        String frase = teclado.nextLine();
        System.out.println(
                "Ingresa una opción \n 1.- Convertir a mayúsculas \n 2.- Convertir a minúsculas \n 3.- Invertir la frase ");
        byte opcion = teclado.nextByte();
        teclado.nextLine();
        System.out.println(modificarFrase(frase, opcion));
        teclado.close();
    }

    public static void saludar1(Scanner teclado) {
        System.out.println("Ingresa el saludo");
        String saludo = teclado.nextLine();
        System.out.println("Ingresa el nombre");
        String nombre = teclado.nextLine();
        System.out.println(saludo + " " + nombre);
    }

    public static void saludar2(String saludo, String name) {
        System.out.println(saludo + " " + name);
    }

    public static String saludar3(String saludo, String name) {
        String frase = saludo + " " + name;
        return frase;
    }

    public static Integer sumar(int numero1, int numero2) {
        int respuesta = numero1 + numero2;
        return respuesta;
    }

    public static Integer restar(int numero1, int numero2) {
        int respuesta = numero1 - numero2;
        return respuesta;
    }

    public static Integer multiplicar(int numero1, int numero2) {
        int respuesta = numero1 * numero2;
        return respuesta;
    }

    public static double dividir(int numero1, int numero2) {
        double respuesta = (double) numero1 / numero2;
        return respuesta;
    }

    public static void comer(String comida) {
        System.out.println("cacatúa cacahuetes!");
    }

    public static void dormirse() {
        System.out.println("zzZzzzz...");
    }

    public static String modificarFrase(String frase, byte opcion) {
        switch (opcion) {
            case 1:
                return (frase.toUpperCase());
            case 2:
                return (frase.toLowerCase());
            case 3:
                StringBuilder sb = new StringBuilder(frase);
                return (sb.reverse().toString());
            default:
                return ("La opción es incorrecta");
        }
    }

}
