import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*ilk Uygulama için
        for(int i=0;i<10;i++){
            var olusturulacakNesneSayisi = new Random().nextInt(0,10);
            PaketYoneticisi py = new PaketYoneticisi();
            var nesneler = PaketYoneticisi.PaketOlustur(olusturulacakNesneSayisi);
            PaketYoneticisi.EkranaYazdir(nesneler);
            System.out.println(Paket.paketSayisi);
        }
        */
        /*
        LocalDateTime zaman = LocalDateTime.now();
        System.out.println(zaman);
        LocalDateTime tarihSaat = LocalDateTime.of(2022,04,11,16,9);
        System.out.println(tarihSaat);
        String tarihSaatStringi1 = "11.04.2022 13:52";
        String tarihSaatStringi2 = "2022/06/12 09:21";
        LocalDateTime tarihSaat1 = LocalDateTime.parse(tarihSaatStringi1,
                DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        System.out.println(tarihSaat1);
        LocalDateTime tarihSaat2 = LocalDateTime.parse(tarihSaatStringi2,
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        System.out.println(tarihSaat2);
        */
        Baglanti baglanti1 = new Baglanti("Veritabanı bağlantısı",Tur.Veritabani);
        Baglanti baglanti2 = new Baglanti("/Users/emirozturk/Desktop/",Tur.Dosya);
        FactoryBaglanti baglanti = FactoryBaglanti.DosyaBaglantisi("/Users/xyz.txt");
        var okunan =  baglanti.getOkunanlar();
        var veritabaniBaglantisi = FactoryBaglanti.VeritabaniBaglantisi("Connectionstring");
    }
}
