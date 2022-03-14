package com.emirozturk;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OgrenciListesi {
    private Path dosyaYolu;
    private List<Ogrenci> ogrenciler;
    private Ogrenci parseEt(String satir){
        var parcalar = satir.split("-");
        return new Ogrenci(parcalar[0],parcalar[1],parcalar[2]);
    }
    public OgrenciListesi(Path dosyaYolu) {
        this.dosyaYolu = dosyaYolu;
        ogrenciler = new ArrayList<>();
        try{
            if(Files.exists(dosyaYolu)){
                var satirlar = Files.readAllLines(dosyaYolu);
                for(var satir:satirlar){
                    Ogrenci o = parseEt(satir);
                    ogrenciler.add(o);
                }
            }
            else
                Files.createFile(dosyaYolu);
        }
        catch(IOException exception){
            System.out.println(exception.getMessage());
        }

    }
    public void ekle(Ogrenci ogrenci){
        ogrenciler.add(ogrenci);
    }
    public void sil(int index){
        ogrenciler.remove(index);
    }
    public void dosyayaKaydet(){
        List<String> output = new ArrayList<>();
        for(var ogrenci:ogrenciler)
            output.add(ogrenci.toString());
        try {
            Files.write(dosyaYolu,output);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public String listele(){
        StringBuilder output= new StringBuilder();
        int i=0;
        for(var ogrenci:ogrenciler)
            output.append(i++).append(" ").append(ogrenci.toString()).append("\n");
        return output.toString();
    }
}
