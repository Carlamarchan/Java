
public class PagoTarjeta implements MetodoPagoV2 {
    private String numeroTarjeta;
    private String nombreTitular;
    private String codigoSeguridad;

    public PagoTarjeta(String numeroTarjeta, String nombreTitular, String codigoSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Se ha debitado " + cantidad + " euros de tu cuenta " + numeroTarjeta);
    }

    @Override
    public String toString() {
        return "PagoTarjeta [numeroTarjeta= " + numeroTarjeta + ", nombreTitular= " + nombreTitular
                + ", codigoSeguridad= "
                + codigoSeguridad + "]";
    }

}