package ders9;

import java.time.LocalDate;

public class VadesizHesap extends BankaHesap implements Kredi {

    public VadesizHesap(String hesapNo, String hesapSahibi, double bakiye, LocalDate açılışTarihi) {
        super(hesapNo, hesapSahibi, bakiye, açılışTarihi);
    }

    @Override
    double faizHesapla(double miktar) {
        return 0;
    }

    @Override
    String hesapTipi() {
        return "Vadesiz Hesap";
    }

    @Override
    public void paraCek(double miktar) {
        setBakiye(getBakiye() - miktar);
        System.out.println("Hesap türü: " + getClass().getSimpleName() + " -> "+ "Para çekildi!" + " -> " + " Yeni bakiye: " + getBakiye() + " Çekilen miktarın faiz oranı: " + faizHesapla(miktar));
    }

    @Override
    public void krediBaşvurusu(double miktar) {

        if (miktar > krediLimiti()) {
            System.out.println("Kredi başvurunuz reddedildi!");
        } else {
            double newBakiye = getBakiye() + miktar;
            setBakiye(newBakiye);
            System.out.println( getHesapSahibi() + " Kredi başvurunuz onaylandı! " + "Yeni bakiye:" + getBakiye());
        }
    }

    @Override
    public double krediLimiti() {
        return 10000;
    }
}
