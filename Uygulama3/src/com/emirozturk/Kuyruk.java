package com.emirozturk;

import java.util.*;


public class Kuyruk {
    private int elemanSayisi = 0;
    private int isaretci = 0;
    private List<Integer> kuyruk;

    public Kuyruk(int elemanSayisi) {
        this.elemanSayisi = elemanSayisi;
        kuyruk = new ArrayList<>();
    }

    public int ekle(int eklenecek) {
        if(isaretci++ == elemanSayisi)
            return -1;
        kuyruk.add(eklenecek);
        return eklenecek;
    }

    public int sil() {
        if(isaretci == 0)
            return -1;
        int deger = kuyruk.get(0);
        kuyruk.remove(0);
        isaretci--;
        return deger;
    }

    public String listele() {
        var builder = new StringBuilder();
        for (var eleman:kuyruk){
            builder.append(eleman);
            builder.append("<-");
        }
        return builder.toString();
    }
}
