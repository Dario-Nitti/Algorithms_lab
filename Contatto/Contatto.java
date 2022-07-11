import java.util.ArrayList;
import java.util.Objects;

public class Contatto implements Comparable<Contatto> {
    public String nome, cognome;
    ArrayList<String> numeri = new ArrayList<String>();

    public Contatto(String newnome, String newcognome, String newtelefono) {
        this.nome = newnome;
        this.cognome = newcognome;
        numeri.add(newtelefono);
    }

    public Contatto(String newnome, String newcognome, ArrayList<String> newnumeri) {
        nome = newnome;
        cognome = newcognome;
        numeri = newnumeri;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public ArrayList<String> getNumeri() {
        return numeri;
    }

    public void setNome(String newnome) {
        this.nome = newnome;
    }

    public void setCognome(String newcognome) {
        this.cognome = newcognome;
    }

    public void setNumeri(ArrayList<String> newnumeri) {
        this.numeri = newnumeri;
    }

    public boolean addnum(String newnum) {
        if (!numeri.contains(newnum))
            return numeri.add(newnum);
        else
            return false;
    }


    @Override
    public String toString() {
        return "Contatto{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", numeri=" + numeri +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contatto)) return false;
        Contatto contatto = (Contatto) o;
        return Objects.equals(nome, contatto.nome) && Objects.equals(cognome, contatto.cognome) && Objects.equals(numeri, contatto.numeri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, numeri);
    }

    public int compareTo(Contatto other) {
        int comparanome = nome.compareToIgnoreCase(other.nome);
        if (comparanome == 0)
            return cognome.compareToIgnoreCase(other.cognome);
        else
            return comparanome;

    }
}


