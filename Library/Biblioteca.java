package Library;

import java.util.Objects;

public class Biblioteca implements Comparable<Biblioteca>{
  Libro libro;
  int scaffale;

  public Biblioteca(Libro libro, int scaffale) {
    this.libro = libro;
    this.scaffale = scaffale;
  }

  public Biblioteca(String scaffale) {
    this(null, Integer.parseInt(scaffale));
  }

  public Libro getLibro() {
    return libro;
  }

  public void setLibro(Libro libro) {
    this.libro = libro;
  }

  public int getScaffale() {
    return scaffale;
  }

  public void setScaffale(int scaffale) {
    this.scaffale = scaffale;
  }




  @Override
  public int compareTo(Biblioteca bib2) {
    if (this.getScaffale() != bib2.getScaffale()) {
      return (this.getScaffale() < bib2.getScaffale() ? -1 : 1);
    }
    return 0;
  }
}
