package Eserizi_miei2;

import java.util.*;

public class Shop {

    TreeMap<Computer, Integer> elenco = new TreeMap<>();


    public void insert_computer(Computer computer, int prodotto) {
        if (elenco.containsKey(computer)) {
            elenco.merge(computer, prodotto, Integer::sum);
        } else {
            elenco.put(computer, prodotto);
        }
    }

    public void delete(String cod) {
        for (Map.Entry<Computer, Integer> entry : elenco.entrySet())
            if (entry.getKey().getCodice().equals(cod)) {
                entry.setValue(entry.getValue() - 1);

            }
    }


    public TreeSet<Computer> Ordinaperschermo() {
        TreeSet<Computer> computers =new TreeSet<>(new Orddisplay());
        for (Map.Entry<Computer, Integer> entry : elenco.entrySet()) {
            computers.add(entry.getKey());
        }
        return computers;
    }


    public Set<Computer> Ordinapermarca() {
        TreeSet<Computer> computers =new  TreeSet<>(new OrdOS());
        for (Map.Entry<Computer, Integer> entry : elenco.entrySet()) {
            computers.add(entry.getKey());
        }
        return computers;
    }


    private class Orddisplay implements Comparator<Computer> {
        @Override
        public int compare(Computer s1, Computer s2) {
            if(Double.compare(s1.schermo,s2.schermo)<0) return -1;// crescente
            if (Double.compare(s1.schermo,s2.schermo)>0) return 1;// crescente
            if ((s1.marca).compareTo (s2.marca) < 0) return -1;
            if ((s1.marca).compareTo (s2.marca) > 0) return 1;
        return 0;
        }
    }


    private class nameComp implements Comparator<Computer> {
        @Override
        public int compare(Computer o1, Computer o2) {
            return o1.marca.compareTo(o2.marca);
        }
    }


    private class OrdOS implements Comparator<Computer> {
        @Override
        public int compare(Computer o1, Computer o2) {
            if ((o1.modello).compareTo (o2.modello) < 0) return -1;
            if ((o1.modello).compareTo (o2.modello) > 0) return 1;
            if ((o1.marca).compareTo (o2.marca) < 0) return -1;
            if ((o1.marca).compareTo (o2.marca) > 0) return 1;
            return 0;
        }
    }
}