package Biblioteca;

import java.lang.reflect.Constructor;

public class Libro {
    private static int counter= 0;
    private String id;
    private String titolo;
    private String autore;
    private int numeroPagine;



    public Libro(String id, String titolo, String autore, int numeroPagine){
        counter++;
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;

    }

    public String getId() { return id; }
    public String getTitolo() { return titolo; }
    public String getAutore() { return autore; }
    public int getNumeroPagine() { return numeroPagine; }

    @Override
    public String toString() {
        return "Libro{" +
                "id='" + id + '\'' +
                ", titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
