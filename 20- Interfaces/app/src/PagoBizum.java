
public class PagoBizum implements MetodoPagoV2 {
    private String numeroTelefono;
    private String nombreTitular;
    private String moneda;

    public PagoBizum(String numeroTelefono, String nombreTitular, String moneda) {
        this.numeroTelefono = numeroTelefono;
        this.nombreTitular = nombreTitular;
        this.moneda = moneda;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Se ha hecho un bizum de " + cantidad + " " + moneda + " desde el número " + numeroTelefono
                + " que pertenece a " + nombreTitular);
    }

    @Override
    public String toString() {
        return "PagoBizum [numeroTelefono= " + numeroTelefono + ", nombreTitular=" + nombreTitular
                + ", moneda=" + moneda + "]";
    }

}