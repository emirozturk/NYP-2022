package com.emirozturk;

public class Main {

    public static void main(String[] args) {
        var dikdortgen = new Dikdortgen(5,10);
        System.out.println(dikdortgen.cevreHesapla());
        var kare = new Kare(3984);
        System.out.println(kare.cevreHesapla());
    }
}
