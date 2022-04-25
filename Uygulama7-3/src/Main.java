import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Odeme kartlaOdeme = new KartlaOdeme("Emir Öztürk","8312 4192 8432 2354");
        Odeme nakitOdeme = new NakitOdeme("Emir Öztürk");
        OdemeYonetimi odemeYonetimi = new OdemeYonetimi(kartlaOdeme);
        OdemeYonetimi odemeYonetimi2 = new OdemeYonetimi(nakitOdeme);

        odemeYonetimi.odemeYap(1039.39);
        odemeYonetimi2.odemeYap(1039.39);
    }
}