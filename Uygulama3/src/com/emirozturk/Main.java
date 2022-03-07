package com.emirozturk;
class Kuyruk{
     private int elemanSayisi = 0;
     private int isaretci = 0;
     private int[] kuyruk;

    public Kuyruk(int elemanSayisi){
        this.elemanSayisi = elemanSayisi;
        kuyruk = new int[elemanSayisi];
    }

    int ekle(int eklenecek){
        kuyruk[isaretci]=eklenecek;
        isaretci++;
        return eklenecek;
    }
    int sil(){
        int deger = kuyruk[0];
        for(int i=1;i<isaretci;i++)
            kuyruk[i-1]=kuyruk[i];
        isaretci--;
        return deger;
    }
    String listele(){
        String cikti = "";
        for(int i=0;i<isaretci;i++)
            cikti += kuyruk[i]+"<-";
        return cikti;
    }
}

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
