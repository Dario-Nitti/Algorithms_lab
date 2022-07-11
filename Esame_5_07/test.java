package Esame_5_07;

import Esame_15_06.Magazzino;

import java.util.Map;

public class test {

    public static void main(String[] args) throws Exception {
        new test().run();
    }

    private void run() throws Exception {
        Libro l1 = new Libro("cvgb78", "bkjn", 500, 12.50);
        Libro l2 = new Libro("bhkfwbuk", " gvui", 522, 1.50);
        Libro l3 = new Libro("ftuykul", "andkaed", 5135, 2.50);
        Libro l5 = new Libro("ftuykul", "andkaed", 5135, 2.50);
        Libro l4 = new Libro("adnoea", "dnsios", 1, 200.0);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.insert(l1,10);
        biblioteca.insert(l2,100);
        biblioteca.insert(l3,500);
        biblioteca.insert(l4,5);
        biblioteca.insert(l5,10);


        System.out.println(biblioteca.OrdinaPerPrezzo());
        


    }
}
