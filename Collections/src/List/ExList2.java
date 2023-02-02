package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ExList2 {
/*a partir dos dados sobre meus gatos, crie uma lista e ordene ela exibindo (nome - idade - cor):

Gato 1: João; idade: 18m; cor: preto.
Gato 2: Simba; idade: 6m; cor: tigrado.
Gato 3: João; idade: 12m; cor: amarelo.
*/

/*Aqui uma boa opção é criar uma classe 'Gato', com seus respectivos atributos; */
public static void main(String[] args) {
    List<Gato> meusGatos = new ArrayList<>(){{
        add(new Gato("Joao", 18, "preto"));
        add(new Gato("Simba", 6, "tigrado"));
        add(new Gato("Joao", 12, "amarelo"));
    }};
    
    System.out.println("--\tOrdem de Inserção\t---");
    System.out.println(meusGatos);

    System.out.println("--\tOrdem Aleatória\t---");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    System.out.println("--\tOrdem Natural\t---");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);

    /*System.out.println("--\tOrdem Idade\t---");
    Collections.sort(meusGatos, new ComparatorIdade());
    System.out.println(meusGatos);*/

    System.out.println("--\tOrdem cor\t---");
    Collections.sort(meusGatos, new ComparatorCor());
    System.out.println(meusGatos);

    System.out.println("--\tOrdem Nome/Cor/Idade\t---");
    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);


}
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;


public Gato(String nome, Integer idade, String cor){
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
}
public String getNome(){
    return nome;
}
public Integer getIdade(){
    return idade;
}
public String getCor(){
    return cor;
}

@Override
public String toString() {//sem override, sysout mostrará apenas o endereço de memória da lista.
    return "{" + 
            "nome= '" + nome + '\'' +
            ", idade= " + idade + 
            ", cor= '" + cor + '\''  +
            '}';
}
@Override
public int compareTo(Gato Gato) {
    return this.getNome().compareToIgnoreCase(Gato.getNome());
}
}
class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
 
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;
        
        int cor = g1.getCor().compareToIgnoreCase(g2.getNome());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}