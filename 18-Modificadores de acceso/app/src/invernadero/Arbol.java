package invernadero;

public class Arbol {
    public int edad=9;
    protected String atributoProtegido ="Atributo protegido";
    private String atributoPrivado ="Atributo privado";
    String atributoPorDefecto ="Atributo por defecto";


    public Arbol() {

    }

    
    public String getAtributoProtegido() {
        return atributoProtegido;
    }


    public void setAtributoProtegido(String atributoProtegido) {
        this.atributoProtegido = atributoProtegido;
    }


    public String getAtributoPrivado() {
        return atributoPrivado;
    }


    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }


    public String getAtributoPorDefecto() {
        return atributoPorDefecto;
    }


    public void setAtributoPorDefecto(String atributoPorDefecto) {
        this.atributoPorDefecto = atributoPorDefecto;
    }


    public Arbol(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Arbol [edad=" + edad + ", atributoProtegido=" + atributoProtegido + ", atributoPrivado="
                + atributoPrivado + ", atributoPorDefecto=" + atributoPorDefecto + "]";
    }

    

}
