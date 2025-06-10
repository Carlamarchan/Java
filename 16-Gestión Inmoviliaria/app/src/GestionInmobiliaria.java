import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GestionInmobiliaria {
    static Scanner teclado = new Scanner(System.in);

    // INMOBILIARIA
    static Casa casa1 = new Casa(200F, 200000D, "Zaragoza", true);
    static Casa casa2 = new Casa(90F, 150000D, "Galicia", false);
    static Piso piso1 = new Piso(50F, 100000D, "Las Fuentes", 4, true);
    static Piso piso2 = new Piso(80F, 150000D, "Delicias", 3, false);
    static Trastero trastero1 = new Trastero(10F, 20000D, "El Actur", true);
    static Trastero trastero2 = new Trastero(8F, 6000D, "El Arrabal", false);

    static ArrayList<Inmueble> listaDeInmuebles = new ArrayList<>(
            Arrays.asList(casa1, casa2, piso1, piso2, trastero1, trastero2));

    // MENÚ PRINCIPAL
    public static void menuPrincipal() {
        String opcion;
        do {
            System.out.println("""
                    CONSULTAS INMOBILIARIAS:
                        1.- Consultar propiedades por tipo.
                        2.- Consultar propiedades por tipo y ubicación.
                        3.- Consultar todas las propiedades.
                        4.- Salir
                                    """);
            opcion = teclado.nextLine();
            if (!opcion.equals("4")) {
                switch (opcion) {
                    case "1":
                        String opcion2;
                        do {
                            System.out.println("""
                                    Ingrese el tipo de inmueble a buscar
                                        1.- Casas
                                        2.- Pisos
                                        3.- Trasteros
                                        4.- Salir
                                    """);
                            opcion2 = teclado.nextLine();
                            if (!opcion2.equals("4")) {
                                switch (opcion2) {
                                    case "1":
                                        System.out.println(
                                                "Actualmente tenemos las siguientes casas: " + consultaPortipoCasa());
                                        break;

                                    case "2":
                                        System.out.println(
                                                "Actualmente tenemos los siguientes pisos: " + consultaPortipoPiso());
                                        break;

                                    case "3":
                                        System.out.println(
                                                "Actualmente tenemos los siguientes trasteros: "
                                                        + consultaPortipoTrastero());
                                        break;

                                    default:
                                        System.out.println("Opción incorrecta. Prueba nuevamente");
                                }
                            } else {
                                System.out.println("Gracias por participar!");
                            }

                        } while (!opcion2.equals("4"));
                        break;
                    case "2":
                        String opcion3;
                        do {
                            System.out.println("""
                                    Ingrese el tipo de inmueble a buscar
                                        1.- Casas
                                        2.- Pisos
                                        3.- Trasteros
                                        4.- Salir
                                    """);
                            opcion3 = teclado.nextLine();
                            if (!opcion3.equals("4")) {
                                switch (opcion3) {
                                    case "1":
                                        ArrayList<Casa> listaCasasRecuperada = new ArrayList<>();
                                        listaCasasRecuperada = consultaPortipoCasa();
                                        for (Casa casa : listaCasasRecuperada) {
                                            System.out.println("Inmueble Tipo: Casa. Se encuentra ubicada en: "
                                                    + casa.getUbicacion());
                                        }
                                        break;

                                    case "2":
                                        ArrayList<Piso> listaPisosRecuperada = new ArrayList<>();
                                        listaPisosRecuperada = consultaPortipoPiso();
                                        for (Piso piso : listaPisosRecuperada) {
                                            System.out.println("Inmueble Tipo: Piso. Se encuentra ubicada en: "
                                                    + piso.getUbicacion());
                                        }
                                        break;

                                    case "3":
                                        ArrayList<Trastero> listaTrasterosRecuperada = new ArrayList<>();
                                        listaTrasterosRecuperada = consultaPortipoTrastero();
                                        for (Trastero trastero : listaTrasterosRecuperada) {
                                            System.out.println("Inmueble Tipo: Trastero. Se encuentra ubicada en: "
                                                    + trastero.getUbicacion());
                                        }
                                        break;

                                    default:
                                        System.out.println("Opción incorrecta. Prueba nuevamente");
                                }
                            } else {
                                System.out.println("Gracias por participar!");
                            }

                        } while (!opcion3.equals("4"));
                        break;

                    case "3":

                        System.out.println("\nTodos los inmuebles que disponemos:" + listaDeInmuebles);
                        break;

                    default:
                        System.out.println("Opción incorrecta, prueba nuevamente!");
                        break;
                }
            } else {
                System.out.println("Gracias por participar!");
            }

        } while (!opcion.equals("4"));
    }

    // CONSULTA POR TIPO
    // TIPO CASA
    public static ArrayList<Casa> consultaPortipoCasa() {
        ArrayList<Casa> listaDeCasas = new ArrayList<>();
        for (Inmueble inmueble : listaDeInmuebles) {
            if (inmueble instanceof Casa) {
                listaDeCasas.add((Casa) inmueble);
            }
        }
        return listaDeCasas;
    }

    // TIPO PISO
    public static ArrayList<Piso> consultaPortipoPiso() {
        ArrayList<Piso> listaDePisos = new ArrayList<>();
        for (Inmueble inmueble : listaDeInmuebles) {
            if (inmueble instanceof Piso) {
                listaDePisos.add((Piso) inmueble);
            }
        }
        return listaDePisos;
    }

    // TIPO TRASTERO
    public static ArrayList<Trastero> consultaPortipoTrastero() {
        ArrayList<Trastero> listaDeTrasteros = new ArrayList<>();
        for (Inmueble inmueble : listaDeInmuebles) {
            if (inmueble instanceof Trastero) {
                listaDeTrasteros.add((Trastero) inmueble);
            }
        }
        return listaDeTrasteros;
    }

}
