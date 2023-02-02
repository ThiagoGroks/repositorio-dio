package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//dada uma lista com 7 notas de um aluno (7.0, 8.5, 9.3, 5, 7, 0, 3.6), faça:
class ExList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        //Qual a posição da nota 5?
        System.out.println("A posição da nota 5.0 é: " + notas.indexOf(5d));
        
        //"add" Inserindo novo item;
        notas.add(4, 8d);
        System.out.println("Agora 8.0 esta na posição 4: " + notas);
        
        //"set" substituindo 5 por 7;
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //"contains" - checando se 5 está na lista;
        System.out.println("A lista contém 5? " + notas.contains(5d));
    
         //exiba todas as notas na ordem em que foram informadas;
        //for (Double nota : notas) System.out.println(notas);
       
        //"get" exiba a terceira nota adicionada;
        System.out.println("A terceira nota é " + notas.get(2));

        //"collections.min" exiba a menor nota;
        System.out.println("A menor nota é: " + Collections.min(notas));

        //"Collections.max" exiba a maior nota;
        System.out.println("A maior nota é: " + Collections.max(notas));
    
        //"iterator" exiba a soma dos valores;
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d; //cria uma variável pra ir recebendo os valores somados;
        while(iterator.hasNext()){//enquanto houver um próximo número a somar ele vai...;
            Double next = iterator.next();//juntar o nº atual com o próximo e...;
            soma += next; //somar.
        }
        System.out.println("Qual a soma das notas? " + soma);

        //qual a média?
        System.out.println("A média é: " + soma/notas.size());//size nos dá um int com  qtd de elementos;

        //"remove" remova o zero;
        notas.remove(0d);
        System.out.println(notas);

        //"iterator+remove" exiba uma lista sem as menores que 7;
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();//percorre iterator1;
            if(next < 7) iterator1.remove(); 
        }
        System.out.println(notas);

        //"clear" limpe a lista
        notas.clear();
        System.out.println(notas);

        //confira se a lista está vazia
        System.out.println("A lista está vazia mesmo mané? " + notas.isEmpty());
    }
}
