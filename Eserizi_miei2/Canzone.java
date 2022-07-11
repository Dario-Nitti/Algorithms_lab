package Eserizi_miei2;

import java.util.Comparator;
import java.util.Objects;

public class Canzone implements Comparable<Canzone> {
    String nome;
    int durata;

    public Canzone(String nome, int durata) {
        this.nome = nome;
        this.durata = durata;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Canzone canzone = (Canzone) o;
        return Objects.equals(nome, canzone.nome);
    }

    @Override
    public String toString() {
        return "Canzone{" +
                "nome='" + nome + '\'' +
                ", durata=" + durata +
                '}';
    }

    @Override
    public int compareTo(Canzone o) {
        return nome.compareTo(o.nome);
    }
}
