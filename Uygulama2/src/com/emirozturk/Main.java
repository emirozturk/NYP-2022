package com.emirozturk;
//Sınıfları asla aynı dosyada yazmayın

public class Main {

    public static void main(String[] args) {
        var yeniKisi = new Kisi("Yunus Emre","BATUR",(short)2002);
        System.out.println(yeniKisi);
        var ikinciKisi =new Kisi("Emir","Öztürk",(short)1902,"Edirne");
        System.out.println(ikinciKisi);
        System.out.println(ikinciKisi.yasHesapla());
    }
}
