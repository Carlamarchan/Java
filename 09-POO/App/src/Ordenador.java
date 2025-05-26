public class Ordenador {
    String marca;
    String procesador;
    String memoriaRam;
    double precio;
    boolean oferta;

    public Ordenador(String marca, String procesador, String memoriaRam, double precio, boolean oferta) {
        this.marca = marca;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.precio = precio;
        this.oferta = oferta;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    @Override
    public String toString() {
        return "Ordenador [marca=" + marca + ", procesador=" + procesador + ", memoriaRam=" + memoriaRam + ", precio="
                + precio + ", oferta=" + oferta + "]";
    }

}
