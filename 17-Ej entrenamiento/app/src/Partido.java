public class Partido {
    private String nombre;
    private int votosTotales;
    public int porcentaje;

    // CONSTRUCTORES

    public Partido() {

    }

    public Partido(String nombre, int votosTotales) {
        this.nombre = nombre;
        this.votosTotales = votosTotales;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getvotosTotales() {
        return votosTotales;
    }

    public void setvotosTotales(int votosTotales) {
        this.votosTotales = votosTotales;
    }

    // TO STRING
    @Override
    public String toString() {
        return "\n" + nombre.toUpperCase() + ", Ha obtenido= " + votosTotales + " Votos.Dando un porcentaje de "
                + porcentaje
                + "%. Gráfica porcentual:    ";
    }

}
