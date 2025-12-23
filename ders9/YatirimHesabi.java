package ders9;

import java.time.LocalDate;

public class YatirimHesabi extends BankaHesap implements Yatırım {
    double yatırım = 0;

    public YatirimHesabi(String hesapNo, String hesapSahibi, double bakiye, LocalDate açılışTarihi) {
        super(hesapNo, hesapSahibi, bakiye, açılışTarihi);
    }


    @Override
    double faizHesapla(double miktar) {
        return miktar * 0.1;
    }

    @Override
    String hesapTipi() {
        return "Yatırım Hesabı";
    }

    @Override
    public void yatırımYap(double miktar) {
        if (getBakiye() > 5000) {
            setBakiye(getBakiye() - miktar);
            yatırım += miktar;
            System.out.println(getHesapSahibi() + " Yatırım yapıldı!");
            yatırımGetirisi();
            System.out.println("Güncel bakiye: " + getBakiye());
        } else {
            System.out.println("Yatırım yapılamadı,bakiye yetersiz!!");
        }
    }

    @Override
    public void paraCek(double miktar){
        setBakiye(getBakiye() - miktar);
        System.out.println("Hesap türü: " + getClass().getSimpleName()+ " -> " + "Para çekildi!" + " -> " + " Yeni bakiye: " + getBakiye() + " Çekilen miktarın faiz oranı: " + faizHesapla(miktar));
    }


    @Override
    public void yatırımGetirisi() {
       System.out.println("Yapılan yatırım: " + yatırım);
    }
}
