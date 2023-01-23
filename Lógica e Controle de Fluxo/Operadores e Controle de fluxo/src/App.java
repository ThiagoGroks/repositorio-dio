import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*boolean b1 = true;
        *boolean b2 = false;
        *boolean b3 = true;
        *boolean b4 = false;

        *System.out.println("b1 && b2 it's " + (b1 && b2));
        *System.out.println("b1 || b4 it's " + (b1 || b4));
        *System.out.println("b4 ^ b2 it's " + (b4 ^ b2));
        System.out.println("b1 isn't " + (!b1));*/

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Qual o número do seu mês?");
        int mes = scanner.nextInt();

        if (mes == 1) {
            System.out.println("Seu mês é Janeiro!");
        } else if (mes == 2) {
            System.out.println("Seu mês é Fevereiro!");
        
        } else if (mes == 3) {
            System.out.println("Seu mês é Março!");
        
        } else if (mes == 4) {
            System.out.println("Seu mês é Abril!");
        
        } else if (mes == 5) {
            System.out.println("Seu mês é Maio!");
        
        } else if (mes == 6) {
            System.out.println("Seu mês é Junho!");
        
        } else if (mes == 7) {
            System.out.println("Seu mês é Julho!");
        
        } else if (mes == 8) {
            System.out.println("Seu mês é Agosto!");
        
        } else if (mes == 9) {
            System.out.println("Seu mês é Setembro!");
        
        } else if (mes == 10) {
            System.out.println("Seu mês é Outubro!");
        
        } else if (mes == 11) {
            System.out.println("Seu mês é Novembro!");
        
        } else if (mes == 12) {
            System.out.println("Seu mês é Dezembro!");
        
        } else {
            System.out.println("Desculpe! Esse número não corresponde a um mês!");
        }
    }
    
}
