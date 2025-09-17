package zapateria;

import java.util.ArrayList;

/**
 * Clase para gestionar la zapatería
 */
public class CarritoDeLaCompra {

    ArrayList<Zapato> carritoDeZapatos = new ArrayList<>();

    // AÑADIR ZAPATOS AL CARRITO

    /**
     * Función para añadir un par de zapatos al carrito de la compra
     *
     * @param zapato Zapato a añadir
     */
    public void addZapato(Zapato zapato) {
        if (zapato != null) {
            carritoDeZapatos.add(zapato);
            System.out.println("zapateria.Zapato agregado al carrito");
        } else {
            System.out.println("El zapato ingresado no existe. Prueba nuevamente");
        }

    }

    // CARRITO ES VACIO

    /**
     * Función que determina si el carrito de la compra está o no vacío
     *
     * @return True si el carrito de la compra tiene al menos un par de zapatos. Caso contrario, false.
     */
    public Boolean estaVacio() {
        if (carritoDeZapatos.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // MOSTRAR LISTA DE ZAPATOS DEL CARRITO

    /**
     * Función que devuelve la lista de zapatos que están incluidos en el carrito de compra
     */
    public void mostrarLista() {
        System.out.println(carritoDeZapatos);
    }

    // ELIMINAR UN PRODUCTO DEL CARRITO

    /**
     * Función que permite eliminar un par de zapatos del carrito de la compra
     *
     * @param marca Parámetro que sirve para determinar si ese par de zapatos existe en el carrito de la compra
     */
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
            System.out.println("zapateria.Zapato de marca " + marca + " eliminado del carrito de compra");
        } else {
            System.out.println("La marca " + marca + " no se encuentra en el carrito de la compra");
        }
    }

    // MOSTRAR EL TOTAL A PAGAR

    /**
     * Función que retorna el valor total a pagar del carrito de la compra
     *
     * @return Total a pagar
     */
    public Float totalAPagar() {
        Float total = 0F;
        for (Zapato zapato : carritoDeZapatos) {
            total = total + zapato.getPrecio();
        }
        return total;
    }
}