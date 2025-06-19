import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String option;

        do {
            limparPantalla();
            System.out.println("""
                                Bienvenido a Ironhack developer!
                                         MENU PRINCIPAL
                    Tenemos 4 ejercicios para ti hoy. Cuál te gustaría probar?
                        1.- Excepciones try-catch
                        2.- Listado de estudiantes
                        3.- Sumar Elementos
                        4.- Herencia POO
                        5.- Salir
                            """);
            option = teclado.nextLine();
            if (!option.equals("5")) {
                switch (option) {
                    case "1":
                        limparPantalla();
                        System.out.println("---------------------Excepciones try-catch:---------------------");
                        System.out.println("");
                        excepciones(teclado);
                        System.out.println("");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;
                    case "2":
                        limparPantalla();
                        System.out.println("---------------------Listado de estudiantes:---------------------");
                        System.out.println("");
                        listadoEstudiantes(teclado);
                        System.out.println("");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;
                    case "3":
                        limparPantalla();
                        System.out.println("---------------------Sumar Elementos---------------------");
                        System.out.println("");
                        sumarElementos(teclado);
                        System.out.println("");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;

                    case "4":
                        limparPantalla();
                        System.out.println("---------------------Herencia POO---------------------");
                        System.out.println("");
                        herencia(teclado); // Ya no ponemos "Pulsa enter..." aquí
                        break;
                    default:
                        System.out.println("");
                        System.out.println("Has seleccionado una opción incorrecta. Prueba nuevamente");
                        break;
                }

            } else
                System.out.println("Gracias por participar!");

        } while (!option.equals("5"));
        teclado.close();
    }

    public static void limparPantalla() {
        System.out.println("\033[H]\033[2J");
        System.out.flush();
    }

    public static void excepciones(Scanner teclado) {
        Double numero1 = null;
        Double numero2 = null;

        // Pedir número 1 con validación
        while (numero1 == null) {
            System.out.println("Ingresa el número 1:");
            try {
                numero1 = teclado.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número válido.");
                numero1 = null;
            } finally {
                teclado.nextLine();
            }
        }

        // Pedir número 2 con validación (y sin dividir por 0)
        while (numero2 == null) {
            System.out.println("Ingresa el número 2:");
            try {
                numero2 = teclado.nextDouble();
                if (numero2 == 0) {
                    System.out.println("No puedes dividir entre 0. Intenta otro número.");
                    numero2 = null;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número válido.");
            } finally {
                teclado.nextLine();
            }
        }

        Double resultado = numero1 / numero2;
        System.out.println("El resultado de la división es: " + resultado);
    }

    public static void listadoEstudiantes(Scanner teclado) {
        ArrayList<String> listaEstudiantes = new ArrayList<>();
        System.out.println("Vamos a introducir 5 nombres para imprimirlos desde el último hasta el final");
        for (int i = 0; i <= 4; i++) {
            System.out.println("Ingresa el nombre del estudiante " + (i + 1));
            listaEstudiantes.add(teclado.nextLine());
        }
        System.out.println(" ");
        System.out.println("La lista de estudiantes impresa de final a inicio es: " + listaEstudiantes.reversed());
    }

    public static void sumarElementos(Scanner teclado) {
        System.out
                .println("Ingresa números infinitamente y yo te los voy sumando! Si quieres salir, ingresa el cero 0");
        int total = 0;
        int numero = 0;

        do {
            try {
                numero = teclado.nextInt();
                total = total + numero;
                System.out.println("Ingresa el siguiente número");
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número válido. Prueba nuevamente!");
            } finally {
                teclado.nextLine();
            }
        } while (numero != 0);
        System.out.println("La suma de los números ingresados es: " + total);

    }

    public static void herencia(Scanner teclado) {
        String option1;
        Coche coche1 = new Coche("Mazda", "MZ", "Blanco", 3, true);
        Coche coche2 = new Coche("Hyundai", "Spark", "Negro", 5, true);
        Coche coche3 = new Coche("Toyota", "F150", "Roja", 3, false);

        ArrayList<Coche> listaDeCoches = new ArrayList<>();
        listaDeCoches.add(coche1);
        listaDeCoches.add(coche2);
        listaDeCoches.add(coche3);

        Moto moto1 = new Moto("KTM", "Rio", "Blanco", false, true);
        Moto moto2 = new Moto("Kawasaki", "M150", "Negro", false, true);
        Moto moto3 = new Moto("Suzuki", "Z390", "Naranja", true, false);

        ArrayList<Moto> listaDeMotos = new ArrayList<>();
        listaDeMotos.add(moto1);
        listaDeMotos.add(moto2);
        listaDeMotos.add(moto3);

        Camion camion1 = new Camion("Kia", "K300", "Beige", 4, true);
        Camion camion2 = new Camion("Mazda", "TZ200", "Blanco", 5, false);
        Camion camion3 = new Camion("Fiat", "Blass", "Negro", 2, true);

        ArrayList<Camion> listaDeCamiones = new ArrayList<>();
        listaDeCamiones.add(camion1);
        listaDeCamiones.add(camion2);
        listaDeCamiones.add(camion3);

        do {
            limparPantalla();
            System.out.println("""
                ------------------------------------ Menú de Herencia POO ------------------------------------
                    1.- Encontrar un modelo específico para cada array (modelo-array)
                    2.- Listado vehículos por característica (característica-array)
                    3.- Guardar las marcas aparte (marca-array)
                    4.- Generar un arrayList mixto
                    5.- Salir
                                """);
            option1 = teclado.nextLine();
            if (!option1.equals("5")) {
                switch (option1) {
                    case "1":
                        limparPantalla();

                        System.out
                                .println("---------------------Busqueda de vehículo por modelo:---------------------");
                        System.out.println("");
                        System.out.println("Ingresa el modelo a buscar");
                        String modelo = teclado.nextLine();
                        System.out.println("""
                                Ingresa el tipo de vehículo
                                1.- Coche
                                2.- Moto
                                3.- Camión
                                    """);
                        String tipoDeVehiculo = teclado.nextLine();
                        switch (tipoDeVehiculo) {
                            case "1":
                                busquedaPorModeloCoche(modelo, listaDeCoches);
                                break;
                            case "2":
                                busquedaPorModeloMoto(modelo, listaDeMotos);
                                break;
                            case "3":
                                busquedaPorModeloCamion(modelo, listaDeCamiones);
                                break;

                            default:
                                System.out.println("La opción seleccionada no es correcta");
                        }
                        System.out.println(" ");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;
                    case "2":
                        limparPantalla();

                        System.out
                                .println("---------------------Busqueda de vehículo por marca:---------------------");
                        System.out.println("");
                        System.out.println("Ingresa la marca a buscar");
                        String marca = teclado.nextLine();
                        System.out.println("""
                                Ingresa el tipo de vehículo
                                1.- Coche
                                2.- Moto
                                3.- Camión
                                    """);
                        tipoDeVehiculo = teclado.nextLine();
                        switch (tipoDeVehiculo) {
                            case "1":
                                busquedaPorMarcaCoche(marca, listaDeCoches);
                                break;
                            case "2":
                                busquedaPorMarcaMoto(marca, listaDeMotos);
                                break;
                            case "3":
                                busquedaPorMarcaCamion(marca, listaDeCamiones);
                                break;

                            default:
                                System.out.println("La opción seleccionada no es correcta");
                        }
                        System.out.println(" ");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;
                    case "3":
                        limparPantalla();
                        System.out.println("---------------------Guardar las marcas aparte: ---------------------");
                        System.out.println("");
                        guardarMarcasAparte(listaDeCoches, listaDeMotos, listaDeCamiones);
                        System.out.println(" ");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;
                    case "4":
                        limparPantalla();
                        System.out.println("---------------------Generar un arrayList mixto---------------------");
                        System.out.println("");
                        arrayListMixto(listaDeCoches, listaDeMotos, listaDeCamiones);
                        System.out.println(" ");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;
                    default: {
                        System.out.println("");
                        System.out.println("Has seleccionado una opción incorrecta. Prueba nuevamente");
                    }
                }

            } else
                System.out.println("Gracias por participar!");

        } while (!option1.equals("5"));
        System.out.println("");
        System.out.println("Has salido del submenú de Herencia POO. Pulsa enter para volver al menú principal.");
        teclado.nextLine();
    }

    public static void busquedaPorModeloCoche(String modelo, ArrayList<Coche> listaDeCoches) {
        Boolean flag = false;
        for (Coche coche : listaDeCoches) {
            if (coche.getModelo().equalsIgnoreCase(modelo)) {
                flag = true;
                System.out.println(coche);
            }
        }
        if (!flag) {
            System.out.println("El modelo buscado no existe.");
        }
    }

    public static void busquedaPorModeloMoto(String modelo, ArrayList<Moto> listaMotos) {
        Boolean flag = false;
        for (Moto moto : listaMotos) {
            if (moto.getModelo().equalsIgnoreCase(modelo)) {
                System.out.println(moto);
            }
        }
        if (!flag) {
            System.out.println("El modelo buscado no existe.");
        }
    }

    public static void busquedaPorModeloCamion(String modelo, ArrayList<Camion> listaDeCamiones) {
        Boolean flag = false;
        for (Camion camion : listaDeCamiones) {
            if (camion.getModelo().equalsIgnoreCase(modelo)) {
                System.out.println(camion);
            }
        }
        if (!flag) {
            System.out.println("El modelo buscado no existe.");
        }
    }

    public static void busquedaPorMarcaCoche(String marca, ArrayList<Coche> listaDeCoches) {
        Boolean flag = false;
        for (Coche coche : listaDeCoches) {
            if (coche.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(coche);
                flag=true;
            }
        }
        if (!flag) {
            System.out.println("La marca buscada no existe.");

        }
    }

    public static void busquedaPorMarcaMoto(String marca, ArrayList<Moto> listaMotos) {
        Boolean flag = false;
        for (Moto moto : listaMotos) {
            if (moto.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(moto);
                flag=true;
            }
        }
        if (!flag) {
            System.out.println("La marca buscada no existe.");

        }
    }

    public static void busquedaPorMarcaCamion(String marca, ArrayList<Camion> listaDeCamiones) {
        Boolean flag = false;
        for (Camion camion : listaDeCamiones) {
            if (camion.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(camion);
                flag=true;
            }
        }
        if (!flag) {
            System.out.println("La marca buscada no existe.");
        }
    }

    public static void guardarMarcasAparte(ArrayList<Coche> listaDeCoches, ArrayList<Moto> listaMotos,
            ArrayList<Camion> listaDeCamiones) {
        ArrayList<String> listaDeMarcas = new ArrayList<>();
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.addAll(listaDeCoches);
        listaVehiculos.addAll(listaMotos);
        listaVehiculos.addAll(listaDeCamiones);
        for (Vehiculo vehiculo : listaVehiculos) {
            listaDeMarcas.add(vehiculo.getMarca());
        }
        System.out.println("La lista de marcas se encuentra en un nuevo array: " + listaDeMarcas);
    }

    public static void arrayListMixto(ArrayList<Coche> listaDeCoches, ArrayList<Moto> listaMotos,
            ArrayList<Camion> listaDeCamiones) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.addAll(listaDeCoches);
        listaVehiculos.addAll(listaMotos);
        listaVehiculos.addAll(listaDeCamiones);
        System.out.println("Inventario de vehículos (Todos en un mismo Arraylist:)");
        System.out.println(listaVehiculos);
    }
}
