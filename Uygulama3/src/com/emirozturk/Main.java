package com.emirozturk;

public class Main {
    public static void main(String[] args) {
        var kuyruk = new Kuyruk(10);

        System.out.println("Eklenecek:"+kuyruk.ekle(5));
        System.out.println(kuyruk.listele());
        System.out.println("Eklenecek:"+kuyruk.ekle(2));
        System.out.println(kuyruk.listele());
        System.out.println("Çıkartılan Eleman"+kuyruk.sil());
        System.out.println(kuyruk.listele());
        System.out.println("Eklenecek:"+kuyruk.ekle(10));
        System.out.println(kuyruk.listele());
        System.out.println("Eklenecek:"+kuyruk.ekle(2));
        System.out.println(kuyruk.listele());
        System.out.println("Çıkartılan Eleman"+kuyruk.sil());
        System.out.println(kuyruk.listele());
        System.out.println("Eklenecek:"+kuyruk.ekle(4));
        System.out.println(kuyruk.listele());
        System.out.println("Eklenecek:"+kuyruk.ekle(2));
        System.out.println(kuyruk.listele());
    }
}
