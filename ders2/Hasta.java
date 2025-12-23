package ders2;

public class Hasta {
    String ad;
    int yaş;
    boolean randevuVarmı;
    Doktor doktor;

    public Hasta(String ad, int yaş) {
        this.ad = ad;
        this.yaş = yaş;
        randevuVarmı = false;
        doktor = null;

    }

    void bilgileriGöster() {
        System.out.println("hasta adı:" + ad + " Yaş: " + yaş + " Randevu var mı? : " + randevuVarmı);
        if (randevuVarmı == true) {
            System.out.println("Doktor : " + doktor.ad);
        }
    }

    void randevuAl(Doktor doktor) {

        if (randevuVarmı == false) {
            this.randevuVarmı = true;
            this.doktor = doktor;

        } else {
            System.out.println("Randevunuz var!!!");
        }
    }

    void randevuİptal() {
        this.randevuVarmı = false;
        this.doktor = null;

    }
}
