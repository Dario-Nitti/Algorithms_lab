package Eserizi_miei2;

import java.util.*;

public class Book implements Comparable<Book> {
    String titolo;
    String nome;
    String cognome;
    int anno;

    public Book(String titolo, String nome, String cognome, int anno) {
        this.titolo = titolo;
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titolo='" + titolo + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", anno=" + anno +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nome.equals(book.nome) && cognome.equals(book.cognome);
    }


    @Override
    public int compareTo(Book o) {
        return titolo.compareTo(o.titolo);
    }


    public TreeMap<Book, Integer> mappa(int copie, List<Book> lista_libri) {
        TreeMap<Book, Integer> mappa = new TreeMap<>();
        for (Book b : lista_libri)
            if (mappa.containsKey(b)) {
                mappa.merge(b, copie, Integer::sum);
            } else {
                mappa.put(b, copie);
            }
        return mappa;
    }

    public static void libri(List<Book> lista){
        Set<Book> lista_libri = new TreeSet<Book>(new AuthorOrd());
        lista_libri.addAll(lista);
        System.out.println(lista_libri);
    }

    public static void anno(List<Book> lista){
        Set<Book> lista_libri = new TreeSet<Book>(new AnnoDecr());
        lista_libri.addAll(lista);
        System.out.println(lista_libri);
    }


    public static void main(String[] args) {
        Book b1 = new Book("ghjkj", "ghjh", "hgjhkj", 100);
        Book b2 = new Book("cvbnm", ",kljhjb", "retyuui", 532);
        Book b3 = new Book("adesf", ",asd", "bjhk", 23);
        Book b4 = new Book("adesf", ",asd", "bjhk", 0);
        List<Book> lista = new ArrayList<>();
        lista.add(b1);
        lista.add(b2);
        lista.add(b3);
        lista.add(b4);

        Book.anno(lista);
    }

     static class AuthorOrd implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return Comparator.comparing(Book::getNome)
                    .thenComparing(Book::getCognome)
                    .thenComparing(Book::getTitolo)
                    .compare(o1,o2);

        }
    }

     static class AnnoDecr implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.anno-o2.getAnno();
        }
    }
}
