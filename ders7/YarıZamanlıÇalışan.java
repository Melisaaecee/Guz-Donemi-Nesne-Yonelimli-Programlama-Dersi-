package ders7;

public class YarıZamanlıÇalışan extends Çalışan implements PrimAlabilir {
    double saatUcreti;
    int çalışmaSaati;

    public YarıZamanlıÇalışan(String ad, String kimlikNo, double temelMaaş, double saatUcreti, int çalışmaSaati) {
        super(ad, kimlikNo, temelMaaş);
        this.saatUcreti = saatUcreti;
        this.çalışmaSaati = çalışmaSaati;
    }

    @Override
    public double maasHesapla() {
        return çalışmaSaati * saatUcreti + primHesapla();
    }

    @Override
    public double primHesapla() {
        if (çalışmaSaati > 160) {
            return 500;
        } else {
            return 0;
        }
    }

    @Override
    public String çalışanTipi() {
        return "YarıZamanlıÇalışan";
    }

    @Override
    public void bilgiGöster(){
        System.out.println("Ad: " + ad + " Kimlik No: " + kimlikNo + " Çalışan tipi: " + çalışanTipi() + " Maas: " + maasHesapla());
    }
}
