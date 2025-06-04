import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a tu tienda de Zapatos favorita!");
        Casual casual1 = new Casual("Skechers", "Air", "cuero", 60F);
        Casual casual2 = new Casual("Tommy", "Casual", "tela", 150F);
        ArrayList<Casual> listaCasuales = new ArrayList<>(Arrays.asList(casual1, casual2));
        Elegante elegante1 = new Elegante("Adidas", "Tacón", "charol", 80F);
        Elegante elegante2 = new Elegante("Zara", "Sin tacón", "Tela", 200F);
        ArrayList<Elegante> listaElegantes = new ArrayList<>(Arrays.asList(elegante1, elegante2));
        Deportivo deportivo1 = new Deportivo("Fila", "Sprint", "cuero", 70F);
        Deportivo deportivo2 = new Deportivo("Puma", "Running", "Tela", 50F);
        ArrayList<Deportivo> listaDeportivos = new ArrayList<>(Arrays.asList(deportivo1, deportivo2));

        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        Float total = 0F;
        do {
            System.out.println(
                    "Qué tipo de zapato desea comprar? \n1.- Casuales \n2.- Deportivos \n3.- Elegantes \n4.- Salir");
            opcion = teclado.nextLine();
            if (!opcion.equals("4")) {
                switch (opcion) {
                    case "1":
                        System.out.println("Tenemos los siguientes zapatos casuales: " + listaCasuales);
                        String modelo;                
                        do {
                            System.out.println("Qué marca te gustaría comprar? \n1.- Skechers \n2.- Tommy");
                            modelo = teclado.nextLine();
                             if(modelo=="1"){
                                modelo="Skechers";
                            }
                            else{
                                modelo="Tommy";
                            }
                            if (modelo.equalsIgnoreCase("Skechers") || modelo.equalsIgnoreCase("Tommy")) {
                                total = total + buscarPrecioCasual(modelo, listaCasuales);
                                System.out.println("El total de la compra es: " + total);
                            } else {
                                System.out.println("El valor ingresado es incorrecto");
                            }
                        } while (!modelo.equalsIgnoreCase("Skechers") && !modelo.equalsIgnoreCase("Tommy"));

                        break;
                    case "2":
                        System.out.println("Tenemos los siguientes zapatos Deportivos: " + listaDeportivos);
                        do {
                            System.out.println("Cuál te gustaría comprar? \n1.- Fila \n2.- Puma");
                            modelo = teclado.nextLine();
                            if(modelo=="1"){
                                modelo="Fila";
                            }
                            else{
                                modelo="Puma";
                            }
                            if (modelo.equalsIgnoreCase("Fila") || modelo.equalsIgnoreCase("Puma")) {
                                total = total + buscarPrecioDeportivos(modelo, listaDeportivos);
                                System.out.println("El total de la compra es: " + total);
                            } else {
                                System.out.println("El valor ingresado es incorrecto");
                            }
                        } while (!modelo.equalsIgnoreCase("Fila") && !modelo.equalsIgnoreCase("Puma"));
                        break;

                    case "3":
                        System.out.println("Tenemos los siguientes zapatos Elegantes: " + listaElegantes);
                         do {
                        System.out.println("Cuál te gustaría comprar? \n1.- Adidas \n2.- Zara");
                        modelo = teclado.nextLine();
                         if(modelo=="1"){
                                modelo="Adidas";
                            }
                            else{
                                modelo="Zara";
                            }
                        if (modelo.equalsIgnoreCase("Adidas") || modelo.equalsIgnoreCase("Zara")) {
                        total = total + buscarPrecioElegantes(modelo, listaElegantes);
                        System.out.println("El total de la compra es: " + total);
                        }else{
                             System.out.println("El valor ingresado es incorrecto");
                        }
                    }while(!modelo.equalsIgnoreCase("Adidas") && !modelo.equalsIgnoreCase("Zara"));
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Debes pagar en caja " + total+" euros.");
                System.out.println("Hasta la próxima!");
            }
        } while (!opcion.equals("4"));
        teclado.close();
    }

    private static Float buscarPrecioCasual(String modelo, ArrayList<Casual> listaCasuales) {
        for (Casual casual : listaCasuales) {
            if (casual.getMarca().equalsIgnoreCase(modelo)) {
                return casual.getPrecio();
            }
        }
        return 0F;
    }

    private static Float buscarPrecioDeportivos(String modelo, ArrayList<Deportivo> listaDeportivos) {
        for (Deportivo deportivo : listaDeportivos) {
            if (deportivo.getMarca().equalsIgnoreCase(modelo)) {
                return deportivo.getPrecio();
            }
        }
        return 0F;
    }

    private static Float buscarPrecioElegantes(String modelo, ArrayList<Elegante> listaElegantes) {
        for (Elegante elegante : listaElegantes) {
            if (elegante.getMarca().equalsIgnoreCase(modelo)) {
                return elegante.getPrecio();
            }
        }
        return 0F;
    }
}
