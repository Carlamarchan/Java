package zapateria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Clase Tienda de zapatos: Contiene un stock de toda la tienda.
 */
public class TiendaZapatos {
    static Scanner teclado = new Scanner(System.in);

    // INVENTARIO
    static Casual casual1 = new Casual("Skechers", "Air", "cuero", 60F, true);
    static Casual casual2 = new Casual("Tommy", "zapateria.Casual", "tela", 150F, false);
    static Elegante elegante1 = new Elegante("Adidas", "Convertible", "charol", 80F, true);
    static Elegante elegante2 = new Elegante("Zara", "Con perlas", "Perlas", 200F, true);
    static Deportivo deportivo1 = new Deportivo("Fila", "Sprint", "cuero", 70F, true, true);
    static Deportivo deportivo2 = new Deportivo("Puma", "Running", "Tela", 50F, false, true);
    static ArrayList<Zapato> listaZapatos = new ArrayList<>(
            Arrays.asList(casual1, casual2, elegante1, elegante2, deportivo1, deportivo2));

    public static CarritoDeLaCompra carritoDeLaCompra1 = new CarritoDeLaCompra();

    // MENÚ PRINCIPAL

    /**
     * Menú principal para gestionar la tienda de zapatos
     */
    public static void menuPrincipal() {
        String opcion;
        do {
            System.out.println("""

                    Deseas ingresar como cliente o como propietario?
                        1.- Propietario
                        2.- Cliente
                        3.- Salir
                            """);
            opcion = teclado.nextLine();
            if (!opcion.equals("3")) {
                switch (opcion) {
                    case "1":
                        do {
                            opcion = menuPropietario();
                        } while (!opcion.equals("5"));
                        break;
                    case "2":
                        ;
                        do {
                            opcion = menuCliente();
                        } while (!opcion.equals("5"));
                        break;
                    default:
                        System.out.println("Opción incorrecta, prueba nuevamente!");
                        break;
                }
            }
            System.out.println("Gracias por participar!");

        } while (!opcion.equals("3"));
    }

    // MENÚ PROPIETARIO

    /**
     * Menú principal para gestionar los zapatos desde el rol "Propietario"
     *
     * @return Opción seleccionada para gestionar un nuevo zapato
     */
    public static String menuPropietario() {
        System.out.println("""

                Menú CRUD para tu tienda de Zapatos. Qué deseas hacer?
                    1.- Crear zapato
                    2.- Mostrar todos los zapatos existentes
                    3.- Modificar un producto de la tienda
                    4.- Eliminar producto
                    5.- Salir
                    """);

        String opcion = teclado.nextLine();

        switch (opcion) {
            case "1":
                crearZapato();
                break;
            case "2":
                System.out.println(listaZapatos);
                break;
            case "3":
                System.out.println("Ingrese la marca del zapato a modificar");
                Zapato zapatoEncontrado = buscarZapatoPorMarca(teclado.nextLine());
                if (zapatoEncontrado != null) {
                    System.out.println("El zapato " + modificarZapato(zapatoEncontrado) + " se ha modificado");
                } else {
                    System.out.println("La marca no existe en la BD");
                }
                break;
            case "4":
                System.out.println("Ingrese la marca del zapato a eliminar");
                String zapatoAEliminar = teclado.nextLine();
                System.out.println(eliminarZapato(zapatoAEliminar));
                break;

            default:
                break;
        }
        return opcion;

    }

    // MENÚ CLIENTE

