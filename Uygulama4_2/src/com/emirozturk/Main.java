package com.emirozturk;

import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        String dosyaYolu="C:/Users/emiro/Desktop/ogrenciler.txt";
        var ogrenciListesi = new OgrenciListesi(Path.of(dosyaYolu));
        while(true) {
            System.out.println(ogrenciListesi.listele());
            System.out.println("1. Ekle");
            System.out.println("2. Sil");
            System.out.println("3. Çıkış");
            var scanner = new Scanner(System.in);
            var secim = Integer.parseInt(scanner.next());
            if (secim == 1) {
                System.out.println("Tc:");
                var tcNo = scanner.nextLine();
                System.out.println("AdSoyad:");
                var adSoyad = scanner.nextLine();
                System.out.println("Adres:");
                var adres = scanner.nextLine();
                var yeniOgrenci = new Ogrenci(tcNo, adSoyad, adres);
                ogrenciListesi.ekle(yeniOgrenci);
            }
            if (secim == 2){
                System.out.println("Silinecek kaydın indisini giriniz:");
                var indis = scanner.nextInt();
                ogrenciListesi.sil(indis);
            }
            if (secim == 3) {
                ogrenciListesi.dosyayaKaydet();
                break;
            }
        }
    }
}
