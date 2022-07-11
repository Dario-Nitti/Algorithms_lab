package Esame_22_2_22;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String []args){
        new test().run();
    }
    private void run(){
        Libro libro1 = new Libro("hbjnkml", "bhnjkml", "vbnklm", 20.1);
        Libro libro5 = new Libro("ednksf", "bhnjkml", "vbnklm", 5.6);

        Libro libro2 = new Libro("qwer", "vghbjnkml", "hgmkjhjb", 10.0);
        Libro libro3 = new Libro("mjkhbg", "sdfghjk", "dcgfvhbjnk", 6.5);
        Libro libro4 = new Libro("mjkhbg", "das", "asdfdsf", 6.5);
        Libro libro6= new Libro("mjkhbg", "das", "asdfdsf", 6.5);


        List<Libro> libro_list = new ArrayList<Libro>();
        libro_list.add(libro2);
        libro_list.add(libro1);
        libro_list.add(libro5);
        libro_list.add(libro6);        libro_list.add(libro6);
        libro_list.add(libro6);
        libro_list.add(libro6);
        libro_list.add(libro6);



        libro_list.add(libro3);
        libro_list.add(libro4);
        Libreria lib = new Libreria();
       System.out.println(lib.Libriinmagazzino("mjkhbg" ,libro_list));




    }
}

