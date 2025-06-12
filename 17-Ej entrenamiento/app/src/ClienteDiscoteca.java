
public class ClienteDiscoteca {
    String nombre;
    int edad;

    // CONSTRUCTORES
    public ClienteDiscoteca() {
    }

    public ClienteDiscoteca(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // GETTERS Y SETTERS
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String MayorDeEdad() {
        return "Bienvenido " + nombre + " de " + edad + " años a nuestra Discoteca!!!]";
    }

    public String MenorDeEdad() {
        return "Lo siento " + nombre + " al tener " + edad + " años de edad, no puedes entrar a nuestra Discoteca!!!]";
    }

    @Override
    public String toString() {
        return "\nnombre= " + nombre + ", edad=" + edad + "]";
    }
    
    

}
