

public class ProductoVirtual implements MetodoPago, MetodoPagoV2{
    private String nombre;
    private Double precio;

    

    public ProductoVirtual(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Double getPrecio() {
        return precio;
    }


    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    @Override
    public void PagoTransferencia() {
        System.out.println("Realizaré la compra del producto Virtual \"" + nombre + "\" mediate pago por transferencia.");

    }

    @Override
    public void pagoPayPal() {
        System.out.println("Realizaré la compra del producto Virtual \"" + nombre + "\" mediate pago por PayPal.");

    }

    @Override
    public void pagoTarjeta() {
        System.out.println("Realizaré la compra del producto Virtual \"" + nombre + "\" mediate pago por tarjeta.");

    }

    

    @Override
    public void procesarPago(double cantidad) {
        
    }


    @Override
    public String toString() {
        return "ProductoVirtual [nombre=" + nombre + ", precio=" + precio + "]";
    }

    
}