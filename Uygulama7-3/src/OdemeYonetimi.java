import java.io.IOException;

public class OdemeYonetimi {
    private Odeme odeme;

    public OdemeYonetimi(Odeme odeme) {
        this.odeme = odeme;
    }

    public void odemeYap(double miktar) throws IOException {
        odeme.ode(miktar);
    }
}
