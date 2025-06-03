import java.util.ArrayList;
import java.util.Scanner;

public class CarritoDeLaCompra {

    static ArrayList<Producto> listaDeLaCompra = new ArrayList<>();

    // AÑADIR PRODUCTO
    public static void addProducto(Producto producto) {
        listaDeLaCompra.add(producto);
    }

    // CREAR PRODUCTO
    public static Producto crearProducto(Scanner teclado) {
        System.out.println("Ingresa el nombre del Producto: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa el origen del Producto: ");
        String origen = teclado.nextLine();
        System.out.println("Ingresa el precio del producto: ");
        Float precio = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("Ingresa el peso en Kg del producto: ");
        Float peso = teclado.nextFloat();
        teclado.nextLine();
        Producto nuevProducto = new Producto(nombre, origen, precio, peso);
        return nuevProducto;
    }

    // BUSCAR PRODUCTO POR NOMBRE
    public static Producto buscarProducto(String nombre) {
        for (Producto producto : listaDeLaCompra) {
            if (producto.getName().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    // ACTUALIZAR PRODUCTO
    public static String actualizarProducto(Producto productoEncontrado, Producto productoNuevo) {
        productoEncontrado.setName(productoNuevo.getName());
        productoEncontrado.setOrigen(productoNuevo.getOrigen());
        productoEncontrado.setPrice(productoNuevo.getPrice());
        productoEncontrado.setWeight(productoNuevo.getWeight());
        return "Producto actualizado!";
    }

    // CALCULAR TOTAL A PAGAR
    public static Float calcularTotal() {
        Float total = 0F;
        for (Producto producto : listaDeLaCompra) {
            total = total + producto.getPrice() * producto.getWeight();
        }
        return total;
    }

}
