public class Elegante {
    private String marca;
    private String modelo;
    private String material;
    private Float precio;

    public Elegante() {
    }

    public Elegante(String marca, String modelo, String material, Float precio) {
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

    @Override
    public String toString() {
        return "\nZapato Elegante [marca= " + marca + ", modelo= " + modelo + ", material= " + material + ", precio= "
                + precio
                + " euros]";
    }

    

}
