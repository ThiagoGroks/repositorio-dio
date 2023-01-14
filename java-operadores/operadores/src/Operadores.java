public class Operadores {
    public static void main(String[] args) throws Exception {
       
        //Atribuição (=), um dado é atribuído à variável;
        /*int idade = 64;
        double peso = 57.2;

        System.out.println(idade);
        System.out.println(peso);

        //Aritméticos
        int soma = 2 + 2;
        System.out.println(soma);
        
        double subtrai = 365.8 - 2.2;
        System.out.println(subtrai);

        int multiplica = 2*2;
        System.out.println(multiplica);
        
        
        //Unários
        int numero = 5;
        System.out.println(numero);
        System.out.println(- numero);
        
        
        int numero = 5;
        //numero = numero +1;

        System.out.println(numero);//resultado é 6.
        //podemos fazer assim
        System.out.println(++numero);
        //conceito aplicável no decremento tb
        System.out.println(--numero);

        boolean variavel = true;

        System.out.println(!variavel);
        */

        //Ternário
        int a, b;

        a = 5;
        b = 6;
        
        /*String resultado = "";
        if(a==b)    
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */
        //vejamos como procedemos no operador;

        String resultado = a==b ? "de fé!" : "nem a pau!";
        
        System.out.println(resultado);

        //Lógico

        boolean cond1 = false;
        boolean cond2 = false;

        if(cond1 && cond2) {
            System.out.println("Ambas são verdadeiras");
        }

        if(cond1 || cond2){
            System.out.println("alguma é verdadeira");
        }
        else{
            System.out.println("foi tudo uma farsa!");
        }

    }   

}
