package Esame_5_07;


import java.util.*;

public class Biblioteca {

    TreeMap<Libro, Integer> magazzino = new TreeMap<Libro, Integer>();
    //il valore del treemap è il numero di copie di un libro

    public void insert(Libro libro, int copie) {
        if (magazzino.containsKey(libro)) {
            magazzino.merge(libro, copie, Integer::sum);
        } else {
            magazzino.put(libro, copie);
        }
    }

    public void remove(String codice, int copie) {
        for (Map.Entry<Libro, Integer> entry : magazzino.entrySet())
            if (entry.getKey().getCode().equals(codice.toUpperCase()) && copie > entry.getValue()) {
                throw new RuntimeException("troppe copie da eliminare");
            }else{
                entry.setValue(entry.getValue() - copie);
            }
    }

    public Set<Libro> ordinaPerCodice() {
        TreeSet<Libro> set = new TreeSet<>(magazzino.keySet());
        return set;
    }

    public Set<Libro> OrdinaPerPrezzo() {
        TreeSet<Libro> set = new TreeSet<Libro>(new OrdinaPrezzo());
        for (Map.Entry<Libro, Integer> entry : magazzino.entrySet())
            set.add(entry.getKey());
        return set;
    }

    public Set<Libro> trovaLibri(int numpagine) {
        TreeSet<Libro> set2 = new TreeSet<>();
        for (Map.Entry<Libro, Integer> entry : magazzino.entrySet())
            if (entry.getKey().getPagine() > numpagine) {
                set2.add(entry.getKey());
            }
        return set2;
    }

    public int getNumeroCopie() {
        int copietot = magazzino.size();
        return copietot;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "magazzino=" + magazzino +
                '}';
    }

    private class OrdinaPrezzo implements Comparator<Libro> {
        @Override
        public int compare(Libro s1, Libro s2) {
            if (Double.compare(s1.prezzo, s2.prezzo) < 0) return -1;
            if (Double.compare(s1.prezzo, s2.prezzo) > 0) return 1;
            return 0;
        }
    }
}


