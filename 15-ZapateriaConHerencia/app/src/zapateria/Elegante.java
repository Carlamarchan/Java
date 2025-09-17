package zapateria;
/**
 * Clase Elegante: Hereda de {@link zapateria.Zapato}
 */
public class Elegante extends Zapato {
    private Boolean conTacon;

    /**
     * Constructor sin parámetros
     */
    public Elegante() {

    }

    /**
     *  Constructor con parámetros
     *
     * @param marca Marca del zapato
     * @param modelo Modelo del zapato
     * @param material Material del zapato
     * @param precio Precio del zapato
     * @param conTacon Detalle del zapato si tiene tacón o no
     */
    public Elegante(String marca, String modelo, String material, Float precio, Boolean conTacon) {
        super(marca, modelo, material, precio);
        this.conTacon = conTacon;
    }

    public Boolean getConTacon() {
        return conTacon;
    }

    public void setConTacon(Boolean conTacon) {
        this.conTacon = conTacon;
    }

    @Override
    public String toString() {
        return "\nzapateria.Elegante [Marca()= " + getMarca() + ", Modelo()= " + getModelo()
                + ", Material()= " + getMaterial() + ", Precio()= " + getPrecio() + " conTacon= " + conTacon + "]";
    }

}
