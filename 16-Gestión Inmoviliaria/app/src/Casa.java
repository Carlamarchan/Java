public class Casa extends Inmueble {
    Boolean adosada;

    // CONSTRUCTORES
    public Casa() {

    }

    public Casa(Float superficie, Double precio, String ubicacion, Boolean adosada) {
        super(superficie, precio, ubicacion);
        this.adosada = adosada;
    }

    // GETTERS Y SETTERS
    public Boolean isAdosada() {
        return adosada;
    }

    public void setAdosada(Boolean adosada) {
        this.adosada = adosada;
    }

    // METODOS
    public String tipoInmueble() {
        return "Casa";
    }

    // TO STRING
    @Override
    public String toString() {
        String isAdosadaString;
        if (adosada == true) {
            isAdosadaString = " está adosada";
        } else {
            isAdosadaString = " no está adosada";
        }
        return "\nCasa de " + superficie + " m2. Se encuentra ubicada en " + ubicacion + ". Cuesta " + precio
                + " euros y "
                + isAdosadaString;
    }

}
