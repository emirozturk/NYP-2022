package com.emirozturk;

import java.util.ArrayList;
import java.util.List;

class A{
    @Override
    public String toString() {
        return "Merhaba";
    }
}

public class Main {
    static <T> void listele(List<T> liste){
        for(var eleman:liste)
            System.out.print(eleman+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println();
        var r = new Rastgele();
        var sonuc = r.listeAl(10);
        listele(sonuc);
        sonuc = r.listeAl(10,0);
        listele(sonuc);
        sonuc = r.listeAl(10,50,100);
        listele(sonuc);
        var doubleSonuc = r.listeAl(10,0.0,100.0);
        listele(doubleSonuc);
        var aListesi = new ArrayList<A>();
        aListesi.add(new A());
        aListesi.add(new A());
        aListesi.add(new A());
        listele(aListesi);
    }
}
