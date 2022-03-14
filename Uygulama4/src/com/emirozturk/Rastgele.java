package com.emirozturk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rastgele {
    Random random;

    public Rastgele() {
        random = new Random();
    }

    public List<Integer> listeAl(int elemanSayisi) {
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i < elemanSayisi; i++)
            liste.add(random.nextInt());
        return liste;
    }

    public List<Integer> listeAl(int elemanSayisi, int minimumDeger) {
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i < elemanSayisi; i++)
            liste.add(random.nextInt(minimumDeger, Integer.MAX_VALUE));
        return liste;
    }

    public List<Integer> listeAl(int elemanSayisi, int minimumDeger, int maksimumDeger) {
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i < elemanSayisi; i++)
            liste.add(random.nextInt(minimumDeger, maksimumDeger));
        return liste;
    }

    public List<Double> listeAl(int elemanSayisi, double minimumDeger, double maksimumDeger) {
        List<Double> liste = new ArrayList<>();
        for (int i = 0; i < elemanSayisi; i++)
            liste.add(random.nextDouble(minimumDeger, maksimumDeger));
        return liste;
    }
}
