package Trenta_Giugno;

import java.util.*;

public class Linked_bin {
    public static <E extends Comparable<? super E>> boolean equals(LinkedBinaryTree<E> t1, LinkedBinaryTree<E> t2) {
        int count = 0;
        E e = null;
        Iterator<E> itr = t1.iteratorInOrder();
        HashMap<Integer,E> map = new HashMap<>();
        if (t1.isEmpty() && t2.isEmpty()) {
            return true;
        } else {
            while (itr.hasNext())
                e = itr.next();
            if (t2.contains(e)) {
                count++;
                map.put(count,e);
                return true;
            } else {
                return false;
            }
        }
    }
}
