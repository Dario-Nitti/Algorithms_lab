package Esame_22_2_22;

import com.sun.source.tree.Tree;

import javax.print.DocFlavor;
import java.util.*;
import java.util.TreeMap;

public class Libreria {
    List<Libro> libro_list = new ArrayList<>();

    public void ordinaPerAutore(List<Libro> libro_list) {
     Collections.sort(libro_list,new Author());
    }

    public void OrdinaPerzzo(List<Libro> libro_list) {
       libro_list.sort(new PrezzoComp().reversed());
    }

    public Set<Libro> Trovalibribyauthor(String cognome, String nome) {

        TreeSet<Libro> set1 = new TreeSet<Libro>(new Decr_price().reversed());
        for (Libro libro : libro_list) {
            if (libro.cognome.equals(cognome) && libro.nome.equals(nome)) {
                set1.add(libro);
            }
        }
        return set1;
    }

    public TreeMap<Libro, Integer> Libriinmagazzino(String ISBN,List<Libro> libro_list) {
        int count = 0;
        TreeMap<Libro, Integer> magazzino = new TreeMap<>();
        for (Libro libro : libro_list) {
            if (libro.getISBN().equals(ISBN)) {
                count++;
                magazzino.put(libro, count);
            }
        }
        return magazzino;
    }




    private static class Decr_price implements Comparator<Libro> {

        @Override
        public int compare(Libro s1, Libro s2) {
            return Double.compare(s1.prezzo, s2.prezzo);
        }


    }

    private class Author implements Comparator<Libro> {
        @Override
        public int compare(Libro s1, Libro s2) {
           if(s1.cognome.compareTo(s2.cognome)<0) return -1;
           if(s1.cognome.compareTo(s2.cognome)>0) return 1;
            if(s1.nome.compareTo(s2.nome)<0) return -1;
            if(s1.nome.compareTo(s2.nome)>0) return 1;
            return 0;
        }
    }
}



class PrezzoComp implements Comparator<Libro> {
    @Override
    public int compare(Libro o1, Libro o2) {
       if( Double.compare(o1.prezzo, o2.prezzo)<0) return -1;
        if( Double.compare(o1.prezzo, o2.prezzo)>0) return 1;
        return 0;

    }
}


