package Esame_22_2_22;

import java.util.Objects;

public class Libro implements Comparable<Libro>{
    String ISBN;
    String cognome;
    String nome;
    double prezzo;

    public Libro(String ISBN, String cognome, String nome, double prezzo) {
        this.ISBN = ISBN;
        this.cognome = cognome;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return ISBN.equals(libro.ISBN);
    }


    @Override
    public int compareTo(Libro that) {
     return ISBN.compareTo(that.ISBN);
    }

    @Override
    public String toString() {
        return "Libro" +
                "ISBN='" + ISBN + '\'' +
                ", cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo;
    }



}
