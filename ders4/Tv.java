package ders4;

public class Tv extends Cihaz {

    private String kanal;
    private int sesSeviyesi;
    private static final int MIN_SES = 0;
    private static final int MAX_SES = 100;

    public Tv(String ad, boolean durum, double gucTuketimi, String kanal, int sesSeviyesi) {
        super(ad, durum, gucTuketimi);
        setSesSeviyesi(sesSeviyesi);
        this.kanal = kanal;
    }

    public void setSesSeviyesi(int sesSeviyesi) {
        if (sesSeviyesi < MAX_SES && sesSeviyesi > MIN_SES) {
            this.sesSeviyesi = sesSeviyesi;
        } else {
            System.out.println("bu değer kabul edilemez!!");
        }
    }

    public int getSesSeviyesi() {
        return this.sesSeviyesi;
    }

    public String getKanal() {
        return this.kanal;
    }

    public void kanalDeğiştir(String yeniKanal){
        this.kanal=yeniKanal;
    }

    @Override
    public double enerjiHarca(int saat){
        if(sesSeviyesi>70){
            return temelEnerjiHarca(saat) + (temelEnerjiHarca(saat) * 0.1);
        }
        else{
            return temelEnerjiHarca(saat);
        }
    }

    @Override
    public void bilgileriGöster(){
        System.out.println("Ad: " + getAd() + " Durum: " + getDurum() + " Güç tekitimi: " + getGucTuketimi() + " Kanal: " + getKanal() + " Ses seviyesi: " + getSesSeviyesi());
    }


    }


