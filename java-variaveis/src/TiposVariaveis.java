public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        /*
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        */

        //variável pode mudar
        int numero = 1;

        numero = 2;

        System.out.println(numero);

        //podemos evitar a mudança com o termo final e o nome da var em caixa alta;
        final double VALOR_DE_PI = 3.14;


        System.out.println(VALOR_DE_PI);
    }
}
