package gestor;

import biblioteca.Libro;
import biblioteca.Usuario;

public class GestorBiblioteca {

    public static Libro libro1 = new Libro("Metamorfosis", "Kafka", 2018, false);
    public static Usuario user1 = new Usuario("Carla", 32);

    public static class LibroSubclase extends Libro {

        public LibroSubclase(String titulo, String autor, int anioPublicacion, boolean disponible) {
            super(titulo, autor, anioPublicacion, disponible);

            
        }

        public void  devolverAutorDesdeSubclase() {
            System.out.println(this.autor);
        }

    }

    public static int llamarAnioDePublicacion() {
        return libro1.getAnioPublicacion();
    }

    public static String llamarTitulo() {
        return libro1.getTitulo();
    }

}
