package List;

import java.util.HashMap;
import java.util.Map;

public class ExMap2 {
    public static void main(String[] args) {
    
        System.out.println("Exiba a lista de forma aleatória: ");
        Map<String, Integer> meusLivros = new HashMap<>(){{
            put("Alice no País das Maravilhas", 290);
            put("As Crônicas de Nárnia", 391);
            put("Cartas de um diabo ao seu aprendiz", 189);
            put("Entendes o que lês?", 232);
        }};
        System.out.println(meusLivros);


    }
}

class Livros {
    String nome;
    Integer paginas;


    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }


    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livros other = (Livros) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livros [nome=" + nome + ", paginas=" + paginas + "]";
    }

    
}