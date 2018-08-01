package com.company;

// Zadanie 4
public class Czlowiek {
    private String imie;
    private String nazwisko;

    public Czlowiek(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

    }

    Zwierze zwierze;
    DaneAdresowe daneAdresowe;
// Zadanie 5
    public void introduce() {

        System.out.println("Cześć, nazywam się " + imie + " " + nazwisko);

    }

    public void introduce(String love) {
        System.out.println("Cześć, nazywam się " + imie + " " + nazwisko + ". " + love);

    }


}
