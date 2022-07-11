package Eserizi_miei2;

import java.util.Objects;

public class Computer implements Comparable<Computer>{
    String codice;
    String marca;
    String modello;
    double schermo;//pollici
    boolean OS; //se true windows altrimenti Linux


    public Computer(String codice, String marca, String modello, double schermo, boolean OS) {
        this.codice = codice;
        this.marca = marca;
        this.modello = modello;
        this.schermo = schermo;
        this.OS = OS;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getSchermo() {
        return schermo;
    }

    public void setSchermo(double schermo) {
        this.schermo = schermo;
    }

    public boolean isOS() {
        return OS;
    }

    public void setOS(boolean OS) {
        this.OS = OS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return Objects.equals(codice, computer.codice);
    }

    @Override
    public String toString() {
        return "Computer {" +
                "codice='" + codice + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", schermo=" + schermo +
                ", OS=" + OS +
                '}';
    }

    @Override
    public int compareTo(Computer o) {
        return codice.compareTo(o.codice);
    }
}
