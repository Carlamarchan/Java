import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    // EJERCICIO 1:
    public static void ejercicio1(Scanner teclado) {
        System.out.println("***********  Cálculo de IVA  ***********");
        System.out.println("Ingresa el precio del producto");
        Float precioProducto = teclado.nextFloat();
        teclado.nextLine();
        String opcion;
        Float ivaSeleccionado = 0F;
        final Float ivaGeneral = 0.21F;
        final Float ivaReducido = 0.10F;
        final Float ivaSuperReducido = 0.4F;
        final Float ivaExcento = 0F;

        do {
            System.out.println("""
                    Ingresa el tipo de IVA
                         1.- General = 21% (ej. Ropa);
                         2.- Reducido = 10% (bono-metro);
                         3.- Super-reducido = 4% (huevos);
                         4.- Exento = 0% (dentista)
                         """);
            opcion = teclado.nextLine();
            switch (opcion) {
                case "1":
                    ivaSeleccionado = ivaGeneral;
                    break;
                case "2":
                    ivaSeleccionado = ivaReducido;
                    break;
                case "3":
                    ivaSeleccionado = ivaSuperReducido;
                    break;
                case "4":
                    ivaSeleccionado = ivaExcento;
                    break;

                default:
                    System.out.println("El valor ingresado es incorrecto. Prueba Nuevamente");
                    break;
            }
        } while ((!opcion.equals("1")) && (!opcion.equals("2")) && (!opcion.equals("3")) && (!opcion.equals("4")));
        System.out.println("El total a pagar es: " + calcularPrecioFinal(precioProducto, ivaSeleccionado));
        System.out.println("Para volver al menú principal, presiona enter");
        teclado.nextLine();
    }

    // LIMPIAR PANTALLA
    public static void limpiarPantalla() {
        System.out.println("\033[H]\033[2J");
        System.out.flush();
    }

    // EJERCICIO 2: VALIDACIÓN SETTERS Y ARRAYLIST
    public static void ejercicio2(Scanner teclado) {
        ArrayList<ClienteDiscoteca> listaDeClientesDiscotecaMayoresDeEdad = new ArrayList<>();
        ArrayList<ClienteDiscoteca> listaDeClientesDiscotecaMenoresDeEdad = new ArrayList<>();

        ClienteDiscoteca cliente1 = new ClienteDiscoteca("Carla", 25);
        ClienteDiscoteca cliente2 = new ClienteDiscoteca("Luis", 35);
        ClienteDiscoteca cliente3 = new ClienteDiscoteca("Albert", 28);

        listaDeClientesDiscotecaMayoresDeEdad.add(cliente1);
        listaDeClientesDiscotecaMayoresDeEdad.add(cliente2);
        listaDeClientesDiscotecaMayoresDeEdad.add(cliente3);
        String opcion;
        System.out.println("***********  Ejercicio validación setter, y ArrayLists ***********");
        do {
            System.out.println("");
            System.out.println("""
                    Deseas ingresar cliente?
                         1.- Si
                         2.- No
                         """);
            opcion = teclado.nextLine();
            if (opcion.equals("1")) {
                ClienteDiscoteca clienteNuevo = crearClienteDiscoteca(teclado);
                if (clienteNuevo.getEdad() >= 18) {
                    listaDeClientesDiscotecaMayoresDeEdad.add(clienteNuevo);
                    System.out.println(clienteNuevo.MayorDeEdad());
                } else {
                    listaDeClientesDiscotecaMenoresDeEdad.add(clienteNuevo);
                    System.out.println(clienteNuevo.MenorDeEdad());
                }

            } else if (opcion.equals("2")) {
                System.out.println("Gracias por particiapar");
            } else {
                System.out.println("Opción incorrecta. Prueba nuevamente");
            }

        } while (!opcion.equals("2"));
        System.out.println("Lista de personas admitidas en la discoteca" + listaDeClientesDiscotecaMayoresDeEdad);
        System.out.println("Lista de personas NO admitidas en la discoteca" + listaDeClientesDiscotecaMenoresDeEdad);
        System.out.println("Para volver al menú principal, presiona enter");
        teclado.nextLine();
    }

    // CÁLCULO PRECIO FINAL
    public static Float calcularPrecioFinal(Float precioProducto, Float ivaSeleccionado) {
        Float total = precioProducto + (precioProducto * ivaSeleccionado);
        return total;
    }

    // CREAR CLIENTES DISCOTECA
    public static ClienteDiscoteca crearClienteDiscoteca(Scanner teclado) {
        System.out.println("Ingresa el nombre del cliente");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa la edad del Cliente de la discoteca");
        int edad = teclado.nextInt();
        teclado.nextLine();
        ClienteDiscoteca cliente = new ClienteDiscoteca(nombre, edad);
        return cliente;
    }

    // EJERCICIO 3
    public static void ejercicio3(Scanner teclado) {
        System.out.println("***********  BARRAS RESULTADOS ELECTORALES  ***********");
        ArrayList<Partido> listaDePartidos = new ArrayList<>();
        int totalVotos = 0;
        for (int i = 0; i <= 2; i++) {
            System.out.println("Ingresa el nombre del partido político");
            String nombre = teclado.nextLine();
            System.out.println("Ingresa la cantidad de votos que obtuvo en las elecciones:");
            int votos = teclado.nextInt();
            totalVotos = totalVotos + votos;
            teclado.nextLine();
            Partido partido = new Partido(nombre, votos);
            listaDePartidos.add(partido);
        }
        Metodos.limpiarPantalla();
        for (Partido partido : listaDePartidos) {
            partido.porcentaje = (partido.getvotosTotales() * 100) / totalVotos;
        }
        for (Partido partido : listaDePartidos) {
            System.out.println(partido + generarGrafica(partido.porcentaje));
        }
        System.out.println("\nPara volver al menú principal, presiona enter");
        teclado.nextLine();
    }

    // GENERAR GRAFICA PORCENTUAL
    public static String generarGrafica(int porcentaje) {
        int porcentajeDecenas = porcentaje / 10;
        int porcentajeUnidades = porcentaje % 10;

        String totaString = "";
        for (int i = 0; i < porcentajeDecenas; i++) {
            totaString = totaString + "#";
        }
        for (int i = 0; i < porcentajeUnidades; i++) {
            totaString = totaString + "*";
        }
        return totaString;
    }

}
