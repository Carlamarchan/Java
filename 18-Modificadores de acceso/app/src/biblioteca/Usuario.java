package biblioteca;

public class Usuario {
    private String nombre;
    int Id;
    private static int contador = 0;

    public Usuario(String nombre, int id) {
        contador++;
        this.Id = contador;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarDatos() {
        return "Usuario [ID= " + Id + " nombre= " + nombre + "]";
    }

}
