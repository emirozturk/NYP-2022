public class Paket {
    static int paketSayisi;
    private int paketNo;
    Paket(){
        paketNo = paketSayisi;
        paketSayisi++;
    }
    public int getPaketNo() { return paketNo;}
    @Override
    public String toString(){
        return "Paket No: "+paketNo;
    }
}
