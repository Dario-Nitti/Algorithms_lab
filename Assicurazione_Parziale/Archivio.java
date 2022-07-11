package Assicurazione_Parziale;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Archivio {

    ArrayList<Automobile> archivio= new ArrayList<Automobile>();

    public void insert(String targa, Cliente cliente){
        insert(new Automobile(targa,cliente));
    }

    private void insert(Automobile automobile) {
        for(Automobile auto: archivio){
            if(auto.equals(automobile)){
                auto.setCliente(auto.getCliente());
                return;
            }
        }
        archivio.add(automobile);
    }

    private boolean delete(String targa){
        return archivio.remove(new Automobile(targa));
    }
    private Archivio arch_città(String città){
        Archivio nuovo= new Archivio();
        for(Automobile a: archivio)
            if((a.getCliente().getCittà().equals(città.toUpperCase())))
                nuovo.insert(a);
        return nuovo;
    }

    public void sort_targa(){
        Collections.sort(archivio);
    }

    public void sort_Cf(){
        Collections.sort(archivio, new cmp_cf());
    }

    @Override
    public String toString() {
        return "Archivio{" +
                "archivio=" + archivio +
                '}';
    }

    private class cmp_cf implements Comparator<Automobile> {

        public int compare(Automobile a1, Automobile a2){
            return (a1.getCliente().compareTo((a2.getCliente())));
        }
    }
}
