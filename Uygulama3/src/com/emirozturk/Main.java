package com.emirozturk;

public class Main {
    public static void main(String[] args) {
        var kuyruk = new Kuyruk(10);
        var dizi = new int[]{5,2,10,2,4,2};
        int siradaki = 0;
        //True ekle, False sil
        var islemDizisi = new Boolean[]{true,true,false,true,true,false,true,true};
        for(var islem:islemDizisi){
            if(islem)
                System.out.println("Eklenecek:"+kuyruk.ekle(dizi[siradaki++]));
            else
                System.out.println("Çıkartılan Eleman:"+kuyruk.sil());
            System.out.println( kuyruk.listele());
        }
    }
}
