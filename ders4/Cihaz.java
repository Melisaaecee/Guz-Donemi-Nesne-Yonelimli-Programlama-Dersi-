package ders4;

public class Cihaz {

    private String ad;
    private boolean durum;
    private double gucTuketimi;
    private static int cihazSayisi;

    public Cihaz(String ad, boolean durum, double gucTuketimi) {
        this.ad = ad;
        this.durum = durum;
        setGucTuketimi(gucTuketimi);
        cihazSayisi++;
    }

    public boolean getDurum() {
        return this.durum;
    }

    public String getAd() {
        return this.ad;
    }

    public double getGucTuketimi() {
        return this.gucTuketimi;
    }

    public void setGucTuketimi(double gucTuketimi) {
        if (gucTuketimi > 0) {
            this.gucTuketimi = gucTuketimi;
        } else {
            System.out.println("negatif değer olamaz!!");
        }
    }

    public static int getCihazSayisi() {
        return cihazSayisi;
    }

    public void ac() {
        this.durum = true;
    }

    public void kapa() {
        this.durum = false;
    }

    public final double temelEnerjiHarca(int saat) {
        return saat * gucTuketimi;
    }

    public double enerjiHarca(int saat) {
        return temelEnerjiHarca(saat);
    }

    public void bilgileriGöster() {
        System.out.println("ad: " + getAd() + " Durum: " + getDurum() + " Güç Tüketimi: " + getGucTuketimi()
                + " Cihaz sayısı: " + getCihazSayisi());
    }

    public static class EnerjiStatigi {

    public static void toplamEnerjiYazdır(double toplam){   
        System.out.println("Toplam cihaz sayısı: " + Cihaz.getCihazSayisi() + " Toplam enerji tüketimi: " + toplam);
    }

    }

}
