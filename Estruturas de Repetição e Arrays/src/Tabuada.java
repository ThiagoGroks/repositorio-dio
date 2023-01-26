import java.util.Scanner;
/*
 * Desenvolva um gerador de tabuada (int entre 1 e 10).
 * O usuário informa de qual número ele 
 * quer a tabuada, e saída é a tabuada de 1 a 10.
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 1 a 10: ");
        int numero = scan.nextInt();

        System.out.println("Tabuda de " + numero);

        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
    