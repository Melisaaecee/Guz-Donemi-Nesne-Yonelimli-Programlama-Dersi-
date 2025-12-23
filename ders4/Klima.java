package ders4;

public class Klima extends Cihaz {
    private int sıcaklık;
    private String mod;

    public Klima(String ad, boolean durum, double gucTuketimi, int sıcaklık, String mod) {
        super(ad, durum, gucTuketimi);
        setSıcaklık(sıcaklık);
        this.mod = mod;

    }

    public void setSıcaklık(int sıcaklık) {
        if (sıcaklık > 16 && sıcaklık < 30) {
            this.sıcaklık = sıcaklık;
        } else {
            System.out.println("Bu değer kabul edilemez!!");
        }
    }

    public int getSıcaklık() {
        return this.sıcaklık;
    }

    public String getMod() {
        return this.mod;
    }

    @Override
    public double enerjiHarca(int saat) {
        if(getMod().equals("ısıtma")){
             return temelEnerjiHarca(saat) + (temelEnerjiHarca(saat) * 0.2);
        }
        else{
            return temelEnerjiHarca(saat);
        }
       
    }

    @Override
    public void bilgileriGöster() {
        System.out.println("Ad: " + getAd() + " Durum: " + getDurum() + " Sıcaklık: " + getSıcaklık() + " Güç tüketimi: " + getGucTuketimi() + " Mod: " + getMod());
    }

}
