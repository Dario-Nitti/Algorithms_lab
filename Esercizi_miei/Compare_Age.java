package Esercizi_miei;

import java.util.*;


public class Compare_Age{
    public static List<Integer> Different_age(List<Integer> list) {
        List<Integer> listout = new ArrayList<Integer>();
        for (int i : list)
            listout.add(i);
        Collections.sort(listout, new Compare_age());
        return listout;
    }


    public static void main(String[] args)  //test
    {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(32);
        list.add(234);
        list.add(754);
        list.add(23453);
        list.add(3245);


        System.out.println ("Stringhe:\n" + list);
//
        System.out.println ("\nStringhe distinte ordinate per lunghezze decrescenti:\n" + Different_age(list));

    }

}
class Compare_age implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        int differences = (o1 - o2);
        if (differences == 0)
           return o1.compareTo(o2);
            else
            return differences;

        }
    }



