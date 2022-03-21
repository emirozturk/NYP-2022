package com.emirozturk;

public class Dortgen {
    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public Dortgen(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int cevreHesapla() {
        return a + b + c + d;
    }
}
