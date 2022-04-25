import java.util.*;

class Siralama{
    public static List<Integer> sirala(List<Integer> liste){
        for(int i=0;i<liste.size();i++)
            for(int j=0;j<liste.size();j++)
                if(liste.get(i)<liste.get(j)){
                    int temp = liste.get(i);
                    liste.set(i,liste.get(j));
                    liste.set(j,temp);
                }
        return liste;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(1,3,6,2,4,8,4));
        LinkedList<Integer> bagliListe = new LinkedList<>(Arrays.asList(1,3,6,2,4,8,4));
        var siraliListe = Siralama.sirala(liste);
        for(var eleman:siraliListe)
            System.out.println(eleman);
        var siraliBagliListe = Siralama.sirala(bagliListe);
        for(var eleman:siraliBagliListe)
            System.out.println(eleman);
    }
}