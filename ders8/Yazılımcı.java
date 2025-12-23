package ders8;

public class Yazılımcı extends Çalışan implements PrimAlabilir {
    String yazılımDili;

    public Yazılımcı(String ad, int yaş, Adres adres, String yazılımDili) {
        super(ad, yaş, adres);
        this.yazılımDili = yazılımDili;
    }

    public String getYazılımDili() {
        return yazılımDili;
    }

    public void setYazılımDili(String yazılımDili) {
        this.yazılımDili = yazılımDili;
    }

    @Override
    public double primHesapla() {
        return 500;
    }

}
