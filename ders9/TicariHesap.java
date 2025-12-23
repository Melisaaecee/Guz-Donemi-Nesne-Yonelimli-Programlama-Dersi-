package ders9;

import java.time.LocalDate;

public class TicariHesap extends BankaHesap {

    public TicariHesap(String hesapNo, String hesapSahibi, double bakiye, LocalDate açılışTarihi) {
        super(hesapNo, hesapSahibi, bakiye, açılışTarihi);
    }

    @Override
    public void paraCek(double miktar){
        setBakiye(getBakiye() - miktar);
        System.out.println("Hesap türü: " + getClass().getSimpleName() + " -> " + " Para çekildi!" + " -> " + " Yeni bakiye: " + getBakiye() +  " Çekilen miktarın faiz oranı: " + faizHesapla(miktar));
    }

    @Override
    double faizHesapla(double miktar ) {
        return miktar * 0.5;
    }

    @Override
    String hesapTipi() {
        return "Ticari Hesap";
    }

}
