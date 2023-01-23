import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try (//criando o scanner;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            //qual mensagem será lida, e que tipo de dado aceito?
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();
            
            System.out.println("Digite a sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //impressão dos dados obtidos
            System.out.println("Olá! Me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + "cm.");
        }
    }
}