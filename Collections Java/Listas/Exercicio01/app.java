package Listas.Exercicio01;
// Faça um programa que receba a temperatura média dos 6
// primeiros meses do ano e armazene-as em uma lista.


import java.util.ArrayList;
import java.util.List;

import java.util.*;

// Após isto, calcule a média semestral das temperaturas e
// mostre todas as temperaturas acima desta média, e em que
// mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
// – Fevereiro e etc).
public class app {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> temperaturasMesesDoAno = new ArrayList<>();
        Integer qtdMeses = 6;
        Integer auxMeses = 0;

        while(auxMeses < qtdMeses){
            System.out.println("Escolha um valor de Temperatura: ");
            Double temperaturaAtualEscolhida = sc.nextDouble();
            temperaturasMesesDoAno.add(temperaturaAtualEscolhida);
            auxMeses++;
        }

        Iterator<Double> iteratorTemperaturas = temperaturasMesesDoAno.iterator();
        Double somaTemperaturas = 0.0;
        Double mediaTemperaturas = 0.0;
        while(iteratorTemperaturas.hasNext()){
            Double next  = iteratorTemperaturas.next();
            somaTemperaturas+=next;   
        }
        mediaTemperaturas = somaTemperaturas/temperaturasMesesDoAno.size();
        System.out.println("Media Temperaturas: "+ mediaTemperaturas);
        Integer meses = 0;
        for (Double temperatura : temperaturasMesesDoAno) {
            meses++;
            if(temperatura> mediaTemperaturas){
                switch(meses){
                    case 1:
                        System.out.println(meses+" - Janeiro");
                    break;
                    case 2:
                        System.out.println(meses+" - Fevereiro");
                    break;
                    case 3:
                        System.out.println(meses+" - Março");
                    break;
                    case 4:
                        System.out.println(meses+" - Abril");
                    break;
                    case 5:
                        System.out.println(meses+" - Maio");
                    break;
                    case 6:
                        System.out.println(meses+" - Junho");
                    break;
                }
            }
        }

    }
}
