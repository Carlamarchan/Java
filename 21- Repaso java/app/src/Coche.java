
public class Coche extends Vehiculo implements IVehiculo {

    private int numeroPuertas;
    private boolean tieneAireAcondicionado;

    public Coche(String marca, String modelo, String color, int numeroPuertas, boolean tieneAireAcondicionado) {
        super(marca, modelo, color);
        this.numeroPuertas = numeroPuertas;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    @Override
    public String toString() {
        return "\nCoche [Numero de puertas= " + numeroPuertas + ", Tiene aire acondicionado= " + tieneAireAcondicionado + "]";
    }

    @Override
    public void arrancar() {
        System.out.println("Soy un coche y arranco en 0.1 segundo");
    }

    @Override
    public void frenar() {
        System.out.println("Soy un coche y freno en en 0.3 segundos, dependiendo de la velocidad");
    }

}