public class Contadores {
    public static void main(String[] args) {
        int i = 0;
        //Primero se asigna y luego se suma (línea 5)
        int nuevaVariable1 = i++;

        System.out.println(nuevaVariable1);

        //Primero se suma y luego se asigna (línea 10)
        int nuevaVariable2 = ++i;
        System.out.println(nuevaVariable2);
    }
}
