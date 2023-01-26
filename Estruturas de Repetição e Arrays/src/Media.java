import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //quais dados serão usados no programa?
        int numero;//inserido no scan;
        int maior = 0;
        int count = 0;
        int soma = 0;        

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;
            if(numero > maior) maior = numero;
            
            count++;            
        }while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma / 5));//os dois dados que me interessam;
    }
}
    

