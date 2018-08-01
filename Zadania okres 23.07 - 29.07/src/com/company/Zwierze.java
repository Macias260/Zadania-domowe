package com.company;

public class Zwierze {
    // Zadanie 1
    private String imie;
    private int wiek;

    public Zwierze(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;


    }

    @Override
    public String toString() {
        return "Zwierzę: " + getClass().getSimpleName() + " imię: " + imie + " wiek: " + wiek + " lat(a)";
    }

    // Zadanie 2
    public void hello() {
        System.out.println("Jestem Zwierzę");
    }
}

