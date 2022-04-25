public abstract class Dortgen extends Sekil {
    protected int k1, k2, k3, k4;

    void sekilTuruYazdir() {
        System.out.println("Dörtgen");
    }

    public int cevreHesapla() {
        return k1 + k2 + k3 + k4;
    }

    @Override
    public void merhabaYazdir() {
        System.out.println("Merhaba");
    }
}
