import biblioteca.Libro;
import establo.Domestico;
import establo.Salvaje;
import gestor.GestorBiblioteca;
import gestor.GestorBiblioteca.LibroSubclase;
import invernadero.Arbol;
import invernadero.Planta;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a tu granja!");

        Planta planta1 = new Planta(true);
        Arbol arbol1 = new Arbol(15);
        Salvaje salvaje1 = new Salvaje("León", "Mufasa", 3, "Africa");
        Domestico domestico1 = new Domestico("perro", "Luna", 2, "Carla");
        System.out.println("Atributo público de la clase planta " + planta1.atributoPublic);
        // System.out.println("Atributo Protected de planta "+
        // planta1.atributoProtected); //Este no se puede ver porque es protected. Sólo
        // se puede ver desde clases dentro del mismo paquete
        // System.out.println("Atributo Default de planta "+ planta1.atributoProtected);
        // //Este no se puede ver porque es default. Sólo se puede ver desde otra clase
        // System.out.println("Atributo Private de planta "+ planta1.atributoProtected);
        // //Este no se puede ver porque es private. Sólo se puede ver desde su propia
        // clase
        planta1.obtenerAtributosDeArbol();
        System.out.println(arbol1.toString());
        System.out.println(salvaje1.toString());
        System.out.println(domestico1.toString());

        System.out.println(GestorBiblioteca.libro1.mostrarInformacion());
        System.out.println(GestorBiblioteca.user1.mostrarDatos());

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("¿Puedes acceder directamente al atributo anioPublicacion desde GestorBiblioteca?");
        System.out.println("No se puede acceder directamente, hay que hacerlo por medio del método \"getAnioPublicacion\"");
        System.out.println(GestorBiblioteca.llamarAnioDePublicacion());

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("¿Puedes acceder directamente al título desde GestorBiblioteca?");
        System.out.println("No se puede acceder directamente, hay que hacerlo por medio del método \"getTitulo ya que es un atributo Default y sólo se puede ver desde el mismo paquete\"");
        System.out.println(GestorBiblioteca.llamarTitulo());

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Qué ocurre si creas una subclase de Libro en gestor y tratas de acceder a autor? ");
        System.out.println("Se puede acceder porque tiene el modificador protected pero está feo de hacerlo (muy confuso)");
        GestorBiblioteca.LibroSubclase libro2=new GestorBiblioteca.LibroSubclase("Crimen y Castigo", "Fiodor", 2020, false);
        libro2.devolverAutorDesdeSubclase();

        

    }

}
