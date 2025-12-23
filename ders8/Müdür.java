package ders8;

public class Müdür extends Çalışan implements TerfiAlabilir, PrimAlabilir {

    int ekipBüyüklüğü;
    boolean terfiyeUygun;

    public Müdür(String ad, int yas, Adres adres, int ekipBüyüklüğü) {
        super(ad, yas, adres);
        this.ekipBüyüklüğü = ekipBüyüklüğü;
    }

      public int getEkipBüyüklüğü() {
        return ekipBüyüklüğü;
    }

    public void setEkipBüyüklüğü(int ekipBüyüklüğü) {
        this.ekipBüyüklüğü = ekipBüyüklüğü;
    }

    @Override
    public double primHesapla() {
        return ekipBüyüklüğü * 1000;
    }

    @Override
    public void terfiEt() {

        if (ekipBüyüklüğü < 10) {
            terfiyeUygun = false;
        } else {
            terfiyeUygun = true;
            System.out.println("terfi edildiniz!!!");
        }

    }

}
