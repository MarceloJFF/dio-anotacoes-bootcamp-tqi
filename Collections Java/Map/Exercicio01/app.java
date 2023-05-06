package Map.Exercicio01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class app {
    public static void main(String[] args) {
        
        Map<String,Integer> dicionario = new HashMap<>();
        dicionario.put("PE", 9616621);
        dicionario.put("AL", 3351543);
        dicionario.put("CE", 9187103);
        dicionario.put("RN", 3534265);
        
        System.out.println(dicionario);
        //Substitua a população do estado do RN por 3.534.165;
        //dicionario.put("RN", 3534165);
        //System.out.println(dicionario);
        
//         Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277

        if(!dicionario.keySet().contains("PB")){
            dicionario.put("PB", 4039277);
        }

        //Exiba a população PE;
        System.out.println(dicionario.get("PB"));
        
        //Exiba todos os estados e suas populações na ordem que foi informado;
        Map<String,Integer> dicionario2 = new LinkedHashMap<>();
        dicionario2.put("PE", 9616621);
        dicionario2.put("AL", 3351543);
        dicionario2.put("CE", 9187103);
        dicionario2.put("RN", 3534265);

        for(Map.Entry<String, Integer> value : dicionario2.entrySet()){
            System.out.println(value.getKey()+" - "+value.getValue());
        }
        //Exiba os estados e suas populações em ordem alfabética;
        Map<String,Integer> dicionario3 = new TreeMap<>(dicionario2);
        System.out.println(dicionario3);
        
        //Exiba o estado com o menor população e sua quantidade;
        Integer menorPopulacao = Collections.min(dicionario3.values());
        String estadoMenorPopulacao = "";
        for(Map.Entry<String,Integer> value: dicionario3.entrySet()){
            if(value.getValue().equals(menorPopulacao)){
                estadoMenorPopulacao = value.getKey();
                System.out.println("Estado - "+estadoMenorPopulacao+ " Populacao - "+menorPopulacao);
            }
        }
        //Exiba o estado com a maior população e sua quantidade;
        Integer maiorPopulacao = Collections.max(dicionario3.values());
        String estadoMaiorPopulacao = "";

        for(Map.Entry<String,Integer> value2 : dicionario3.entrySet()){
            if(value2.getValue().equals(maiorPopulacao)){
                estadoMaiorPopulacao = value2.getKey();
                System.out.println("Estado - "+estadoMaiorPopulacao+ " Populacao - "+maiorPopulacao);

            }
        }
        //Exiba a soma da população desses estados;
        Iterator<Integer> iterator = dicionario3.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("Soma: "+soma);
        System.out.println("Media: "+ soma/dicionario3.size());

        //Remova os estados com a população menor que 4.000.000;
        
      
        Iterator<Integer> iterator3 = dicionario2.values().iterator();
        while(iterator3.hasNext()){
            if(iterator3.next() > 4000000){
                iterator3.remove();
            }
        }
        System.out.println(dicionario2);
    }
}
