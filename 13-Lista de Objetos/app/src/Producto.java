public class Producto {
    private String name;
    private String origen;
    private Float price;
    private Float weight;

    public Producto() {
    }

    public Producto(String name, String origen, Float price, Float weight) {
        this.name = name;
        this.origen = origen;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\n Producto [Nombre= " + name + ", origen= " + origen + ", precio= " + price + " euros, peso= " + weight + " Kg ]";
    }

    

}
