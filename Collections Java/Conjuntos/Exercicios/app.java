package Conjuntos.Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class app {
    public static void main(String[] args) {


        Set<String> cores = new HashSet<>();
        cores.add("vermelha");
        cores.add("laranja");
        cores.add("amarela");
        cores.add("verde");
        cores.add("azul");
        cores.add("anil");
        cores.add("violeta");

        //A - Exiba todas as cores uma abaixo da outra        
        System.out.println(cores);
        //B - A quantidade de cores que o arco-íris tem
        System.out.println(cores.size());
        //C - Exiba as cores em ordem alfabética
        Set<String> cores2 = new TreeSet<>();
        Iterator<String> iterator = cores.iterator();
        while(iterator.hasNext()){
            cores2.add(iterator.next());
        }
        System.out.println(cores2);

        //D - Exiba as cores na ordem inversa da que foi informada
        ArrayList<String> cores3 = new ArrayList<>(cores2);
        
        Collections.reverse(cores3);
        System.out.println(cores3);    
        //E- Exiba todas as cores que começam com a letra ”v”
        for (String cor : cores3) {
            if(cor.charAt(0) == 'v'){
                System.out.println("Comeca com v - "+ cor);
            }
        }

        //F - Remova todas as cores que não começam com a letra “v”
        Iterator<String> iterator3 = cores3.iterator();
        
        while(iterator3.hasNext()){
            if(!(iterator3.next().charAt(0) == 'v') ){
                iterator3.remove();
            }
        }
        //G -Limpe o conjunto
        cores3.clear();

        //HConfira se o conjunto está vazio
        cores.isEmpty();
    }       
}
