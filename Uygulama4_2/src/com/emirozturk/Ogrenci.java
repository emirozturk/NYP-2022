package com.emirozturk;


public class Ogrenci {
    private String tcNo;
    private String adSoyad;
    private String adres;
    public Ogrenci(String tcNo,String adSoyad,String adres){
        this.tcNo = tcNo;
        this.adSoyad = adSoyad;
        this.adres = adres;
    }
    @Override
    public String toString(){
        return tcNo + "-"+adSoyad+"-"+adres;
    }
}
