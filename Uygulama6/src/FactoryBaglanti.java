public class FactoryBaglanti {
    private String okunanlar;
    private FactoryBaglanti(){

    }
    public static FactoryBaglanti DosyaBaglantisi(String dosyaYolu){
        //Dosya yolu ile ilgili işlemleri yap
        //Yapıcıya gerekli parametreleri ata
        return new FactoryBaglanti();
    }
    public static FactoryBaglanti VeritabaniBaglantisi(String baglantiStringi){
        ///Veritabanına bağlan
        //Gerekli okuma ve yapıcı işlemlerini gerçekleştirme
        return new FactoryBaglanti();
    }
    public String getOkunanlar() {
        return okunanlar;
    }
}
