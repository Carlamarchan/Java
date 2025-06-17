public class Asistente {
    private String nombre;
    private String apellido;
    private final Long numTicket;
    static Long contador=0L;


    
    public Asistente(String nombre, String apellido) {
        contador++;
        this.numTicket=contador;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Long getNumTicket() {
        return numTicket;
    }


    @Override
    public String toString() {
        return "Asistente [nombre=" + nombre + ", apellido=" + apellido + ", numTicket=" + numTicket + "]";
    }

    

    
}
