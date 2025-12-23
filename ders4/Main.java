package ders4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      
        Isık ısık1 = new Isık("lamba", true, 500, 82);
        Klima k1 = new Klima("samsung", false, 1463, 26, "sogutma");
        Tv t1 = new Tv("arcelik", true, 700, "kanal1", 45);
        
        ArrayList<Cihaz> cihaz = new ArrayList<>();
        cihaz.add(ısık1);
        cihaz.add(t1);
        cihaz.add(k1);

        t1.kanalDeğiştir("kanal2");

        double enerjiToplam = 0;

        for (Cihaz c : cihaz) {
            c.bilgileriGöster();
            double enerji = c.enerjiHarca(5);
            System.out.println("Harcanan enerji: " + enerji);
            enerjiToplam += enerji;
        }

        Cihaz.EnerjiStatigi.toplamEnerjiYazdır(enerjiToplam);
    }
}
