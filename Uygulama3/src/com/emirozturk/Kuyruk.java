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

    int ekle(int eklenecek) {
        if(isaretci++ == elemanSayisi)
            return -1;
        kuyruk.add(eklenecek);
        return eklenecek;
    }

    int sil() {
        if(isaretci == 0)
            return -1;
        int deger = kuyruk.get(0);
        kuyruk.remove(0);
        isaretci--;
        return deger;
    }

    String listele() {
        String cikti = "";
        for (int i = 0; i < kuyruk.size(); i++)
            cikti += kuyruk.get(i) + "<-";
        return cikti;
    }
}
