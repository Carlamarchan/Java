package biblioteca;

public class Libro {
     String titulo;
     protected String autor;
     private int anioPublicacion;
     public boolean disponible;


     
     public Libro(String titulo, String autor, int anioPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }

    
     public String getTitulo() {
        return titulo;
    }
     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }
     public String getAutor() {
         return autor;
     }
     public void setAutor(String autor) {
         this.autor = autor;
     }
     public int getAnioPublicacion() {
         return anioPublicacion;
     }
     public void setAnioPublicacion(int anioPublicacion) {
         this.anioPublicacion = anioPublicacion;
     }


     
     public String mostrarInformacion() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + getAnioPublicacion() + ", disponible="
                + disponible + "]";
     }

     

     
}
