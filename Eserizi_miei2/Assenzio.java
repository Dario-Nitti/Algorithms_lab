package Eserizi_miei2;

import java.util.Objects;

public class Assenzio implements Comparable<Assenzio> {
    int codice;
    String nome;
    String distilleria;
    double prezzo;
    //se l'assenzio è bianco è true, altrimenti fasle

    boolean tipo;
    boolean autentico;

    public Assenzio(int codice,String nome, String distilleria, double prezzo, boolean tipo, boolean autentico) {
        this.codice=codice;
        this.nome = nome;
        this.distilleria = distilleria;
        this.prezzo = prezzo;
        this.tipo = tipo;
        this.autentico = autentico;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDistilleria() {
        return distilleria;
    }

    public void setDistilleria(String distilleria) {
        this.distilleria = distilleria;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isAutentico() {
        return autentico;
    }

    public void setAutentico(boolean autentico) {
        this.autentico = autentico;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assenzio assenzio = (Assenzio) o;
        return codice == assenzio.codice;
    }

    @Override
    public String toString() {
        return "Assenzio{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", distilleria='" + distilleria + '\'' +
                ", prezzo=" + prezzo +
                ", tipo=" + tipo +
                ", autentico=" + autentico +
                '}';
    }

    @Override
    public int compareTo(Assenzio that) {
        if (this.getCodice() != that.getCodice()) {
            return (this.getCodice() - that.getCodice());
        }
        return 0;
    }
}
