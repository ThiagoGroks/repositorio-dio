package List;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ExMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        //aqui iniciamos dizendo que usaremos Map. E então, quais os dados desejados?
        Map<String, Double> carros = new HashMap<>(){{
         put("gol", 14.4);   
         put("corsa", 13.2);   
         put("palio", 13.5);   
         put("opala", 3.1);   
         put("maverick", 3.2);   
         put("a1", 23.7);   
        }};
        System.out.println(carros);

        System.out.println("Substitua o consumo do corsa para 13.9: ");
        carros.put("corsa", 13.9);//não consigo adicionar um novo modelo, mas posso alterar os dados;
        System.out.println(carros.toString());

        System.out.println("Há um Tucson na lista? " + carros.containsKey("Tucson"));

        System.out.println("Qual o consumo do opala? " + carros.get("opala"));

        System.out.println("Exiba os modelos adicionados: "); //armazeno a função em uma variável "modelos";
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos: ");//da mesma forma, a função precisa ser armazenada numa variável;
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);

        //Aqui ficou mais feio:
        System.out.println("Qual o modelo mais econômico? " );
        Double melhorConsumo = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(melhorConsumo))
                modeloMaisEficiente = entry.getKey();
        }

        System.out.println("O modelo mais eficiente é: " + modeloMaisEficiente + ", e seu consumo é de: " + melhorConsumo);

        System.out.println("Exiba o modelo menos eficiente: ");
        Double piorConsumo = Collections.min(carros.values());
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry: carros.entrySet()) {
            if(entry.getValue().equals(piorConsumo))
                modeloMenosEficiente = entry.getKey();
        }
        System.out.println("O modelo menos eficiente é: " + modeloMenosEficiente + ", e seu consumo é de: " + piorConsumo);

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma dos consumos é de: " + soma);

        System.out.println("Exiba a média dos consumos: " + (soma/carros.size()));

        System.out.println("Remova os modelos com consumo igual a 3.1: ");
        Iterator<Double> iterator1 = carros.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(3.1)) iterator1.remove();
        }
        System.out.println(carros);

        System.out.println("Exiba os carros na ordem em que foram informados: ");
        Map<String, Double> carros1 = new LinkedHashMap<>() {{
            put("gol", 14.4);   
            put("corsa", 13.2);   
            put("palio", 13.5);
            put("maverick", 3.2);   
            put("a1", 23.7);          
        }};
        System.out.println(carros1);

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println(carros2);
    
    }
    
}
