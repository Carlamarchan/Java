public class Mascota { // Si se le pone abstract, no me deja instanciar objetos de la clase mascota
                       // (Convirtiendo a la clase Mascota en un molde)

    private String nombre;
    private int edad;

    public Mascota() {

    }

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

 

}