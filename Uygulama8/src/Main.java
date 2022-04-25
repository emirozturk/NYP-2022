public class Main {
    public static void main(String[] args) {
        Kare k = new Kare(5);
        k.sekilTuruYazdir();
        System.out.println(k.cevreHesapla());
        Dikdortgen d = new Dikdortgen(3,5);
        d.sekilTuruYazdir();
        System.out.println(d.cevreHesapla());
        Daire da = new Daire(7);
        da.sekilTuruYazdir();
        System.out.println(da.cevreHesapla());
    }
}