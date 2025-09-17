package zapateria;

/**
 * Clase Base para todos los zapatos
 */
public abstract class Zapato {
    private String marca;
    private String modelo;
    private String material;
    private Float precio;

    /**
     * Constructor sin parámetros
     */
    public Zapato() {
    }

    /**
     * Constructor con parámetros
     * @param marca Marca del zapato
     * @param modelo Modelo del zapato
     * @param material Material del zapato
     * @param precio Precio del zapato
     */
    public Zapato(String marca, String modelo, String material, Float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.material = material;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
}
