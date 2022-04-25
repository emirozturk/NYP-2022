import java.util.*;
import java.util.stream.Collectors;
class Kisi{
    private String ad;
    private int yas;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Kisi(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }
}

public class Main {
    public static void main(String[] args) {
        /*
        Liste içerisindeki 50den büyük sayıların
        5. elemandan 10. elemana kadar olanlarını
        alan ve bu sayıların karelerini küçükten büyüğe
        sıralayıp bir string dizisi olarak döndüren metot
         */
        List<Integer> liste = new ArrayList<>(Arrays.asList(1,43,654,2,765,978,234,324,655,32456,32,4556,312,543,5645,543,51,52,53));
        var ellidenBuyukler = new ArrayList<Integer>();
        for(var eleman:liste)
            if(eleman>50)
                ellidenBuyukler.add(eleman);
        var besTane = new ArrayList<Integer>();
        for(int i=5;i<10;i++)
            besTane.add(ellidenBuyukler.get(i));
        var besTaneKare = new ArrayList<Integer>();
        for(var x:besTane)
            besTaneKare.add(x*x);
        for(int i=0;i<besTaneKare.size();i++)
            for(int j=0;j<besTaneKare.size();j++)
                if(besTaneKare.get(i)<besTaneKare.get(j)){
                    int temp = besTaneKare.get(i);
                    besTaneKare.set(i,besTaneKare.get(j));
                    besTaneKare.set(j,temp);
                }
        var sonucListesi = new ArrayList<String>();
        for(var eleman:besTaneKare)
            sonucListesi.add(eleman.toString());
        sonucListesi.forEach(System.out::println);
       /*
        Liste içerisindeki 50den büyük sayıların
        5. elemandan 10. elemana kadar olanlarını
        alan ve bu sayıların karelerini küçükten büyüğe
        sıralayıp bir string dizisi olarak döndüren metot
         */
        var sonucListesi2 = liste.stream()
                .filter(eleman->eleman>50)
                .skip(5)
                .limit(5)
                .map(x->x*x)
                .sorted()
                .map(Object::toString)
                .toList();
        sonucListesi2.forEach(System.out::println);

        var kisiListesi = new ArrayList<>(Arrays.asList(
                new Kisi("Emir Öztürk",255),
                new Kisi("Berat Yıldız",18),
                new Kisi("Yunus Emre",45),
                new Kisi("Şener Şentürk",25),
                new Kisi("Muhteşem Ahmet Sarı",30),
                new Kisi("Esat Canbek Tufan",26)
        ));

        Comparator<Kisi> yasKarsilastir = Comparator
                .comparing(Kisi::getYas);
        var sonuc =  kisiListesi.stream()
                //.filter(x->x.getYas()>30)
                .sorted(yasKarsilastir)
                .map(x->x.getAd().toUpperCase(Locale.ROOT))
                //.limit(4)
                .toList();
        sonuc.forEach(System.out::println);
    }
}