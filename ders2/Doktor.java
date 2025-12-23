package ders2;

public class Doktor {
 
    String ad;
    String uzmanlık;
    
       public Doktor(String ad, String uzmanlık) {
        this.ad = ad;
        this.uzmanlık = uzmanlık;
    }
    void bilgilerigöster(){
        System.out.println("doktor adı: " + ad + " uzmanlık: " + uzmanlık);
    }

}
