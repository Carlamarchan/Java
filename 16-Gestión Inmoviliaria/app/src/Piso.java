public class Piso extends Inmueble {
    Integer planta;
    Boolean ascensor;

    // CONSTRUCTORES
    public Piso() {

    }

    public Piso(Float superficie, Double precio, String ubicacion, Integer planta, Boolean ascensor) {
        super(superficie, precio, ubicacion);
        this.planta = planta;
        this.ascensor = ascensor;
    }

    // GETTERS Y SETTERS
    public Boolean getAscensor() {
        return ascensor;
    }

    public void setAscensor(Boolean ascensor) {
        this.ascensor = ascensor;
    }

    public Integer getPlanta() {
        return planta;
    }

    public void setPlanta(Integer planta) {
        this.planta = planta;
    }

    // METODOS
    public String tipoInmueble() {
        return "Casa";
    }

    // TO STRING
    @Override
    public String toString() {
        String hasAscensor;
        if (ascensor == true) {
            hasAscensor = " tiene ascensor ";
        } else {
            hasAscensor = " no tiene ascencor";
        }
        return "\nPiso de " + superficie + " m2. Se encuentra ubicado en " + ubicacion + " Planta " + planta
                + ". Cuesta " + precio
                + " euros, y "
                + hasAscensor;
    }

}
