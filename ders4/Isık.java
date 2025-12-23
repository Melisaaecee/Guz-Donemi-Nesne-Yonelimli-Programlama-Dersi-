package ders4;

public class Isık extends Cihaz {
    private int parlaklık;
    private static int MIN_PARLAKLIK = 0;
    private static int MAX_PARLAKLIK = 100;

    public Isık(String ad, boolean durum, double gucTuketimi, int parlaklık) {
        super(ad, durum, gucTuketimi);
        setParlaklık(parlaklık);

    }

    public void setParlaklık(int parlaklık) {
        if (parlaklık > MIN_PARLAKLIK && parlaklık < MAX_PARLAKLIK) {
            this.parlaklık = parlaklık;
        } else {
            System.out.println("bu değer kabul edilemiyor!!");
        }
    }
    public int getParlaklık(){
        return this.parlaklık;
    }

    @Override
    public void bilgileriGöster(){
        System.out.println("Ad: " + getAd() + " güç tüketimi: " + getGucTuketimi() + "Parlaklık: "  + getParlaklık() + " Durum: " + getDurum() );
    }


}
