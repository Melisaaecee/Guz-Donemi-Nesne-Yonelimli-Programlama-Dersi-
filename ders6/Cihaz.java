package ders6;

public class Cihaz {
    String marka, model;
    double fiyat;
    boolean açıkMı;

    Cihaz(String marka, String model, double fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
        açıkMı = false;
    }


    void aç() {
        System.out.println("Cihaz açıldı!!");
        açıkMı = true;
    }
     void kapa(){
        System.out.println("Cihaz kapatıldı!!");
        açıkMı = false;
     }

     void bilgiGöster(){
        System.out.println("Marka: " + marka + " Model: " + model + " Fiyat: " + fiyat);
     }

}
