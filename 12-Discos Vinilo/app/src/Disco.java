public class Disco {
    private String artista;
    private String titulo;
    private int year;
    private Boolean inSpotify;

    // Constructor vacío
    public Disco() {
    }

    // Constructor con todos los parámetros
    public Disco(String artista, String titulo, int year, Boolean inSpotify) {
        this.artista = artista;
        this.titulo = titulo;
        this.year = year;
        this.inSpotify = inSpotify;
    }

    // Getters y Setters
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Boolean getInSpotify() {
        return inSpotify;
    }

    public void setInSpotify(Boolean inSpotify) {
        this.inSpotify = inSpotify;
    }

    //Override
    @Override
    public String toString() {
        String inSpotyString = "";
        if (this.inSpotify) {
            inSpotyString = " Si es tendencia en Spotify";
        } else {
            inSpotyString = " No es tendencia en Spotify";
        }
        return "\nDisco [artista: " + artista + ", titulo: " + titulo + ", year: " + year + ", inSpotify: " + inSpotyString
                + "]";
    }

   

}
