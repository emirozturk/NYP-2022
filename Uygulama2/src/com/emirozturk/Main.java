package com.emirozturk;
//Sınıfları asla aynı dosyada yazmayın

class Kisi{
    String ad;
    String soyad;
    byte yas;
}

public class Main {

    public static void main(String[] args) {
        Kisi yeniKisi;
        yeniKisi = new Kisi();
        yeniKisi.ad = "Yunus Emre";
        yeniKisi.soyad = "BATUR";
        yeniKisi.yas = 20;
        System.out.println(yeniKisi);
    }
}
