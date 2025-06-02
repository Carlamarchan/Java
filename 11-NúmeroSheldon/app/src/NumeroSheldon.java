public class NumeroSheldon {
    private Integer numero;

    public NumeroSheldon(Integer numero){
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }
    
    public static boolean esValido(Integer numero) {
        boolean numeroEsPar = numero % 2 == 0;
        boolean numeroRangoValido = numero > 37 && numero < 173;
        boolean numeroNoTerminaEnCero = numero % 10 != 0;

        if ((numeroEsPar && numeroRangoValido && numeroNoTerminaEnCero) || numero == 73) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nNumeroSheldon [numero=" + numero + "]";
    }

}