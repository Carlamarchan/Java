
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String option;
        do {
            Metodos.limpiarPantalla();
            System.out.println("""
                    ----------EJERCICIO DE ENTRENAMIENTO----------
                    Seleccione el ejercicio que desea realizar:
                        1.- Cálculo de IVA
                        2.- Ejercicio Discoteca
                        3.- Resultados Electorales
                        4.- Salir
                                    """);
            option = teclado.nextLine();
            if (!option.equals("4")) {
                switch (option) {
                    case "1":
                        Metodos.ejercicio1(teclado);
                        break;
                    case "2":
                        Metodos.ejercicio2(teclado);
                        break;
                    case "3":
                        Metodos.ejercicio3(teclado);
                        break;

                    default:
                        System.out.println("La opción ingresada es inválida. Prueba nuevamente");
                }

            } else {
                System.out.println("Gracias por participar");
            }
        } while (!option.equals("4"));

        teclado.close();
    }

}
