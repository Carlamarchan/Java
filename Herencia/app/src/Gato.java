public class Gato extends Mascota {
    private boolean salvaje;

    public Gato(String nombre, int edad, boolean salvaje) {
        super(nombre, edad);
        this.salvaje = salvaje;
    }

    public boolean isSalvaje() {
        return salvaje;
    }

    public void setSalvaje(boolean salvaje) {
        this.salvaje = salvaje;
    }

    @Override
    public String toString() {
        String esSalvaje;
        if (salvaje == true) {
            esSalvaje = "SOY";
        } else {
            esSalvaje = "NO SOY";
        }
        return "\n[ Me llamo " + getNombre() + ". Tengo " + getEdad()+ " años y " + esSalvaje + " un gato salvaje]";
    }

}
