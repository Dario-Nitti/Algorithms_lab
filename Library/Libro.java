package Library;

import java.util.Objects;

public class Libro implements Comparable<Libro> {
     int IBS;
    String nome;
    String cognome;
    double prezzo;
    String categoria;




    public int getIBS() {
        return IBS;
    }

    public void setIBS(int IBS) {
        this.IBS = IBS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return IBS == libro.IBS;
    }


    @Override
    public String toString() {
        return "Library.Libro{" +
                "IBS=" + IBS +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }


    @Override
    public int compareTo(Libro that) {
        if (this.getIBS() != that.getIBS()) {
            return (this.getIBS() < that.getIBS() ? -1 : 1);
        }

        return 0;
    }
}
