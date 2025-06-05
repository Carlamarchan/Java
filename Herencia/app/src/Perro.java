public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad); // lo toma de mascota
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "\n[ Me llamo " + getNombre() + ". Tengo " + getEdad() + " años y soy de raza: " + raza + "]";
    }

}
