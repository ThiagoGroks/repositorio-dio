package List;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class ExSet2 {
    public static void main(String[] args) {
        
        System.out.println("Exiba ordem aleatória: ");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("GOT", "fantasia", 63));
            add(new Serie("Rick & Morty", "scify", 45));
            add(new Serie("Friends", "sitcom", 26));
        }};
        System.out.println(minhasSeries);

        System.out.println("Exiba na ordem de inserção: "); //só é possível se usar LinkedHashSet. Criamos uma nova lista;
       Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
        add(new Serie("GOT", "fantasia", 63));
        add(new Serie("Rick & Morty", "scify", 45));
        add(new Serie("Friends", "sitcom", 26));
    }};
        System.out.println(minhasSeries1);

        System.out.println("Exiba na ordem natural: "); //só é possível por TreeSet;
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1); //preciso implementar Comparable em Series pra usar o TreeSet;
        System.out.println(minhasSeries2);

        System.out.println("Exiba na ordem Nome/Gênero/Tempo: ");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries);
        System.out.println(minhasSeries3);


    }

}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "[nome= " + nome + ", genero= " + genero + ", tempoEpisodio= " + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
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
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        // TODO Auto-generated method stub
        return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    }

}

class ComparatorNomeGeneroTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie o1, Serie o2) {
        // TODO Auto-generated method stub
        int nome = o1.getNome().compareTo(o2.getNome());
        if (nome != 0) return nome;

        int genero = o1.getGenero().compareTo(o2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
    }

}
