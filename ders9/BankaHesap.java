package ders9;

import java.time.LocalDate;

public abstract class BankaHesap {
    private String hesapNo;
    private String hesapSahibi;
    private double bakiye;
    private LocalDate açılışTarihi;

    public BankaHesap(String hesapNo, String hesapSahibi, double bakiye, LocalDate açılışTarihi) {
        this.hesapNo = hesapNo;
        this.hesapSahibi = hesapSahibi;
        this.bakiye = bakiye;
        this.açılışTarihi = açılışTarihi;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getHesapSahibi() {
        return hesapSahibi;
    }

    public void setHesapSahibi(String hesapSahibi) {
        this.hesapSahibi = hesapSahibi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public LocalDate getAçılışTarihi() {
        return açılışTarihi;
    }

    public void setAçılışTarihi(LocalDate açılışTarihi) {
        this.açılışTarihi = açılışTarihi;
    }

    void paraYatır(double miktar) {
        setBakiye(getBakiye() + miktar);
        System.out.println("hesap türü:" + getClass().getSimpleName() + " -> " + "Para yatırıldı!" + " -> " + " Yeni bakiye: " + bakiye);
    }

    abstract void paraCek(double miktar);

    abstract double faizHesapla(double miktar);

    abstract String hesapTipi();

    void hesapÖzeti() {
        System.out.println("Hesap sahibi: " + hesapSahibi + " Hesap no: " + hesapNo + " Bakiye: " + bakiye
                + "Hesap Açılış Tarihi: " + açılışTarihi + " Hesap türü: " + hesapTipi());
    }

}
