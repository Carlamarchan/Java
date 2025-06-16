package establo;

public class Domestico extends Animal {
    String ownerName;

    public Domestico(String tipo, String nombre, int edad, String ownerName) {
        super(tipo, nombre, edad);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Domestico [tipo=" + tipo + ", ownerName=" + ownerName + ", nombre=" + nombre + ", edad=" + edad + "]";
    }
    
    

}
