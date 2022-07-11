import java.util.*;

public class Rubrica {
    LinkedList<Contatto> rubrica;


    public Rubrica() {
        rubrica = new LinkedList<Contatto>();

    }

    public boolean addcontatto(String nome, String cognome, String telefono) {
        Contatto contatto = new Contatto(nome, cognome, telefono);
        for (Contatto c : rubrica)
            if (c.equals(contatto))
                return c.addnum(telefono);
        return rubrica.add(contatto);
    }

    boolean deletecont(String nome, String cognome) {
        return rubrica.remove(new Contatto(nome, cognome, new ArrayList<String>()));
    }

    List<String> search(String nome, String cognome) {
        Contatto contatto = new Contatto(nome, cognome, new ArrayList<String>());
        for (Contatto c : rubrica)
            if (c.equals(contatto))
                return c.getNumeri();

        return null;
    }

    void Sort_by_name() {
        Collections.sort(rubrica);
    }

    void Sort_by_surname() {
        Collections.sort(rubrica,new ByCognome());
    }

    class ByCognome implements Comparator<Contatto>{
        public int compare(Contatto c1, Contatto c2){
            int compareCognome = c1.getCognome().compareToIgnoreCase(c2.getCognome());
            if(compareCognome==0)
                return  c1.getNome().compareToIgnoreCase(c2.getNome());
            else
                return compareCognome;
        }

        public void print(){
            for (Contatto c : rubrica)
                System.out.println(c);
        }
    }
}