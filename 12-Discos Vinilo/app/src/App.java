import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        Disco disco1 = new Disco();
        disco1.setArtista("Carlos Vives");
        disco1.setTitulo("Cumbiana");
        disco1.setYear(2020);
        disco1.setInSpotify(true);

        Disco disco2 = new Disco("Julieta Venegas", "Limón y sal", 2006, true);
        Disco disco3 = new Disco("Shakira", "Pies descalzos", 1995, false);
        Disco disco4 = new Disco("Imagine Dragons", "Loom", 2024, true);
        Disco disco5 = new Disco("Maroon 5", "Hands All Over", 2010, false);
        Disco disco6 = new Disco("Verde 70", "Ruta Melancolía", 2003, false);

        ArrayList<Disco> listaDeDiscos = new ArrayList<>(Arrays.asList(disco1, disco2, disco3, disco4, disco5, disco6));
        String opcion;
        do {
            System.out.println(
                    "\nMenú CRUD para los discos de vinilo. Qué deseas hacer? \n1.- Crear \n2.- Imprimir todos \n3.- Imprimir por artista \n4.- Actualizar \n5.- Eliminar \n6.- Salir");
            opcion = teclado.nextLine();
            if (!opcion.equals("6")) {

                switch (opcion) {
                    case "1":
                        listaDeDiscos.add(crearDisco(teclado));
                        System.out.println("Disco creado!");
                        break;
                    case "2":
                        System.out.println("La lista de discos actual es:" + listaDeDiscos);
                        break;
                    case "3":
                        if (!imprimirPorArtista(teclado, listaDeDiscos)) {
                            System.out.println("El artista ingresado no se encuentra en la lista.");
                        }
                        break;

                    case "4":
                        if (actualizarDisco(teclado, listaDeDiscos)) {
                            System.out.println("Disco actualizado!");
                        } else {
                            System.out.println("Ese disco no existe. Prueba a crear uno!");
                        }
                        break;
                    case "5":
                        if (eliminarDisco(teclado, listaDeDiscos)) {
                            System.out.println("Disco eliminado!");
                        } else {
                            System.out.println("El título introducido no corresponde con ningún disco");
                        }

                        break;
                    default:
                        System.out.println("La opción ingresada no es válida");
                }

            } else {
                System.out.println("Gracias por participar!");
            }
        } while (!opcion.equals("6"));

        teclado.close();

    }

    public static Disco crearDisco(Scanner teclado) {
        System.out.println("Ingresa el artista: ");
        String artista = teclado.nextLine();
        System.out.println("Ingresa el título del disco: ");
        String titulo = teclado.nextLine();
        System.out.println("Ingresa el año del disco: ");
        Integer year = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Está el disco actualmente en Spotify? (true/false)");
        Boolean inSpotify = teclado.nextBoolean();
        teclado.nextLine();
        Disco nuevoDisco = new Disco(artista, titulo, year, inSpotify);
        return nuevoDisco;
    }

    public static boolean imprimirPorArtista(Scanner teclado, ArrayList<Disco> listaDeDiscos) {
        System.out.println("Ingrese el nombre del artista");
        String name = teclado.nextLine();
        boolean flag = false;
        for (Disco disco : listaDeDiscos) {
            if (disco.getArtista().equalsIgnoreCase(name)) {
                System.out.print(disco);
                flag = true;
            }
        }
        return flag;
    }

    public static Boolean actualizarDisco(Scanner teclado, ArrayList<Disco> listaDiscos) {
        System.out.println("Ingresa el título del disco a modificar");
        String titulo = teclado.nextLine();
        Boolean flag = false;
        for (Disco disco : listaDiscos) {
            if (disco.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Ingresa el artista");
                disco.setArtista(teclado.nextLine());
                System.out.println("Ingresa el título del disco");
                disco.setTitulo(teclado.nextLine());
                System.out.println("Ingresa el año del disco:");
                disco.setYear(teclado.nextInt());
                teclado.nextLine();
                System.out.println("El disco está actualmente en Spotify?");
                disco.setInSpotify(teclado.nextBoolean());
                teclado.nextLine();
                flag = true;
            }
        }
        return flag;
    }

    public static Boolean eliminarDisco(Scanner teclado, ArrayList<Disco> listaDeDiscos) {
        System.out.println("Ingrese el título del disco a eliminar: ");
        String titulo = teclado.nextLine();
        for (Disco disco : listaDeDiscos) {
            if (disco.getTitulo().equalsIgnoreCase(titulo)) {
                listaDeDiscos.remove(disco);
                return true;
            }
        }
        return false;
    }
}
