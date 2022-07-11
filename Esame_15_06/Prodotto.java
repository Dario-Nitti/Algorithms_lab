package Esame_15_06;

import java.util.Objects;

public class Prodotto implements Comparable<Prodotto> {
    String cod;
    String descr;
    double prezzo;
    int sconto;

    public Prodotto(String cod, String descr, double prezzo, int sconto) {
        this.cod = cod;
        this.descr =descr;
        this.prezzo = prezzo;
        this.sconto = sconto;
    }



    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getSconto() {
        return sconto;
    }

    public void setSconto(int sconto) {
        this.sconto = sconto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return Objects.equals(cod, prodotto.cod);
    }



    @Override
    public String toString() {
        return "Prodotto " +
                "cod='" + cod + '\'' +
                ", descr='" + descr + '\'' +
                ", prezzo=" + prezzo +
                ", sconto=" + sconto ;
    }



    @Override
    public int compareTo(Prodotto o) {
        return cod.compareTo(o.cod);
    }
}
