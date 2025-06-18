import java.util.Scanner;

public class Informatica extends Tienda implements SorteoCliente {

    public Informatica(String nombreTienda, String direccion) {
        super(nombreTienda, direccion);
    }

    @Override
    public void inscribirDatosCliente(Scanner teclado) {
        System.out.println("Bienvenido a tu Tienda Informática " + this.getNombreTienda());
        System.out.println("Ingresa el nombre del Cliente");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa el número de teléfono del cliente");
        String telefono = teclado.nextLine();
        Cliente nuevoCliente = new Cliente(nombre, telefono, darNumero());
        System.out.println("Se ha inscrito al Cliente: " + nuevoCliente + " en \"" + getNombreTienda() + "\"");
    }

    @Override
    public void comunicarResultadosSorteo() {
        int randomNum = (int) (Math.random() * 10 + 1);
        System.out.println("La Papelería \"" + this.getNombreTienda() + "\" te cominuca que ha sido ganador el número "
                + randomNum);
    }

    @Override
    public Integer darNumero() {
        int randomNum = (int) (Math.random() * 10 + 1);
        return randomNum;
    }
}