package zapateria;

/**
 * Clase Casual: Hereda de {@link zapateria.Zapato}
 */
public class Casual extends Zapato {
    private Boolean conCorrea;

    /**
     * Constructor de la clase casual sin parámetros
     */
    public Casual() {

    }

    /**
     * Constructor de la clase casual con parámetros
     *
     * @param marca Marca del zapato
     * @param modelo Modelo del zapato
     * @param material Material del zapato
     * @param precio Precio del zapato
     * @param conCorrea Con correa?
     */
    public Casual(String marca, String modelo, String material, Float precio, Boolean conCorrea) {
        super(marca, modelo, material, precio);
        this.conCorrea = conCorrea;
    }

    public Boolean getConCorrea() {
        return conCorrea;
    }

    public void setConCorrea(Boolean conCorrea) {
        this.conCorrea = conCorrea;
    }

    @Override
    public String toString() {
        return "\nzapateria.Casual [Marca= " + getMarca() + ", Modelo= " + getModelo()
                + ", Material= " + getMaterial() + ", Precio= " + getPrecio() + " conCorrea= " + getConCorrea()
                + "]";
    }

}