public class Main {
    public static void main(String[] args) {
        
        //Calculadora
        System.out.println("Exercicio calculadora: ");
        Calculadora.soma(12, 63);
        Calculadora.subtracao(1877, 13);
        Calculadora.multiplicacao(33, 64);
        Calculadora.divisao(63, 3.5);
    
        //Mensagem
        System.out.println("Exercício mensagem: ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("Exercício empréstimo: ");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 5);

    }

}
