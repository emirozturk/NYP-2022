package com.emirozturk;

import java.time.LocalDate;

public class Kisi {
    private String ad;
    private String soyad;
    private short dogumYili;
    private String adres;

    public Kisi(String ad, String soyad, short dogumYili) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumYili = dogumYili;
        adres = "Girilmedi";
    }
    public Kisi(String ad,String soyad,short dogumYili,String adres){
        this.ad = ad;
        this.soyad = soyad;
        this.dogumYili = dogumYili;
        this.adres = adres;
    }

    public byte yasHesapla(){
        return (byte)(LocalDate.now().getYear() - dogumYili);
    }

    public String toString() {
        if(adres.equals("Girilmedi"))
            return ad + " " + soyad + " " + yasHesapla();
        else
            return ad + " " + soyad + " " + yasHesapla() + " " + adres;
    }
}
