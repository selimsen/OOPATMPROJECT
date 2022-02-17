package com.company;

public class Main {

    public static void main (String [] args){

        ATM atm = new ATM () ;

        Hesap hesap = new Hesap ("Selim Şen","123456",2000.0);
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");
    }


}

