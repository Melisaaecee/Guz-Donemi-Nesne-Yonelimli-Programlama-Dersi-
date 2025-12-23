package ders8;

public class Çalışan {

    private String ad;
    private int yaş;
    private Adres adres;
    private static int çalışanSayısı = 0;

    public Çalışan(String ad, int yaş, Adres adres) {
        setAd(ad);
        setYaş(yaş);
        setAdres(adres);
        çalışanSayısı++;
    }

    public String getAd() {
        return this.ad;
    }

    public int getYaş() {
        return this.yaş;
    }

    public Adres getAdres() {
        return this.adres;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setYaş(int yaş) {
        if (yaş < 0) {
            System.out.println("Yaş 0'dan küçük olamaz!!!");
        } else {
            this.yaş = yaş;
        }
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public static int getÇalışansayısı() {
        return çalışanSayısı;
    }
}
