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
                        1.- Método de pago Versión 1
                        2.- Método de pago Versión 2
                        3.- Sorteo Tiendas
                        4.- Salir
                            """);
            option = teclado.nextLine();
            if (!option.equals("4")) {
                switch (option) {
                    case "1":
                        limparPantalla();
                        System.out.println("Método de pago Versión 1:");
                        System.out.println("");
                        metodoPagoV1();
                        System.out.println("");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;
                    case "2":
                        limparPantalla();
                        System.out.println("Método de pago Versión 2:");
                        System.out.println("");
                        metodoPagoV2(teclado);
                        System.out.println("");
                        System.out.println("Pulsa enter para volver al menú principal");
                        teclado.nextLine();
                        break;
                    case "3":
                        limparPantalla();
                        System.out.println("Has ganado algún premio?");
                        System.out.println("");
                        sorteoTiendas(teclado);
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

    public static void limparPantalla() {
        System.out.println("\033[H]\033[2J");
        System.out.flush();
    }

    public static void metodoPagoV1() {
        ProductoFisico productoF = new ProductoFisico("PC", 600D);
        ProductoVirtual productoV = new ProductoVirtual("Amazon prime", 60D);
        productoF.PagoTransferencia();
        productoF.pagoTarjeta();
        productoF.pagoPayPal();
        productoV.PagoTransferencia();
        productoV.pagoTarjeta();
        productoV.pagoPayPal();
    }

    public static void metodoPagoV2(Scanner teclado) {
        ProductoFisico producto1 = new ProductoFisico("Zapatillas", 50D);
        ProductoVirtual producto2 = new ProductoVirtual("Netflix", 40D);
        System.out.println("Carrito de compra:");
        System.out.println(producto1);
        System.out.println(producto2);
        Double totalAPagar = producto1.getPrecio() + producto2.getPrecio();
        System.out.println("""
                Selecciona el método de pago:
                    1.- Pago Bizum
                    2.- Pago Efectivo
                    3.- Pago Tarjeta
                    """);
        String opcion = teclado.nextLine();
        switch (opcion) {
            case "1":
                System.out.println("Ingresa tu número de teléfono: ");
                String numeroTelefono = teclado.nextLine();
                System.out.println("Ingresa el nombre del titular: ");
                String nombreTitular = teclado.nextLine();
                System.out.println("Ingresa la moneda en la que deseas pagar: ");
                String moneda = teclado.nextLine();
                PagoBizum pagoBizum = new PagoBizum(numeroTelefono, nombreTitular, moneda);
                pagoBizum.procesarPago(totalAPagar);
                break;
            case "2":
                System.out.println("Cuánto efectivo me entregas?");
                Double monto = teclado.nextDouble();
                teclado.nextLine();
                System.out.println("Ingresa la moneda en la que deseas pagar: ");
                moneda = teclado.nextLine();
                System.out.println("Ingresa una descripción de la transacción: ");
                String descripcion = teclado.nextLine();
                PagoEfectivo pagoEfectivo = new PagoEfectivo(monto, moneda, descripcion);
                pagoEfectivo.procesarPago(totalAPagar);
                break;
            case "3":
                System.out.println("Ingresa el número de la tarjeta: ");
                String numeroTarjeta = teclado.nextLine();
                System.out.println("Ingresa el nombre del titular: ");
                nombreTitular = teclado.nextLine();
                System.out.println("Ingresa el código de seguridad de la tarjeta");
                String codigoSeguridad = teclado.nextLine();
                PagoTarjeta newPagoTarjeta = new PagoTarjeta(numeroTarjeta, nombreTitular, codigoSeguridad);
                newPagoTarjeta.procesarPago(totalAPagar);
                break;

            default:
                System.out.println("La opción ingresada no es válida");
        }

    }

    public static void sorteoTiendas(Scanner teclado) {
        System.out.println("""
                Selecciona la tienda :
                    1.- Papelería
                    2.- Tienda Informática
                    3.- Salir
                    """);
        String opcion = teclado.nextLine();
        if (!opcion.equals("3")) {
            switch (opcion) {
                case "1":
                    System.out.println("Ingresa el nombre de la Papelería");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingresa la dirección de la Papelería");
                    String direccion = teclado.nextLine();
                    Papeleria nuevaPapeleria = new Papeleria(nombre, direccion);
                    nuevaPapeleria.inscribirDatosCliente(teclado);
                    nuevaPapeleria.comunicarResultadosSorteo();
                    break;
                case "2":
                    System.out.println("Ingresa el nombre de la tienda Informática");
                    nombre = teclado.nextLine();
                    System.out.println("Ingresa la dirección de la tienda Informática");
                    direccion = teclado.nextLine();
                    Informatica nuevaInformatica = new Informatica(nombre, direccion);
                    nuevaInformatica.inscribirDatosCliente(teclado);
                    nuevaInformatica.comunicarResultadosSorteo();
                    break;
                default:
                    System.out.println("Tu opción elegida es incorrecta");
            }
        } else {
            System.out.println("Gracias por participar!");
        }

    }
}
