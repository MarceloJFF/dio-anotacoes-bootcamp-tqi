package Conjuntos.Exercicio02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class app {
    public static void main(String[] args) {
        List<LinguagemFavorita> listaLinguagens = new ArrayList<>();
        listaLinguagens.add(new LinguagemFavorita("Java", 1994, "Intelij")) ;      
        listaLinguagens.add(new LinguagemFavorita("Python", 1994, "Pycharm")) ;      
        listaLinguagens.add(new LinguagemFavorita("Javascript", 1996, "vscode")) ;      
        listaLinguagens.add(new LinguagemFavorita("C", 1980, "vscode")) ;      

       // System.out.println(listaLinguagens);
        //Set<LinguagemFavorita> listaLinguagensFavoritas = new TreeSet<>(listaLinguagens);
        
        //System.out.println(listaLinguagensFavoritas);
        Set<LinguagemFavorita> listaLinguagensFavoritas = new TreeSet<>(new ComparadorNomeAnoDeCriacaoIde());
        listaLinguagensFavoritas.addAll(listaLinguagens);
        System.out.println(listaLinguagensFavoritas);
    }
}
class ComparadorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        Integer retornoNome = o1.getNome().compareTo(o2.getNome());
        if(retornoNome != 0) return retornoNome;

        Integer retornoAno = o1.getAnoDeCriacao().compareTo(retornoNome);
        if(retornoAno != 0) return retornoAno;

        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
    
}