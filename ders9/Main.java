package ders9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VadeliHesap vd1 = new VadeliHesap("14852", "Ahmet Gür", 7842, LocalDate.now());
        VadesizHesap v1 = new VadesizHesap("36489", "Alin Sahici", 2456, LocalDate.of(2023, 05, 16));
        YatirimHesabi y1 = new YatirimHesabi("4127", "Yılmaz Asır", 18000, LocalDate.of(2022, 06, 20));
        TicariHesap t1 = new TicariHesap("57962", "Eylül Güven", 25000, LocalDate.now());
        YatırımHesap yt1 = new YatırımHesap();

        List<BankaHesap> liste = new ArrayList<>();
        liste.add(vd1);
        liste.add(t1);
        liste.add(v1);
        liste.add(y1);

        for (BankaHesap h : liste) {
            h.hesapÖzeti();
        }

        v1.paraCek(250);
        vd1.paraYatır(1400);
        t1.paraCek(1478);
        y1.yatırımYap(450);
        yt1.yatırımYap(250, v1);
        yt1.yatırımYap(1550, vd1);

        vd1.krediBaşvurusu(4305);
        v1.krediBaşvurusu(2410);

        y1.yatırımYap(1750);
        yt1.yatırımYap(532, vd1);
    }

}
