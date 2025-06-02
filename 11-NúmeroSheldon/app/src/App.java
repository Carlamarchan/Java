import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    // EJERCICIO 1: NÚMEROS DE SHELDON
    public static void main(String[] args) throws Exception {
        List<NumeroSheldon> numerosFavoritosSheldon = new ArrayList<>();

        for (int i = 37; i <= 173; i++) {
            if (NumeroSheldon.esValido(i)) {
                numerosFavoritosSheldon.add(new NumeroSheldon(i));
            }
        }

        System.out.println(numerosFavoritosSheldon);

        // EJERCICIO 2: LOG-IN tres intentos

        Scanner teclado = new Scanner(System.in);

        LogInUser user1 = new LogInUser("Carla", "Carla123");
        LogInUser user2 = new LogInUser("Anthonny", "Ant123");
        String user = "";

        do {

            System.out.println(
                    "Tenemos 2 usuarios: user1/user2. A cúal quieres acceder? (Escribe \"salir\" si deseas salir) ");
            user = teclado.nextLine();
            switch (user) {
                case "user1":
                    probarContraseña(user1, teclado);
                    break;
                case "user2":
                    probarContraseña(user2, teclado);
                    break;
                case "salir":
                    System.out.println("Gracias por participar!");
                    break;

                default:
                    System.out.println("La opción seleccionada no existe");
            }

        } while (!user.equalsIgnoreCase("salir"));
        teclado.close();

    }

    private static void probarContraseña(LogInUser user, Scanner teclado) {
        String opcion = "";
        do {
            System.out.println("Introduce la contraseña para el usuario " + user.getUsuario());

            if (user.logIn(teclado.nextLine()) && (user.isBloqueado().equals(false))) {
                System.out.println("Log-In exitoso");
                user.setTotalIntentos(0);
                System.out.println(user.getTotalIntentos());
            } else {
                if (user.isBloqueado()) {
                    System.out.println("Acceso bloqueado. Demasiados intentos.");
                    System.out.println(user.getTotalIntentos());
                } else {
                    System.out.println("Log-In fallido");
                    System.out.println(user.getTotalIntentos());
                }
            }

            System.out.println("Quieres intentar nuevamente el login?");
            opcion = teclado.nextLine();

        } while (!opcion.equalsIgnoreCase("No"));

    }
}
