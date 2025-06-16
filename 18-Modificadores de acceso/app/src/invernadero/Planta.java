package invernadero;

public class Planta {
    public String atributoPublic = "Atributo público, se mira desde cualquier sitio";
    protected String atributoProtected = "Protected";
    String atributoDefault = "Default";
    private String atributoPrivate = "Private";

    boolean necesitaSol;

    Arbol arbol1 = new Arbol();

    public void obtenerAtributosDeArbol() {
        System.out.println("La edad de la planta es: " + arbol1.edad + " años");
        System.out.println("La planta tiene un atributo Protegido al cual podemos acceder de manera directa sin el get: "+ arbol1.atributoProtegido);
        System.out.println("La planta tiene un atributo privado al cual sólo podemos acceder por medio del get: "+arbol1.getAtributoPrivado());
        System.out.println("La planta tiene un atributo por defecto al que si podemos acceder sin el get: "+arbol1.atributoPorDefecto);
    }

    public Planta() {
    }

    public Planta(boolean necesitaSol) {
        this.necesitaSol = necesitaSol;
    }

    public boolean isNecesitaSol() {
        return necesitaSol;
    }

    public void setNecesitaSol(boolean necesitaSol) {
        this.necesitaSol = necesitaSol;
    }

    @Override
    public String toString() {
        return "Planta [atributoPrivate=" + atributoPrivate + "]";
    }

}
