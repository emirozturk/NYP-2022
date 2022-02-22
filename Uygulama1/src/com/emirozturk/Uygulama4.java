package com.emirozturk;

public class Uygulama4 {
    public static void main(String[] args) {
        //Bir listede 10'dan büyük elemanların sayısını döndüren uygulama

        int sayac = 0;//sayac tanımı yapmam lazım
        var liste = new ArrayList<>(Arrays.asList(1,2,3,324,546,457,456,8678679,23,4,234,4,5,6,7,8,9,10)); //Bir liste tanımlamam lazım
        //Liste'nin değerler ile nasıl başlatıldığını bilmem lazım
        for(int i=0;i<liste.size();i++)//Döngü kur listenin eleman sayısına kadar
            if(liste.get(i)>10)//Sayının 10'dan büyüklüğünün kontrolü var
                sayac++;//sayacı arttırıyorum

        System.out.println("10'dan büyük eleman sayısı:"+sayac);//Sayacı ekrana gösteriyorum

    }
}
