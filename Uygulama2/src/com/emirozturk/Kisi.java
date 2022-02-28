package com.emirozturk;

public class Kisi {
    private String ad;
    private String soyad;
    private byte yas;
    private String adres;

    public Kisi(String ad, String soyad, byte yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        adres = "Girilmedi";
    }
    public Kisi(String ad,String soyad,byte yas,String adres){
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.adres = adres;
    }

    public byte getYas(){return yas;}

    public String toString() {
        if(adres.equals("Girilmedi"))
            return ad + " " + soyad + " " + yas;
        else
            return ad + " " + soyad + " " + yas + " " + adres;
    }
}
