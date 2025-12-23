package ders5;

public interface ÖdünçAlınabilir {
    void oduncAl(String kime);

    void iadeEt();

    boolean musaitMi();

    static double gecikmeUcreti(int gecikenGun, double gunlukUcret){
        return gunlukUcret+gecikenGun*gunlukUcret;
    }

}
