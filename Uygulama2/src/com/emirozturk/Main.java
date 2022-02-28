package com.emirozturk;
//Sınıfları asla aynı dosyada yazmayın

class Kisi{
    private String ad;
    private String soyad;
    private byte yas;

    public void setAd(String ad){
        this.ad = ad;
    }
    public void setSoyad(String soyad){
        this.soyad = soyad;
    }
    public void setYas(byte yas){
        this.yas = yas;
    }
    public String getAd(){
        return ad;
    }
    public String getSoyad(){
        return soyad;
    }
    public byte getYas(){
        return yas;
    }
    public String toString(){
        return ad + " " + soyad + " " + yas;
    }
}

public class Main {

    public static void main(String[] args) {
        Kisi yeniKisi;
        yeniKisi = new Kisi();
        yeniKisi.setAd("Yunus Emre");
        yeniKisi.setSoyad("BATUR");
        yeniKisi.setYas((byte)20);
        System.out.println(yeniKisi);
    }
}
