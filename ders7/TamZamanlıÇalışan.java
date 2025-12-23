package ders7;

public class TamZamanlıÇalışan extends Çalışan implements PrimAlabilir, TerfiAlabilir {

    double performansPuanı;
    int hizmetYılı;
    boolean terfi;
    public Object IKDepartmani;

    public TamZamanlıÇalışan(String ad, String kimlikNo, double temelMaaş, double performansPuanı, int hizmetYılı) {
        super(ad, kimlikNo, temelMaaş);
        this.performansPuanı = performansPuanı;
        this.hizmetYılı = hizmetYılı;
    }

    @Override
    public double maasHesapla() {
        return temelMaaş + primHesapla();
    }

    @Override
    public double primHesapla() {
        return hizmetYılı * (performansPuanı * 0.4);
    }

    @Override
    public void terfiEt() {
        if (performansPuanı > 75) {
            System.out.println(" Terfi edildi!!");
            terfi=true;
        } else {
            System.out.println("terfi edilemediniz :(");
            terfi=false;

        }
    }

    @Override
    public String terfiDurumuGetir() {
        if (terfi == false) {
            return "terfiEdilmemiş";
        } else {
            return "terfiEdilmiş";
        }
    }

    @Override
    public void bilgiGöster() {
        System.out.println("Ad: " + ad + " Kimlik no: " + kimlikNo + " Çalışan tipi: " + çalışanTipi() + " Maaş: "
                + maasHesapla());
    }

    @Override
    public String çalışanTipi() {
        return "TamZamanlıÇalışan";
    }

}
