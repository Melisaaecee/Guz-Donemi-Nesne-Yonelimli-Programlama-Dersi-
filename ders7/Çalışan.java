package ders7;

public class Çalışan {
    String ad;
    String kimlikNo;
    double temelMaaş;


    public Çalışan(String ad,String kimlikNo,double temelMaaş){
        this.ad=ad;
        this.kimlikNo=kimlikNo;
        this.temelMaaş=temelMaaş;
    }


    double maasHesapla(){
        return temelMaaş;
    }

    String çalışanTipi(){
        return "Çalışan";
    }

    void bilgiGöster(){
        System.out.println(" Ad: " + ad + " Kimlik no: " + kimlikNo + " Temel maaş: " + temelMaaş);
    }

}
