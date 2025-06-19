public class Camion extends Vehiculo implements IVehiculo {

    private int numeroEjes;
    private boolean tieneRemolque;

    public Camion(String marca, String modelo, String color, int numeroEjes, boolean tieneRemolque) {
        super(marca, modelo, color);
        this.numeroEjes = numeroEjes;
        this.tieneRemolque = tieneRemolque;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public boolean isTieneRemolque() {
        return tieneRemolque;
    }

    public void setTieneRemolque(boolean tieneRemolque) {
        this.tieneRemolque = tieneRemolque;
    }

    @Override
    public String toString() {
        return "\nCamion [Número de ejes= " + numeroEjes + ", Tiene Remolque= " + tieneRemolque + "]";
    }

    @Override
    public void arrancar() {
        System.out.println("Soy un camión y arranco en 0.3 segundo");
    }

    @Override
    public void frenar() {
        System.out.println("Soy un camión y freno en en 0.7 segundos, dependiendo de la carga que traiga");
    }

}