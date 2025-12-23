package ders7;

public class Stajer extends Çalışan{

    public Stajer(String ad,String kimlikNo,double temelMaaş){
        super(ad, kimlikNo, temelMaaş);
    }


    @Override
    public String çalışanTipi(){
        return "Stajyer";
    }

    @Override
    public void bilgiGöster(){
        System.out.println("Ad: " + ad + " Kimlik no: " + kimlikNo + "Çalışan tipi: " + çalışanTipi() + " Maaş: " + maasHesapla());
    }
    
}
