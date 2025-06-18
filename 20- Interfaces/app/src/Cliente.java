
public class Cliente {
    private String nombre;
    private String telefono;
    private final Integer numeroSorteo;

    public Cliente(String nombre, String telefono, Integer numeroSorteo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.numeroSorteo = numeroSorteo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getNumeroSorteo() {
        return numeroSorteo;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", telefono=" + telefono + ", se le ha asignado el número "
                + this.numeroSorteo + " para el sorteo]";
    }

}