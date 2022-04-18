import java.io.IOException;

public class OdemeYonetimi {
    private Odeme kartlaOdeme;

    public OdemeYonetimi(String adSoyad, String kartNo) {
        kartlaOdeme = new KartlaOdeme(adSoyad, kartNo);
    }

    public void odemeYap(double miktar) throws IOException {
        kartlaOdeme.ode(miktar);
    }
}
