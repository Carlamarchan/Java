public class Bicicleta {

    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private boolean tieneMarchas;

    // Constructor vacío
    public Bicicleta() {
    }

    // Constructor con todos los atributos
    public Bicicleta(String marca, String modelo, int velocidadMaxima, boolean tieneMarchas) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tieneMarchas = tieneMarchas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isTieneMarchas() {
        return tieneMarchas;
    }

    public void setTieneMarchas(boolean tieneMarchas) {
        this.tieneMarchas = tieneMarchas;
    }

    // MÉTODOS

    @Override
    public String toString() {
        String tieneMarchaString = "";
        if (this.tieneMarchas == true) {
            tieneMarchaString = "Si posee marchas";
        } else {
            tieneMarchaString = "No posee marchas";
        }
        return "Bicicleta [marca= " + marca + ", modelo= " + modelo + ", velocidad máxima= " + velocidadMaxima
                + "km/h, posee marchas? " + tieneMarchaString + "] \n";
    }

    public void tocarClaxon() {
        System.out.println("Soy una bicicleta y hago piiiiiiii");
    }

    public void parar() {
        System.out.println("Me detuve");
    }

    public void girar(String direccion) {
        System.out.println("Realicé un giro hacia la " + direccion);
    }

    public void cambioDeMarcha(String pendiente) {
        if (pendiente.equalsIgnoreCase("cuesta")) {
            System.out.println("He aplicado la mejor marcha para subir la cuesta");
        } else if (pendiente.equalsIgnoreCase("bajada")) {
            System.out.println("He aplicado la mejor marcha para frenar durante la bajada");
        } else {
            System.out.println("El parámetro introducido es incorrecto");
        }
        System.out.println();
    }

}