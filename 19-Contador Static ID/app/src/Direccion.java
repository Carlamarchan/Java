public class Direccion {
    private String calle;
    private String ciudad;
    private Long cP;

    
    public Direccion(String calle, String ciudad, Long cP) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.cP = cP;
    }


    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public Long getcP() {
        return cP;
    }
    public void setcP(Long cP) {
        this.cP = cP;
    }


    @Override
    public String toString() {
        return "Direccion: Calle= " + calle + ", Ciudad= " + ciudad + ", Código Postal= " + cP + "]";
    }

    
    
}
