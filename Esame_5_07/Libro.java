package Esame_5_07;

import java.util.Objects;

public class Libro implements Comparable<Libro> {
    String code;
    String title;
    int pagine;
    double prezzo;

    public Libro(String c, String title, int pagine, double prezzo) {
        code = c.toUpperCase();
        this.title = title;
        this.pagine = pagine;
        this.prezzo = prezzo;
    }

    public String getCode() {
        return code.toUpperCase();
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
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
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(code, libro.code);
    }


    @Override
    public int compareTo(Libro o) {
        return code.compareTo(o.code);
    }

    @Override
    public String toString() {
        return "Libro ( " +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", pagine=" + pagine +
                ", prezzo=" + prezzo +")";
    }
}
