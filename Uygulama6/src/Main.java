import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            var olusturulacakNesneSayisi = new Random().nextInt(0,10);
            PaketYoneticisi py = new PaketYoneticisi();
            var nesneler = PaketYoneticisi.PaketOlustur(olusturulacakNesneSayisi);
            PaketYoneticisi.EkranaYazdir(nesneler);
            System.out.println(Paket.paketSayisi);
        }
    }
}
