package Eserizi_miei2;

import java.util.*;


public class Negozio{

    TreeSet<Assenzio> negozio = new TreeSet<Assenzio>();
    TreeSet<Assenzio> blanche = new TreeSet<Assenzio>();
    TreeSet<Assenzio> verte = new TreeSet<Assenzio>();


    public TreeMap<Assenzio, Integer> insertassenzio(Assenzio assenzio, int nordine) {
        TreeMap<Assenzio, Integer> ordine = new TreeMap<>();
        for (Assenzio a : negozio)
            ordine.put(a, nordine);
        return ordine;
    }



    public void deleteorder(int nordine) {
        TreeMap<Assenzio, Integer> ordine = new TreeMap<>();
        for (Map.Entry<Assenzio, Integer> entry : ordine.entrySet())
            if (nordine == entry.getValue()) {
                ordine.remove(entry.getKey());
            }
    }


    public void organizzazione(String categoria) {
        TreeMap<String, TreeSet<Assenzio>> cat = new TreeMap<>();
        for (Assenzio a : negozio)
            if (a.tipo) {
                blanche.add(a);
                cat.put(categoria, blanche);
            } else {
                verte.add(a);
                cat.put(categoria, verte);
            }
    }



    public void insertscaffale(){
        Stack<Assenzio> scaffaleverte = new Stack<>();
        Stack<Assenzio> scaffaleblanche = new Stack<>();
        for(Assenzio a :negozio)
            if(a.tipo){
                scaffaleverte.push(a);
            }else{
                scaffaleblanche.add(a);
            }
    }


    public static void main(String[] args) {
        TreeSet<Assenzio> negozio = new TreeSet<Assenzio>(new SortDistillerie());
        Assenzio a1 = new Assenzio(8526, "assenzio1", "Pontelier", 50.5, true, true);
        Assenzio a3 = new Assenzio(52, "assenzio4", "emile", 50.5, true, true);
        Assenzio a2 = new Assenzio(789, "assenzio2", "unemile", 56.5, false, true);
        TreeSet<Assenzio> blanche = new TreeSet<>();
        TreeSet<Assenzio> verte = new TreeSet<Assenzio>();
        negozio.add(a1);
        negozio.add(a2);
        negozio.add(a3);
        TreeMap<String, TreeSet<Assenzio>> cat = new TreeMap<>();
        Stack<Assenzio> scaffaleverte = new Stack<>();
        Stack<Assenzio> scaffaleblanche = new Stack<>();
        for(Assenzio a :negozio)
            if(!a.tipo){
                scaffaleverte.push(a);
            }else{
                scaffaleblanche.add(a);
                Collections.sort(scaffaleblanche);
            }
        System.out.println("scaffale bianco" + scaffaleblanche);
        System.out.println("scaffale verde " + scaffaleverte.peek());


    }

    private static class SortDistillerie implements Comparator<Assenzio> {

        @Override
        public int compare(Assenzio o1, Assenzio o2) {
            return o1.distilleria.compareTo(o2.getDistilleria());
        }
    }
}
