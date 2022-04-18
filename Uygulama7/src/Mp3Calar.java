public class Mp3Calar implements MuzikCalarArayuzu{
    @Override
    public void oynat() {
        System.out.println("Hayalet sevgilim çalınıyor...");
    }

    @Override
    public void durdur() {
        System.out.println("Durduruldu.");
    }

    @Override
    public void degistir() {
        System.out.println("Gözlerinin yeşilini özledim...");
    }
}
