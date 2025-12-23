package ders7;

public class Yönetici extends TamZamanlıÇalışan {
    String departman;
    int ekipboyutu;

    public Yönetici(String ad, String kimlikNo, double temelMaaş, double performansPuanı, int hizmetYılı,String departman, int ekipboyutu) {
        super(ad, kimlikNo, temelMaaş, performansPuanı, hizmetYılı);
        this.departman = departman;
        this.ekipboyutu = ekipboyutu;
    }

    @Override
    public double maasHesapla(){
        return temelMaaş + primHesapla() + yönetimPrimi();
    }

    double yönetimPrimi(){
        if(ekipboyutu>20){
            return temelMaaş/ekipboyutu;
        }
        else{
            return ekipboyutu*2;
        }
    }

    @Override
    public void bilgiGöster(){
         System.out.println("Ad: " + ad + " Kimlik no: " + kimlikNo + " Maaş: " + maasHesapla() + " Departman: " + departman);
    }

}
