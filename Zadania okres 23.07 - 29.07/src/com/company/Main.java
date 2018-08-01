package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // Klasy i dziedziczenie
//        Zadanie 1

        Pies pies = new Pies("Beton", 2);
        Kot kot = new Kot("Pszypał", 1);

        System.out.println(pies);
        System.out.println(kot);
//        Odziela zadania od siebie
        System.out.println("================");
//        Zadanie 2

        pies.hello();
        kot.hello();
        System.out.println("================");
//        Zadanie 3
//          Brak wykorzystania klasy Main

//        Zadanie 4

        Czlowiek czlowiek1 = new Czlowiek("Władimir", "Putin");
        Czlowiek czlowiek2 = new Czlowiek("Donald", "Trump");

        czlowiek1.zwierze = pies;
        czlowiek2.zwierze = kot;
//         Zadanie 5
        czlowiek1.introduce();
        czlowiek2.introduce("Kocham zwierzęta");
        System.out.println("================");
//        Zadanie 6
        List<String> menu = new ArrayList<>();
        menu.add("pizza");
        menu.add("kebab");
        menu.add("lasagne");
        menu.add("burger");
        menu.add("kapsalon");
        menu.add("burito");
        menu.add("chińszczyzna");
        menu.add("zapiekanka");
        menu.add("hot dog");
        menu.add("schabowy");

        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }
//        Odziela wyprintowane dane w obrębie jednego zadania
        System.out.println("-----------------------");

        for (String dania : menu) {

            System.out.println(dania);
        }
        System.out.println("================");
//        Zadanie 7
        List<Integer> wielokrotnosc2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22,
                24, 26, 28, 30));

        for (int liczby : wielokrotnosc2) {
            System.out.println(liczby);
        }
        System.out.println("---------------------");

        System.out.println(wielokrotnosc2.size());

        wielokrotnosc2.remove(0);
        wielokrotnosc2.remove(wielokrotnosc2.size() - 1);
        System.out.println("---------------------");
        System.out.println(wielokrotnosc2.size());

        System.out.println("================");
//        Zadanie 8
        Ksiazka ksiazka1 = new Ksiazka("Ala", "Jan", "THC", 125);
        Ksiazka ksiazka2 = new Ksiazka("Ma", "Stach", "THC", 452);
        Ksiazka ksiazka3 = new Ksiazka("Kota", "Wiesia", "THC", 78);
        Ksiazka ksiazka4 = new Ksiazka("A", "Genowefa", "THC", 91);
        Ksiazka ksiazka5 = new Ksiazka("Kot", "Bonifacy", "THC", 1);
        Ksiazka ksiazka6 = new Ksiazka("Je", "Zbych", "THC", 451);
        Ksiazka ksiazka7 = new Ksiazka("Kebaba", "Ola", "THC", 78);
        Ksiazka ksiazka8 = new Ksiazka("Zrobionego", "Ala", "THC", 281);
        Ksiazka ksiazka9 = new Ksiazka("Z", "Janusz", "THC", 111);
        Ksiazka ksiazka10 = new Ksiazka("Mięsa", "Kasia", "THC", 65);
        Ksiazka ksiazka11 = new Ksiazka("Psa", "Adam", "THC", 6541);

        List<Ksiazka> ksiazki = new ArrayList<>(Arrays.asList(ksiazka1, ksiazka2, ksiazka3, ksiazka4, ksiazka5,
                ksiazka6, ksiazka7, ksiazka8, ksiazka9, ksiazka10, ksiazka11));


        for (Ksiazka ksiazka : ksiazki) {
            System.out.println(ksiazka);

        }

        System.out.println("---------------------");

        ksiazki.remove(ksiazki.size() / 2);

        for (Ksiazka ksiazka : ksiazki) {
            System.out.println(ksiazka);

        }
        System.out.println("---------------------");
        System.out.println(ksiazki.size());
        System.out.println("---------------------");

        System.out.println("Lista książek mających ponad 200 stron");


        for (Ksiazka ksiazka : ksiazki) {
            if (ksiazka.getLiczbaStron() > 200) {
                System.out.println(ksiazka);
            }
        }
        System.out.println("================");
//        Zadanie 9
        List<Ksiazka> ksiazkaList = new ArrayList<>();

        Ksiazka ksiazka01 = new Ksiazka("Czy", "Leszek", "THC", 546);
        Ksiazka ksiazka02 = new Ksiazka("Umie", "Mieszko", "THC", 45);
        Ksiazka ksiazka03 = new Ksiazka("Pan", "Ula", "THC", 122);
        Ksiazka ksiazka04 = new Ksiazka("Programowanie", "Marysia", "THC", 201);

        ksiazkaList.add(ksiazka01);
        ksiazkaList.add(ksiazka02);
        ksiazkaList.add(ksiazka03);
        ksiazkaList.add(ksiazka04);

        ksiazki.addAll(ksiazkaList);

        System.out.println(ksiazki.size());

        System.out.println("---------------------");

        for (Ksiazka ksiazka : ksiazki) {
            System.out.println(ksiazka);
        }




    }


}

