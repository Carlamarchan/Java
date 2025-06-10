public abstract class Inmueble {
    Float superficie;
    Double precio;
    String ubicacion;
    String tipo;

    
    public Inmueble() {
    }


    public Inmueble(Float superficie, Double precio, String ubicacion) {
        this.superficie = superficie;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }


    public Float getSuperficie() {
        return superficie;
    }


    public void setSuperficie(Float superficie) {
        this.superficie = superficie;
    }


    public Double getPrecio() {
        return precio;
    }


    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    public String getUbicacion() {
        return ubicacion;
    }


    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

        
}
