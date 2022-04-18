public class Smartphone implements TelefonArayuzu,MuzikCalarArayuzu{
    @Override
    public void oynat() {
        System.out.println("Martılar çalınıyor...");
    }

    @Override
    public void durdur() {
        System.out.println("Durduruldu.");
    }

    @Override
    public void degistir() {
        System.out.println("Uzunlar şarkısına geçildi.");
    }

    @Override
    public void ara() {
        System.out.println("Arandı...");
    }

    @Override
    public void kapat() {
        System.out.println("Kapandı.");
    }
}
