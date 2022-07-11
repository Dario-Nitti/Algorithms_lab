package Esercizi_miei;

/* EX1 del 27/01/2016 (I appello)
 * Si scriva un metodo public List<String> DifferentWordsList(List<String>) che,
 * data in input una lista di stringhe list, restituisce una nuova lista priva di
 * elementi duplicati, contenente tutte le stringhe distinte di list e ordinata
 * per lunghezze decrescenti (a parit� di lunghezza ordinamento lessicografico crescente) .
 *
 *
 * Write a method    public List<String> DifferentWordsList(List<String>)
 * that returns a new list containing all the strings in the given list, without
 * duplicates. The method sorts the list by string length in decreasing order.
 *
 *
 * */

import java.util.*;


public class Words {

    /*** versione 1 ***/
    public static List<String> DifferentWordsList(List<String> list) {
        List<String> listOut = new ArrayList<String>();
        HashSet<String> ts = new HashSet<String>(list);
        for (String s: ts)
            listOut.add(s);
        Collections.sort(listOut);
        return listOut;
    }

    /*** versione 2  ***/
//    public static List<String> DifferentWordsList2(List<String> list) {
//        List<String> listOut = new ArrayList<String>();
//        TreeSet<String> ts = new TreeSet<String>(new DecreasingLength());
//        ts.addAll(list);
//        for (String s: ts) listOut.add(s);
//        return listOut;
//    }


    public static void main(String[] args)  //test
    {
        List<String> lista = new ArrayList<String>();
        lista.add("tree");
        lista.add("flower");
        lista.add("tree");
        lista.add("flower");
        lista.add("animal");
        lista.add("flower");
        lista.add("fruit");
        lista.add("food");

        System.out.println ("Stringhe:\n" + lista);

        System.out.println ("\nStringhe distinte ordinate per lunghezze decrescenti:\n" + DifferentWordsList(lista));

    } // method main

}//end-class-Words

class DecreasingLength implements Comparator<String> {
    public int compare(String a, String b) {
        int diff = b.length() - a.length();
        if (diff == 0)
            return a.compareTo(b);
        else return diff;

    }



    }





