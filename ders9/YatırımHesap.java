package ders9;


public class YatırımHesap {
      double yatırım = 0;
      public YatırımHesap(){

      }

    String hesapTipi() {
        return "Yatırım Hesabı";
    } 

    public void yatırımYap(double miktar,BankaHesap hesap) {
        if (hesap.getBakiye()> 5000) {
            hesap.setBakiye(hesap.getBakiye()-miktar);
            yatırım+= miktar;
            System.out.println( "Hesap türü: " + hesapTipi() + " ->" + hesap.getHesapSahibi() + " Yatırım yapıldı!" + " Yatırım : " + yatırım +" Güncel bakiye: " + hesap.getBakiye());
        } else {
            System.out.println("Yatırım yapılamadı,bakiye yetersiz!!");
        }
    }


    
}
