import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class KartlaOdeme implements Odeme {
    private String adSoyad;
    private String kartNo;

    public KartlaOdeme(String adSoyad, String kartNo) {
        this.adSoyad = adSoyad;
        this.kartNo = kartNo;
    }

    public void ode(double miktar) throws IOException {
        Files.writeString(Path.of("/Users/emirozturk/Desktop/kart.txt"), adSoyad + " " + kartNo + "Kartıyla " + miktar + " ödeme yaptı.\n");
    }
}
