package Herança;

class RodarApp {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();//uma variável instanciada para o obj Funcionario();

        //agora vou definir variáveis para os objetos dentro do objeto Funcionario (UPCAST);
        Funcionario faxineiro = new Faxineiro();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();

        
    }    
}
