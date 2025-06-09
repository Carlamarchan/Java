public class Elegante extends Zapato {
    private Boolean conTacon;

    public Elegante() {

    }

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
        return "\nElegante [Marca()= " + getMarca() + ", Modelo()= " + getModelo()
                + ", Material()= " + getMaterial() + ", Precio()= " + getPrecio() + " conTacon= " + conTacon + "]";
    }

}
