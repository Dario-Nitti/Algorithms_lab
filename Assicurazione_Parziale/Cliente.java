package Assicurazione_Parziale;


import java.util.Objects;

public class Cliente implements Comparable<Cliente> {

    String nominativo;
    String CF;
    String città;

    public Cliente(String nominativo, String CF, String città) {
        this.nominativo = nominativo;
        this.CF = CF.toUpperCase();
        this.città = città;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) {
        this.CF = CF.toUpperCase();
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nominativo, cliente.nominativo) && Objects.equals(CF, cliente.CF) && Objects.equals(città, cliente.città);
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nominativo='" + nominativo + '\'' +
                ", CF='" + CF + '\'' +
                ", città='" + città + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cliente C) {
        return this.CF.compareTo(C.CF);
    }


}
