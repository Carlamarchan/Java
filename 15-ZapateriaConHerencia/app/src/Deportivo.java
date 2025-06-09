
public class Deportivo extends Zapato {
    private Boolean modernas;
    private Boolean deLujo;

    public Deportivo(String marca, String modelo, String material, Float precio, Boolean modernas, Boolean deLujo) {
        super(marca, modelo, material, precio);
        this.modernas = modernas;
        this.deLujo = deLujo;
    }

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

        return "\nDeportivo [Marca= " + getMarca()
                + ", Modelo= " + getModelo() + ", Material= " + getMaterial() + ", Precio= "
                + getPrecio() + ", Modernas= " + modernas + ", De Lujo= " + deLujo
                + "]";
    }

}
