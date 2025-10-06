//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        //Ejemplo de notas

        double[] notas = {8.5, 7.0, 9.0, 600.5};
        int edad = 15;

        //Calcular la media

        double media = calcularMedia(notas);
        boolean mayorEdad = calcularMayorEdad(edad);

        //Aserción para comprobar que la media es válida
       // assert media >= 0 && media <= 10 : "La nota media NO está dentro del rango permitido (0-10)";

        //Aserción para mostrar si la persona vota o no

        assert mayorEdad = false : "La persona NO puede votar";
    }

    private static boolean calcularMayorEdad(int edad) {
        boolean vota = false;
        if (edad >= 18) {
            vota = true;
        } else {
            vota = false;
        }
        return vota;
    }

    private static double calcularMedia(double[] notas) {
        double sumatoria = 0;
        for (double nota : notas) {
            sumatoria = sumatoria + nota;
        }
        return sumatoria / notas.length;
    }

}
