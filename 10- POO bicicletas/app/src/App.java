import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        Bicicleta bic1 = new Bicicleta();
        bic1.setMarca("Specialized");
        bic1.setModelo("Tarmac");
        bic1.setVelocidadMaxima(40);
        bic1.setTieneMarchas(true);

        Bicicleta bic2 = new Bicicleta("Scott", "Spark", 45, true);
        Bicicleta bic3 = new Bicicleta("Scott", "Addict ", 50, true);
        Bicicleta bic4 = new Bicicleta("Scott", "Plasma ", 45, false);
        Bicicleta bic5 = new Bicicleta("Trek", "One", 45, false);

        ArrayList<Bicicleta> listaBicicletas = new ArrayList<>(Arrays.asList(bic1, bic2, bic3, bic4, bic5));

        System.out.println("Lista actual de las bicicletas en Stock " + listaBicicletas);

        System.out.println("Deseas introducir una bicicleta al Stock? (S/N)");
        String crearBic = teclado.nextLine();

        while (crearBic.equalsIgnoreCase("S")) {
            Bicicleta nuevaBicicleta = new Bicicleta();
            if (crearBic.equalsIgnoreCase("S")) {
                System.out.println("Ingresa la marca de la bicicleta");
                nuevaBicicleta.setMarca(teclado.nextLine());
                System.out.println("Ingresa el modelo de la bicicleta");
                nuevaBicicleta.setModelo(teclado.nextLine());
                System.out.println("Ingresa la velocidad máxima de la bicicleta");
                nuevaBicicleta.setVelocidadMaxima(teclado.nextInt());
                teclado.nextLine();
                System.out.println("La nueva bicicleta tiene marchas? (true-false)");
                nuevaBicicleta.setTieneMarchas(teclado.nextBoolean());
                teclado.nextLine();
            }

            listaBicicletas.add(nuevaBicicleta);
            System.out.println("Deseas introducir una bicicleta al Stock? (S/N)");
            crearBic = teclado.nextLine();
        }

        // IMPRIMIR LAS BICICLETAS USANDO FOR-EACH:
        for (Bicicleta bicicleta : listaBicicletas) {
            System.out.println(bicicleta);
        }

        // IMPRIMIR LAS BICICLETAS USANDO FOR:
        for (int i = 0; i < listaBicicletas.size(); i++) {
            listaBicicletas.get(i);
        }

        // IMPRIMIR SOLO LA VELOCIDAD Y SI TIENE O NO MARCHA LA BICICLETA
        System.out.println(
                "La marca no es lo más importante al elegir una bicicleta. Te dejo una lista con las velocidades máximas y si tiene marcha o no");
        for (Bicicleta bicicleta : listaBicicletas) {
            System.out.print("Velocidad máxima: " + bicicleta.getVelocidadMaxima() + "km/h");
            if (bicicleta.isTieneMarchas() == true) {
                System.out.println(" Posee marchas?: SI");
            } else {
                System.out.println(" Posee marchas?: NO");
            }

        }
        String metodo = "";
        while (!metodo.equals("5")) {
            System.out.println(metodo);
            System.out.println(
                    "Las bicicletas tienen incorporados varios métodos. Prueba a mirar qué hace cada uno de ellos... \n1.- Tocar claxon \n2.- Parar \n3.- Girar \n4.- Cambiar de marcha \n5.- Salir");
            metodo = teclado.nextLine();
            switch (metodo) {
                case "1":
                    bic1.tocarClaxon();
                    break;
                case "2":
                    bic1.parar();
                    break;
                case "3":
                System.out.println("Hacia donde te gustaría girar? (derecha/izquierda)");
                    bic1.girar(teclado.nextLine());
                    break;
                case "4":
                System.out.println("Te encuentras en cuesta o en bajada?");
                    bic1.cambioDeMarcha(teclado.nextLine());
                    ;
                    break;
                case "5":
                    System.out.println("Gracias por participar!");
                    break;
                default:
                    System.out.println("El valor introducido es incorrecto");
                    break;
            }
        }
        teclado.close();

    }
}
