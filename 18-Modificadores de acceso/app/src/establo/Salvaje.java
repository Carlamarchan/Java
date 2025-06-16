package establo;

public class Salvaje extends Animal {
    String zonaGeografica;

    public Salvaje(String tipo, String nombre, int edad, String zonaGeografica) {
        super(tipo, nombre, edad);
        this.zonaGeografica = zonaGeografica;
    }

    public String getZonaGeografica() {
        return zonaGeografica;
    }

    public void setZonaGeografica(String zonaGeografica) {
        this.zonaGeografica = zonaGeografica;
    }

    @Override
    public String toString() {
        return "Salvaje [tipo=" + tipo + ", zonaGeografica=" + zonaGeografica + ", nombre=" + nombre + ", edad=" + edad
                + "]";
    }

    
}
