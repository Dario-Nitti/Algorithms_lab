package Esame_15_06;

import Eserizi_miei2.Canzone;
import com.sun.source.tree.Tree;

import java.util.*;
import java.util.TreeMap;

public class Magazzino {
    TreeMap<Prodotto, Integer> prodotto = new TreeMap<Prodotto, Integer>();
    TreeMap<Prodotto,Integer> magazzino = new TreeMap<Prodotto,Integer>();



    public void insert(Prodotto prodotto, int unità) {
        TreeMap<Prodotto, Integer> magazzino = new TreeMap<Prodotto, Integer>();
        for (Map.Entry<Prodotto, Integer> p1 : magazzino.entrySet())
            if (p1.equals(prodotto)) {
                p1.setValue(p1.getValue() + unità);

            }
    }


    public void remove(Prodotto prodotto) {
        TreeMap<Prodotto, Integer> magazzino = new TreeMap<Prodotto, Integer>();
        for (Map.Entry<Prodotto, Integer> p1 : magazzino.entrySet())
            if (p1.equals(prodotto)) {
                p1.setValue(p1.getValue() - 1);
            }
    }


    public TreeSet<Prodotto> ordinaPerCodice() {
        TreeMap<Integer, Prodotto> magazzino = new TreeMap<Integer, Prodotto>();
        TreeSet<Prodotto> magazzino_set = new TreeSet<Prodotto>(magazzino.values());
        return magazzino_set;
    }


    public TreeSet<Prodotto> ordinaPerPrezzo() {
        TreeMap<Integer, Prodotto> magazzino = new TreeMap<Integer, Prodotto>();
        TreeSet<Prodotto> magazzino_set = new TreeSet<Prodotto>(new price());
        magazzino_set.addAll(magazzino.values());
        return magazzino_set;
    }


    public TreeSet<Prodotto> trovaprodotto (int unità){
        TreeMap<Prodotto,Integer> magazzino = new TreeMap<Prodotto,Integer>();
        TreeSet<Prodotto> magazzino_set = new TreeSet<Prodotto>(new cod());

        for(Map.Entry<Prodotto,Integer> entry: magazzino.entrySet()){
            if(entry.getValue()<unità){
                magazzino_set.add(entry.getKey());
            }
        }
        return magazzino_set;
    }



    public int GetValoreMagazzino(Prodotto prodotto,int unità){

        TreeMap<Integer,Integer> rimanenti= new TreeMap<>();
        for(Map.Entry<Prodotto,Integer> entry: magazzino.entrySet()){
            if(entry.getKey().cod.equals(prodotto.getCod())){
                entry.setValue(entry.getValue()+unità);
                rimanenti.put(unità,entry.getKey().sconto);
            }
        }
        return unità;
    }


    public void convert(TreeMap<Prodotto,Integer> map){
        Set<Prodotto> set = map.keySet();
        System.out.println(set);
    }


    public static void main(String[] args) {
        Prodotto p = new Prodotto("dgfgjhbk", "ctyvub", 15.0, 20);
        Prodotto p4 = new Prodotto("cvhbjkn", "zxcvb", 1.0, 20);
        Prodotto p1 = new Prodotto("adefsrg", "nkbjv", 60.0, 99);
        Prodotto p2 = new Prodotto("rtyughio", "xvcbnm", 25.0, 99);

        TreeMap<Prodotto,Integer> magazzino = new TreeMap<Prodotto,Integer>();

        magazzino.put(p,50);
        magazzino.put(p1,1);
        magazzino.put(p2,2);
        magazzino.put(p4,10);
        TreeSet<Prodotto> set= new TreeSet<Prodotto>(new price().reversed());

         for(Map.Entry<Prodotto,Integer> entry:magazzino.entrySet()) {
             set.add(entry.getKey());
         }
         Iterator<Prodotto> itr= set.iterator();
         while (itr.hasNext())
        System.out.println(itr.next());

    }

    private static class price implements Comparator<Prodotto> {

        @Override
        public int compare(Prodotto o1, Prodotto o2) {
            return Integer.compare(Double.compare(o1.prezzo, o2.prezzo), 0);
        }
    }

    private static class cod implements Comparator<Prodotto> {
        @Override
        public int compare(Prodotto o1, Prodotto o2) {
          return o1.cod.compareTo(o2.getCod());
        }
    }
}
