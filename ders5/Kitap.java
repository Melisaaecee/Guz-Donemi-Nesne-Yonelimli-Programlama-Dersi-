package ders5;

public class Kitap implements ÖdünçAlınabilir, Yazdırılabilir, Etiketli {
    String ad, yazar;
    boolean oduncte;
    String kime;

    Kitap(String ad, String yazar, boolean oduncte) {
        this.ad = ad;
        this.yazar = yazar;
        this.oduncte = oduncte;

    }

    @Override
    public void oduncAl(String kime) {

        if (musaitMi() == false) {
            System.out.println("Kitap " + kime + " tarafından ödünç alındı");
            oduncte = true;
        } else {
            System.out.println("Kitap zaten ödünç alınmış bu yüzden " + kime + " kişisi ödünç alamaz");
        }

    }

    @Override
    public void iadeEt() {
        oduncte = false;
        System.out.println("Kitap iade edildi");
    }

    @Override
    public boolean musaitMi() {
        if (oduncte == true) {
            System.out.println("Kitap müsait değil!!");
            return true;
        } else {
            System.out.println("Kitap müsait!!");
            return false;
        }
    }

    @Override
    public String bilgi() {
        return this.ad + this.yazar;
    }

    @Override
    public void yazdır() {
        System.out.println("Bilgiler: " + bilgi() + " Ödünçte mi? : " + oduncte);

    }

    @Override
    public String etiket() {
        return "kitap";
    }

}
