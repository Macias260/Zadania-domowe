package com.company;
// Zadanie 1
public class Pies extends Zwierze {

    public Pies(String imie, int wiek) {
        super(imie, wiek);
    }
//    Zadanie 2
    @Override
    public void hello() {
        System.out.println("Jestem Pies");
    }
//    Zadanie 3

    private RasyPsow rasa;

    public Pies(String imie, int wiek, RasyPsow rasa){
        super(imie, wiek);
        this.rasa = rasa;

    }


}
