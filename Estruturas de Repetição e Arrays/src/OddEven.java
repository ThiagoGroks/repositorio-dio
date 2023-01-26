import java.util.Scanner;

/*Faça um programa que peça N numeros inteiros,
 * calcule e mostre a quantidade de pares e a de
 * ímpares.
 */
public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int count = 0;
        int numero;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) qtdPares++;
            else qtdImpares++;

            count++;
        } while(count < qtdNumeros);

        System.out.println("Quantidade de pares: " + qtdPares);
        System.out.println("Quantidade de ímpares: " + qtdImpares);
    }
}
