public class Main {
    public static void main(String[] args) {
        TusluTelefon tusluTelefon = new TusluTelefon();
        tusluTelefon.ara();
        tusluTelefon.kapat();
        Mp3Calar mp3Calar = new Mp3Calar();
        mp3Calar.oynat();
        mp3Calar.degistir();
        mp3Calar.durdur();
        var smartphone = new Smartphone();
        smartphone.ara();
        smartphone.oynat();
    }
}