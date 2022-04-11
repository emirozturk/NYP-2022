import java.util.ArrayList;
import java.util.List;

public class PaketYoneticisi {
    public static List<Paket> PaketOlustur(int paketSayisi){
        var paketListesi = new ArrayList<Paket>();
        for(int i=0;i<paketSayisi;i++)
            paketListesi.add(new Paket());
        return paketListesi;
    }
    public static void EkranaYazdir(List<Paket> paketListesi){
        for(var paket:paketListesi)
            System.out.println(paket);
    }
}
