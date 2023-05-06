package Listas.Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> perguntas  = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");
        String resp;
        Integer cont = 0;
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            resp = sc.nextLine();
            if(resp.toUpperCase().equals("SIM") || (resp.charAt(0) == 's'|| resp.charAt(0) == 'S')){
                cont++;
            }
        }
        System.out.println("pontuacao "+cont);
        if(cont == 2){
            System.out.println("Suspeita");
        }else if(cont>=3 && cont <=4){
            System.out.println("Cumplice");
        }else if(cont == 5){
            System.out.println("Assassina");
        }else{
            System.out.println("Inocente");
        }
        
    }
}
