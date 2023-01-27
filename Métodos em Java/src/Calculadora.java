public class Calculadora {
    public static void soma(double a, double b) {
        
        double resultado = a + b;
        
        System.out.println("A soma de " + a + " mais " + b + " é igual a " + resultado);
    }

    public static void subtracao(double a, double b){

        double resultado = a - b;

        System.out.println("A subtração de " + a + " menos " + b + " é igual a " + resultado);
    }

    public static void multiplicacao(double a, double b){

        double resultado = a * b;

        System.out.println("A multiplicação de " + a + " vezes " + b + " é igual a " + resultado);
    }

    public static void divisao(double a, double b){

        double resultado = a / b;

        System.out.println("A divisão de " + a + " por " + b + " é igual a " + resultado);
    }


}
