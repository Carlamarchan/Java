
public class Moto extends Vehiculo implements IVehiculo {

    private boolean tieneMaletero;
    private boolean esDeportiva;

    public Moto(String marca, String modelo, String color, boolean tieneMaletero, boolean esDeportiva) {
        super(marca, modelo, color);
        this.tieneMaletero = tieneMaletero;
        this.esDeportiva = esDeportiva;
    }

    public boolean isTieneMaletero() {
        return tieneMaletero;
    }

    public void setTieneMaletero(boolean tieneMaletero) {
        this.tieneMaletero = tieneMaletero;
    }

    public boolean isEsDeportiva() {
        return esDeportiva;
    }

    public void setEsDeportiva(boolean esDeportiva) {
        this.esDeportiva = esDeportiva;
    }

    @Override
    public String toString() {
        return "\nMoto [Tiene Maletero= " + tieneMaletero + ", Es deportiva= " + esDeportiva + "]";
    }

    @Override
    public void arrancar() {
        System.out.println("Soy una moto y arranco en 0.01 segundo");
    }

    @Override
    public void frenar() {
        System.out.println("Soy un coche y freno en en 0.2 segundos, dependiendo de la velocidad");
    }

}