package Esercizi_miei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist_ex {
    public static void main(String[] args) {
        List<String> nomi = new ArrayList<String>();
        String[] names = {"albero", "banana", "cuscino","zaino", "denti", "elevatore"};
        for (int i = 0; i < names.length; i++) {
            nomi.add(names[i]);
        }
        Collections.sort(nomi);
        for(int j=0; j<nomi.size(); j++){
        }
        System.out.println("il primo elemento è "+ nomi.get(0) + " e l'ultimo è " + nomi.get(nomi.size()-1));



    }
}
