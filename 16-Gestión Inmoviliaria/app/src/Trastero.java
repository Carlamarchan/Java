public class Trastero extends Inmueble {
    Boolean seguro;

    // CONSTRUCTORES
    public Trastero() {

    }

    public Trastero(Float superficie, Double precio, String ubicacion, Boolean seguridad) {
        super(superficie, precio, ubicacion);
        this.seguro = seguridad;
    }

    // GETTERS Y SETTERS
    public Boolean isSeguro() {
        return seguro;
    }

    public void setSeguridad(Boolean seguridad) {
        this.seguro = seguridad;
    }

    // METODOS
    public String tipoInmueble() {
        return "Casa";
    }

    // TO STRING
    @Override
    public String toString() {
        String hasSegurString;
        if (seguro == true) {
            hasSegurString = " tiene seguro";
        } else {
            hasSegurString = " no tiene seguro";
        }
        return "\nTrastero de " + superficie + " m2. Se encuentra ubicado en " + ubicacion + ". Cuesta " + precio
                + " euros y "
                + hasSegurString;
    }

}
