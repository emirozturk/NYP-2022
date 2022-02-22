package com.emirozturk;

public class Uygulama2 {
    static double Hesapla(double n) {
        return n + n*n + n*n*n;
    }

    public static void main(String[] args) {
        System.out.println(Hesapla(10));
    }
}
