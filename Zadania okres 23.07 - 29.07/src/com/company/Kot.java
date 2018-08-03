package com.company;
// Zadanie 1
public class Kot extends Zwierze {

    public Kot(String imie, int wiek) {
        super(imie, wiek);
    }
// Zadanie 2
    @Override
    public void hello(){
        System.out.println("Jestem Kot");
    }
//    Zadanie 3
     private RasyKotow rasa;
    public Kot(String imie, int wiek, RasyKotow rasa){
        super(imie, wiek);
        this.rasa = rasa;

    }
}
