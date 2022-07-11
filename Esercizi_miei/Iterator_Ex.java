package Esercizi_miei;

import java.util.*;

public class Iterator_Ex {

//    public <E> Iterator IterEx(Iterator<E> itr) {
//        TreeSet<E> lista = new TreeSet<E>();
//        while (itr.hasNext())
//            lista.add(itr.next());
//        return lista.iterator();
//    }

public static boolean ex_itr(HashSet<String> set){
    Iterator<String> it= set.iterator();
    if (it.hasNext())
        return true;
    else
        set.add(it.next());
    return true;
}

}
