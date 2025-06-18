
public class Tienda {
    private String nombreTienda;
    private String direccion;

    
    public Tienda(String nombreTienda, String direccion) {
        this.nombreTienda = nombreTienda;
        this.direccion = direccion;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }
    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Tienda [nombreTienda=" + nombreTienda + ", direccion=" + direccion + "]";
    }

    
    
}