public class PagoEfectivo implements MetodoPagoV2 {
    private double monto;
    private String moneda;
    private String descripcion;

    public PagoEfectivo(double monto, String moneda, String descripcion) {
        this.monto = monto;
        this.moneda = moneda;
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void procesarPago(double cantidad) {
        if(monto<cantidad){
            System.out.println("Has gastado "+ cantidad+" aún me debes "+ (cantidad-monto));
            System.out.println("No se ha efectuado la compra! Prueba nuevamente ;) ");
        }else{
          System.out.println("Se ha cobrado " + cantidad + " euros. Tu cambio es de: " + (monto - cantidad) +" "+ moneda);  
        }
    }

    @Override
    public String toString() {
        return "PagoEfectivo [monto=" + monto + ", moneda=" + moneda + ", descripcion=" + descripcion + "]";
    }

}