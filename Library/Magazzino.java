package Library;

import java.util.ArrayList;
import java.util.*;

public class Magazzino {

    List<Biblioteca> magazzino = new ArrayList<Biblioteca>();


    public void insert(int scaffale, Libro libro) {
        insert(new Biblioteca(libro, scaffale));
    }

    private void insert(Biblioteca biblioteca) {
        for (Biblioteca bib : magazzino) {
            if (bib.equals(biblioteca)) {
                bib.setLibro(bib.getLibro());
                return;
            }

        }
    }

    public void remove(String scaffale) {
        magazzino.remove(new Biblioteca(scaffale));
    }

    private Magazzino new_magazzino(int IBS) {
        Magazzino nuovo = new Magazzino();
        for (Biblioteca b : magazzino)
            if ((b.getLibro().getIBS() == IBS))
                nuovo.insert(b);
        return nuovo;
    }

}
