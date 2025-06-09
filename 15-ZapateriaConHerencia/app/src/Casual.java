public class Casual extends Zapato {
    private Boolean conCorrea;

    public Casual() {

    }

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
        return "\nCasual [Marca= " + getMarca() + ", Modelo= " + getModelo()
                + ", Material= " + getMaterial() + ", Precio= " + getPrecio() + " conCorrea= " + getConCorrea()
                + "]";
    }

}