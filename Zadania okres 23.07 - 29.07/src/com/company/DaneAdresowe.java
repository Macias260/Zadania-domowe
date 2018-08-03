package com.company;
// Zadanie 4
public class DaneAdresowe {
    private String ulica;
    private String numerDomu;
    private String kodPocztowy;
    private String miasto;
    private int numerTelefonu;
    private String email;

    public DaneAdresowe(String ulica, String numerDomu, String kodPocztowy, String miasto, int numerTelefonu,
                        String email){


        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.numerTelefonu = numerTelefonu;
        this.email = email;
    }
}
