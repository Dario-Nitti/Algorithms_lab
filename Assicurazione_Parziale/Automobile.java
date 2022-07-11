package Assicurazione_Parziale;


import java.util.*;

public class Automobile implements Comparable<Automobile>{

    String targa;
    Cliente cliente;

    public Automobile(String targa, Cliente cliente) {
        this.targa = targa.toUpperCase();
        this.cliente = cliente;
    }

    public Automobile(String targa) {
        this(targa,null);
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa.toUpperCase();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Automobile)) return false;
        Automobile that = (Automobile) o;
        return Objects.equals(targa, that.targa) && Objects.equals(cliente, that.cliente);
    }



    @Override
    public String toString() {
        return "Automobile{" +
                "targa='" + targa + '\'' +
                ", cliente=" + cliente +
                '}';
    }

    @Override
    public int compareTo(Automobile o) {
        return this.targa.compareTo(o.targa);
    }
}