    /**
     * Menú para gestionar lo que pueden ahcer los clientes
     * 
     * @return opción que selecciona el cliente.
     */
    public static String menuCliente() {
        System.out.println("""
                Menú para tu carrito de compras. Qué deseas hacer?
                    1.- Comprar
                    2.- Mostrar lista de zapatos del carrito
                    3.- Eliminar
                    4.- Mostrar el total a pagar
                    5.- Salir
                """);
        String opcion = teclado.nextLine();
        switch (opcion) {
            case "1":
                System.out.println("Ingresa la marca del zapato que deseas comprar");
                carritoDeLaCompra1.addZapato(buscarZapatoPorMarca(teclado.nextLine()));
                break;
            case "2":
                if (carritoDeLaCompra1.estaVacio()) {
                    System.out.println("El carrito no tiene ningún par de zapatos todavía. Prueba a comprar uno");
                } else {
                    System.out.println("Lista de los zapatos que tienes en el carrito");
                    carritoDeLaCompra1.mostrarLista();
                }
                break;
            case "3":
                if (carritoDeLaCompra1.estaVacio()) {
                    System.out.println("El carrito está vacío. No se puede eliminar nada.");
                } else {
                    System.out.println("Ingrese la carca del zapato a eliminar del carrito");
                    carritoDeLaCompra1.eliminarZapato(teclado.nextLine());
                }
                break;
            case "4":
                System.out.println("el total a pagar es: " + carritoDeLaCompra1.totalAPagar());
            default:
                break;
        }
        return opcion;
    }

    // MÉTODOS PARA EL PROPIETARIO
    // BUSCAR ZAPATO POR MARCA
    public static Zapato buscarZapatoPorMarca(String marca) {
        for (Zapato zapato : listaZapatos) {
            if (zapato.getMarca().equalsIgnoreCase(marca)) {
                return zapato;
            }
        }
        return null;
    }

    // CREAR ZAPATO
    public static void crearZapato() {
        String option = "";
        do {
            System.out.println("""
                    Ingresa la clase del zapato que quieres crear.
                    1.- zapateria.Casual
                    2.- zapateria.Elegante
                    3.- zapateria.Deportivo
                    4.- Salir
                    """);
            option = teclado.nextLine();
            if (!option.equals("4")) {
                switch (option) {
                    case "1":
                        Zapato nuevoCasual = crearCasual();
                        System.out.println("zapateria.Zapato creado correctamente");
                        listaZapatos.add(nuevoCasual);
                        break;
                    case "2":
                        Zapato nuevoElegante = crearElegante();
                        System.out.println("zapateria.Zapato creado correctamente");
                        listaZapatos.add(nuevoElegante);
                        break;
                    case "3":
                        Zapato nuevoDeportivo = crearDeportivo();
                        System.out.println("Zapatilla creada correctamente");
                        listaZapatos.add(nuevoDeportivo);
                        break;
                    default:
                        System.out.println("Opción errónea, prueba nuevamente!");
                }
            } else
                System.out.println("Hasta pronto!");

        } while ((!option.equals("4")) && (option.equals("1")) && (option.equals("2")) && (option.equals("3")));

    }

    // CREAR ZAPATO DEPORTIVO
    public static Deportivo crearDeportivo() {
        System.out.println("Ingresa la marca de la zapatilla: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa el modelo de la zapatilla: ");
        String modelo = teclado.nextLine();
        System.out.println("Ingresa el material de la zapatilla: ");
        String material = teclado.nextLine();
        System.out.println("Ingresa el precio de la zapatilla: ");
        Float precio = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("Las zapatillas son modernas? ");
        Boolean modernas = teclado.nextBoolean();
        teclado.nextLine();
        System.out.println("Las zapatillas son de lujo? ");
        Boolean deLujo = teclado.nextBoolean();
        teclado.nextLine();
        Deportivo nuevoDeportivo = new Deportivo(nombre, modelo, material, precio, modernas, deLujo);
        return nuevoDeportivo;
    }

    // CREAR ZAPATO CASUAL
    public static Casual crearCasual() {
        System.out.println("Ingresa la marca del zapato casual: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa el modelo del zapato casual: ");
        String modelo = teclado.nextLine();
        System.out.println("Ingresa el material del zapato casual: ");
        String material = teclado.nextLine();
        System.out.println("Ingresa el precio del zapato casual: ");
        Float precio = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("El zapato zapateria.Casual tiene correa?");
        Boolean conCorrea = teclado.nextBoolean();
        teclado.nextLine();
        Casual nuevoCasual = new Casual(nombre, modelo, material, precio, conCorrea);
        return nuevoCasual;
    }

