public class Daire extends Sekil {
    private int r;

    public Daire(int r) {
        this.r = r;
    }

    public int cevreHesapla() {
        return (int) (2 * Math.PI * r);
    }

    @Override
    public void merhabaYazdir() {
        System.out.println("Merhaba");
    }

    @Override
    void sekilTuruYazdir() {
        System.out.println("Daire");
    }
}
