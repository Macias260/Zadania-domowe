package com.company;

public class Ksiazka {
    private String tytul;
    private String autor;
    private String wydawnictwo;
    private int liczbaStron;



    public Ksiazka(String tytul, String autor, String wydawnictwo, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.liczbaStron = liczbaStron;
    }

    @Override
    public String toString() {
        return "Książka: " + tytul + " autor: " + autor + " wydawnictwo: " + wydawnictwo + " liczba stron: " +
                liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public int getLiczbaStron() {
        return liczbaStron;

    }


}

