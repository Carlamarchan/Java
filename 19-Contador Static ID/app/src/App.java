import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String option;

        do {
            limparPantalla();
            System.out.println("""

                                Bienvenido a Ironhack developer!
                    Tenemos 3 ejercicios para ti hoy. Cuál te gustaría probar?
                        1.- Camiones
                        2.- Contador de tickets
                        3.- Dirección Postal
                        4.- Salir
                            """);
            option = teclado.nextLine();
            if (!option.equals("4")) {
                switch (option) {
                    case "1":
                        limparPantalla();
                        System.out.println("Lista de camiones:");
                        System.out.println("");
                        camiones();
                        System.out.println("");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;
                    case "2":
                        limparPantalla();
                        System.out.println("Lista de asistentes:");
                        System.out.println("");
                        contadorTickets();
                        System.out.println("");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;
                    case "3":
                        limparPantalla();
                        System.out.println("Lista de Clientes con sus respectivas direcciones postales:");
                        System.out.println("");
                        direccionPostal(teclado);
                        System.out.println("");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;
                    default:
                        System.out.println("");
                        System.out.println("Has seleccionado una opción incorrecta. Prueba nuevamente");
                        break;
                }

            } else
                System.out.println("Gracias por participar!");

        } while (!option.equals("4"));
        teclado.close();
    }

    public static void camiones() {
        System.out.println("Camiones!");
        Camion camion1 = new Camion(true);
        Camion camion2 = new Camion(false);
        Camion camion3 = new Camion(true);

        System.out.println(camion1.toString());
        System.out.println(camion2.toString());
        System.out.println(camion3.toString());

        System.out.println("Método estático acelerar!");
        Camion.acelerar();
        System.out.println("Método estático frenar!");
        Camion.frenar();

    }

    public static void contadorTickets() {
        Asistente asistente1 = new Asistente("Carla", "Marchán");
        Asistente asistente2 = new Asistente("Anthonny", "Paz");
        Asistente asistente3 = new Asistente("Katy", "Pérez");

        System.out.println(asistente1);
        System.out.println(asistente2);
        System.out.println(asistente3);
    }

    public static void limparPantalla() {
        System.out.println("\033[H]\033[2J");
        System.out.flush();
    }

    public static void direccionPostal(Scanner teclado) {
        System.out.println("Ingresa un nuevo Cliente:");
        System.out.println("Ingresa su nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa su edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingresa la dirección: ");
        System.out.println("Ingresa la calle:");
        String calle = teclado.nextLine();
        System.out.println("Ingresa la ciudad");
        String ciudad = teclado.nextLine();
        System.out.println("Ingresa el código postal:");
        Long cP = teclado.nextLong();
        teclado.nextLine();
        Direccion nuevaDireccion = new Direccion(calle, ciudad, cP);
        Cliente nuevoCliente = new Cliente(nombre, edad, nuevaDireccion);
        System.out.println(nuevoCliente);
    }
}
