package ders5;

public class Dergi implements ÖdünçAlınabilir, Yazdırılabilir, Etiketli {
    String ad;
    int sayi;
    boolean oduncte;
    String kime;

    Dergi(String ad, int sayi, boolean oduncte) {
        this.ad = ad;
        this.sayi = sayi;
        this.oduncte = oduncte;
    }

    @Override
    public void oduncAl(String kime) {
        if (musaitMi() == false) {
            System.out.println("Dergi " + kime + " tarafından ödünç alındı");
            oduncte = true;
        } else {
            System.out.println("Dergi zaten ödünç alınmış bu yüzden " + kime + " kişisi ödünç alamaz");
        }

    }

    @Override
    public void iadeEt() {
        oduncte = false;
        System.out.println("Dergi iade edildi");
    }

    @Override
    public boolean musaitMi() {
        if (oduncte == true) {
            System.out.println("Dergi müsait değil!!");
            return true;
        } else {
            System.out.println("Dergi müsait!!");
            return false;
        }
    }

    @Override
    public String bilgi() {
        return this.ad;

    }

    @Override
    public void yazdır() {
        System.out.println("Bilgiler : " + bilgi() + " Sayi : " + sayi + " Ödünçte mi?: " + oduncte);
    }

    @Override
    public String etiket() {
        return "Dergi";
    }

}
