import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NakitOdeme implements Odeme {
    private String adSoyad;

    public NakitOdeme(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void ode(double miktar) throws IOException {
        Files.writeString(Path.of("/Users/emirozturk/Desktop/nakit.txt"), adSoyad + " " + miktar + " ödeme yaptı.");
    }
}