    // CREAR ZAPATO ELEGANTE
    public static Elegante crearElegante() {
        System.out.println("Ingresa la marca del zapato elegante: ");
        String marca = teclado.nextLine();
        System.out.println("Ingresa el modelo del zapato elegante: ");
        String modelo = teclado.nextLine();
        System.out.println("Ingresa el material del zapato elegante: ");
        String material = teclado.nextLine();
        System.out.println("Ingresa el precio del zapato elegante: ");
        Float precio = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("El zapato elegante tiene tacones?");
        Boolean conTacon = teclado.nextBoolean();
        teclado.nextLine();
        Elegante nuevoElegante = new Elegante(marca, modelo, material, precio, conTacon);
        return nuevoElegante;
    }

    // MODIFICAR ZAPATO
    public static String modificarZapato(Zapato zapatoAModificar) {

        System.out.println("El zapato a modificar es: " + zapatoAModificar);
        if (Casual.class.isInstance(zapatoAModificar)) {
            Casual nuevoCasual = crearCasual();
            Casual zapatoAModificarCasteado = (Casual) zapatoAModificar;
            zapatoAModificarCasteado.setMarca(nuevoCasual.getMarca());
            zapatoAModificarCasteado.setMaterial(nuevoCasual.getMaterial());
            zapatoAModificarCasteado.setModelo(nuevoCasual.getModelo());
            zapatoAModificarCasteado.setPrecio(nuevoCasual.getPrecio());
            zapatoAModificarCasteado.setConCorrea(nuevoCasual.getConCorrea());
            return "zapateria.Casual";
        } else if (Elegante.class.isInstance(zapatoAModificar)) {
            System.out.println("El zapato a modificar es: " + zapatoAModificar);
            Elegante nuevoElegante = crearElegante();
            Elegante zapatoAModificarEleganteCasteado = (Elegante) zapatoAModificar;
            zapatoAModificarEleganteCasteado.setMarca(nuevoElegante.getMarca());
            zapatoAModificarEleganteCasteado.setModelo(nuevoElegante.getModelo());
            zapatoAModificarEleganteCasteado.setMaterial(nuevoElegante.getMaterial());
            zapatoAModificarEleganteCasteado.setPrecio(nuevoElegante.getPrecio());
            zapatoAModificarEleganteCasteado.setConTacon(nuevoElegante.getConTacon());
            return "zapateria.Elegante";
        } else {
            System.out.println("El zapato a modificar es: " + zapatoAModificar);
            Deportivo nuevoDeportivo = crearDeportivo();
            Deportivo zapatoAModificarDeportivoCasteado = (Deportivo) zapatoAModificar;
            zapatoAModificarDeportivoCasteado.setMarca(nuevoDeportivo.getMarca());
            zapatoAModificarDeportivoCasteado.setModelo(nuevoDeportivo.getModelo());
            zapatoAModificarDeportivoCasteado.setMaterial(nuevoDeportivo.getMaterial());
            zapatoAModificarDeportivoCasteado.setPrecio(nuevoDeportivo.getPrecio());
            zapatoAModificarDeportivoCasteado.setModernas(nuevoDeportivo.isModernas());
            zapatoAModificarDeportivoCasteado.setDeLujo(nuevoDeportivo.isDeLujo());
            return "zapateria.Deportivo";
        }
    }

    // ELIMINAR ZAPATO
    public static String eliminarZapato(String zapatoAEliminar) {
        Zapato zapatoEncontrado = buscarZapatoPorMarca(zapatoAEliminar);
        if (zapatoEncontrado != null) {
            listaZapatos.remove(zapatoEncontrado);
            return "El zapato se ha eliminado correctamente";
        }
        return "El zapato no existe en la DB";
    }

}
