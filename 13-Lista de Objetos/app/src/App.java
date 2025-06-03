import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Producto producto1 = new Producto("Arroz", "China", 2F, 3F);
        CarritoDeLaCompra.addProducto(producto1);
        Producto producto2 = new Producto("Banana", "Ecuador", 1.5F, 2F);
        CarritoDeLaCompra.addProducto(producto2);
        Producto producto3 = new Producto("Fresas", "Chile", 3.5F, 1F);
        CarritoDeLaCompra.addProducto(producto3);
        String opcion;

        do {
            System.out.println(
                    "\nMenú CRUD para El carrito de la compra. Qué deseas hacer? \n1.- Crear producto \n2.- Mostrar todos los productos del carrito \n3.- Modificar un producto del carrito \n4.- Eliminar producto \n5.- Calcular total a pagar \n6.- Salir");
            opcion = teclado.nextLine();
            if (!opcion.equals("6")) {

                switch (opcion) {
                    case "1":
                        CarritoDeLaCompra.addProducto(CarritoDeLaCompra.crearProducto(teclado));
                        System.out.println("Producto creado!");
                        break;
                    case "2":
                        System.out.println(
                                "El carrito contiene los siguientes productos:" + CarritoDeLaCompra.listaDeLaCompra);
                        break;
                    case "3":
                        System.out.println("Ingresa el nombre del producto a modificar");
                        String nombre = teclado.nextLine();
                        Producto productoEncontrado = CarritoDeLaCompra.buscarProducto(nombre);
                        if (productoEncontrado != null) {
                            CarritoDeLaCompra.actualizarProducto(productoEncontrado,
                                    CarritoDeLaCompra.crearProducto(teclado));
                            System.out.println("Producto modificado!");
                        } else {
                            System.out.println("El producto a actualizar no se encuentra en el carrito de la compra");
                        }
                        break;
                    case "4":
                        System.out.println("Ingrese el nombre del producto a eliminar");
                        nombre = teclado.nextLine();
                        productoEncontrado = CarritoDeLaCompra.buscarProducto(nombre);
                        if (productoEncontrado != null) {
                            CarritoDeLaCompra.listaDeLaCompra.remove(productoEncontrado);
                            System.out.println("Producto eliminado del carrito de la compra!");
                        } else {
                            System.out
                                    .println("El producto " + nombre + " no está presente en el carrito de la compra.");
                        }

                        break;
                    case "5":
                        System.out.println("El total a pagar es " + CarritoDeLaCompra.calcularTotal() + " Euros.");
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

}
