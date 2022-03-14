package com.emirozturk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
class Rastgele{
    Random random;
    public Rastgele(){
        random = new Random();
    }
    public List<Integer> intListesiAl(int elemanSayisi){
        List<Integer> liste = new ArrayList<>();
        for(int i=0;i<elemanSayisi;i++)
            liste.add(random.nextInt());
        return liste;
    }
    public List<Integer> intListesiAl(int elemanSayisi,int minimumDeger){
        List<Integer> liste = new ArrayList<>();
        for(int i=0;i<elemanSayisi;i++)
            liste.add(random.nextInt(minimumDeger,Integer.MAX_VALUE));
         return liste;
    }
    public List<Integer> intListesiAl(int elemanSayisi,int minimumDeger,int maksimumDeger){
        List<Integer> liste = new ArrayList<>();
        for(int i=0;i<elemanSayisi;i++)
            liste.add(random.nextInt(minimumDeger,maksimumDeger));
        return liste;
    }
}
public class Main {

    static void listele(List<Integer> liste){
        for(var eleman:liste)
            System.out.print(eleman+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        var r = new Rastgele();
        var sonuc = r.intListesiAl(10);
        listele(sonuc);
        sonuc = r.intListesiAl(10,0);
        listele(sonuc);
        sonuc = r.intListesiAl(10,50,100);
        listele(sonuc);
        var doubleSonuc = r.doubleListesiAl(10,0,100);
        listele(doubleSonuc);
    }
}
