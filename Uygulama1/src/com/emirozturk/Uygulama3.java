package com.emirozturk;

import java.util.ArrayList;
import java.util.Scanner;

public class Uygulama3 {
    static double Hesapla(double n) {
        return n + n*n + n*n*n;
    }

    public static void main(String[] args) {
        //10 tane sayıyı ekrandan alıp bir listeye atan, daha sonra
        //bu listede 5'ten büyük değerler için Hesapla fonksiyonunu çağıran
        //ve bu fonskiyondan dönen değerleri bir listeye atıp bu listeyi ekrana gösteren uygulamayı yazınız.

        //Bir liste tanımlamam lazım
        var liste = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<10;i++) {//Birden ona kadar döngü kurarım
            System.out.println("Sayi:");
            var sayi = scanner.nextInt();//Ekrandan bir sayı alırım
            liste.add(sayi); //Listeye eklerim
        }
        var sonucListesi = new ArrayList<Integer>(); //yeni bir liste tanımlarım

        for(int i=0;i<liste.size();i++) {//listenin eleman sayısına kadar bir döngü kurarım
            if(liste.get(i)>5) {//Koşul olması lazım (5'ten küçük mü kontrolü)
                var sonuc = Hesapla(liste.get(i)); //listenin elemanını hesaplayıp yeni listeye ekle
                sonucListesi.add((int)sonuc);
            }
        }
        for(var degisken:sonucListesi){//yeni listenin eleman sayısına kadar döngü
            System.out.println(degisken);
        }
    }
}
