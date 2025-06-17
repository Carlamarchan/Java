public class Cliente {
    private final Long iD;
    private String name;
    private int edad;
    private Direccion direccion;
    private static Long contador = 0L;

    public Cliente(String name, int edad, Direccion direccion) {
        contador++;
        this.iD = contador;
        this.name = name;
        this.edad = edad;
        this.direccion = direccion;
    }

    public Long getiD() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente [iD=" + iD + ", name=" + name + ", edad=" + edad + ", direccion=" + direccion + "]";
    }

}
