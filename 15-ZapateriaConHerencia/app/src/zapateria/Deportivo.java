package zapateria;
/**
 * Clase Deportiva: Hereda de {@link zapateria.Zapato}
 */
public class Deportivo extends Zapato {
    private Boolean modernas;
    private Boolean deLujo;

    /**
     * Cosntructor de la clase deportiva con parámetros
     *
     * @param marca Marca del zapato
     * @param modelo Modelo del zapato
     * @param material Materiañ del zapato
     * @param precio Precio del zapato
     * @param modernas Detalle que indica si las zapatillas son modernas
     * @param deLujo Detalle que indica si las zapatillas son de lujo o no
     */
    public Deportivo(String marca, String modelo, String material, Float precio, Boolean modernas, Boolean deLujo) {
        super(marca, modelo, material, precio);
        this.modernas = modernas;
        this.deLujo = deLujo;
    }
    /**
     * Constructor de la clase Deportiva sin parámetros
     */
    public Deportivo() {

    }

    public Boolean isModernas() {
        return modernas;
    }

    public void setModernas(Boolean modernas) {
        this.modernas = modernas;
    }

    public Boolean isDeLujo() {
        return deLujo;
    }

    public void setDeLujo(Boolean deLujo) {
        this.deLujo = deLujo;
    }

    @Override
    public String toString() {

        return "\nzapateria.Deportivo [Marca= " + getMarca()
                + ", Modelo= " + getModelo() + ", Material= " + getMaterial() + ", Precio= "
                + getPrecio() + ", Modernas= " + modernas + ", De Lujo= " + deLujo
                + "]";
    }

}
