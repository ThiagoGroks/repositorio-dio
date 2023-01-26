import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um inteiro
 * fornecido pelo user;
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int x = 1;//é necessário um número para executar a multiplicação;
        //ele é 1, porque se fosse 0 a conta zeraria na primeira.

        System.out.print(fatorial + "! = ");



        for(int i = fatorial; i >= 1; i--){
            x = x * i; //fatorial não muda. Por isso precisamos de x;
        }
        System.out.println(x);

    }
}
