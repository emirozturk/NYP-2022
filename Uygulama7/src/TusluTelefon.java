public class TusluTelefon implements TelefonArayuzu{

    @Override
    public void ara() {
        System.out.println("Bağlanıyor... Arayacak...");
    }

    @Override
    public void kapat() {
        System.out.println("Kapandı.");
    }
}
