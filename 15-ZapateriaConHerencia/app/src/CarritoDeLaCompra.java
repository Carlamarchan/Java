import java.util.ArrayList;

public class CarritoDeLaCompra {

    ArrayList<Zapato> carritoDeZapatos = new ArrayList<>();

    // AÑADIR ZAPATOS AL CARRITO
    public void addZapato(Zapato zapato) {
        if (zapato != null) {
            carritoDeZapatos.add(zapato);
            System.out.println("Zapato agregado al carrito");
        } else {
            System.out.println("El zapato ingresado no existe. Prueba nuevamente");
        }

    }

    // CARRITO ES VACIO
    public Boolean estaVacio() {
        if (carritoDeZapatos.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // MOSTRAR LISTA DE ZAPATOS DEL CARRITO
    public void mostrarLista() {
        System.out.println(carritoDeZapatos);
    }

    // ELIMINAR UN PRODUCTO DEL CARRITO
    public void eliminarZapato(String marca) {
        boolean eliminado = false;
        for (int i = 0; i < carritoDeZapatos.size(); i++) {
            if (carritoDeZapatos.get(i).getMarca().equalsIgnoreCase(marca)) {
                carritoDeZapatos.remove(i);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            System.out.println("Zapato de marca " + marca + " eliminado del carrito de compra");
        } else {
            System.out.println("La marca " + marca + " no se encuentra en el carrito de la compra");
        }
    }

    // MOSTRAR EL TOTAL A PAGAR
    public Float totalAPagar() {
        Float total = 0F;
        for (Zapato zapato : carritoDeZapatos) {
            total = total + zapato.getPrecio();
        }
        return total;
    }
}