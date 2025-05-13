import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la posición");
        int position = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa tu nombre");
        String name = teclado.nextLine();
        System.out.println("Ingresa tu apellido");
        String lastName = teclado.nextLine();
        System.out.println("Ingresa tu edad");
        int age = teclado.nextInt();

        System.out.println("En el puesto " + position + " está " + name + " " + lastName + ", tiene " + age
                + " años. Bienvenido a Ironhack");
        teclado.close();
    }
}
