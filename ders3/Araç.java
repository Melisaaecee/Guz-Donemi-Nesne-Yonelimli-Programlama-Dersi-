package ders3;

import java.util.Scanner;

public class Araç {

    private String marka;
    private String model;
    private int yıl;
    private double motorHacmi;
    private String yakıtTürü;
    private int kilometre;
    private boolean ikinciel;
    private double fiyat;
  
    

   

    public Araç(String marka, String model, int yıl, double motorHacmi, String yakıtTürü, int kilometre,
            boolean ikinciel, double fiyat) {
        this.marka = marka;
        this.model = model;
        setYıl(yıl);
        setMotorHacmi(motorHacmi);
        setYakıtTürü(yakıtTürü);
        setKilometre(kilometre);
        this.ikinciel=ikinciel;
        setFiyat(fiyat);
    }

    public Araç() {
        System.out.println("yeni bir araç nesnesi oluşturuldu!!");
    }

     public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }
     public void setIkinciel(boolean ikinciel) {
        this.ikinciel = ikinciel;
    }

    public void setYıl(int yıl) {
        if (yıl > 1886 && yıl < 2025) {
            this.yıl = yıl;
        } else {
            System.out.println("geçerli bir yıl giriniz!!");
        }
    }

    public void setMotorHacmi(double motorHacmi) {
        if (motorHacmi > 0) {
            this.motorHacmi = motorHacmi;
        } else {
            System.out.println("geçerli bir motor hacmi giriniz!!");
        }

    }

    public void setYakıtTürü(String yakıtTürü) {
        if (yakıtTürü.equals("Benzin") ||yakıtTürü.equals("Hibrit") || yakıtTürü.equals("Dizel")||yakıtTürü.equals("Elektrik")){
            this.yakıtTürü= yakıtTürü;
        } else {
            System.out.println("bu yakıt türü geçerli değildir!!");
        }

    }

    public void setKilometre(int kilometre) {
        if (kilometre > 0) {
            this.kilometre = kilometre;
        }

    }

    public void setFiyat(double fiyat) {

        if (fiyat > 0) {
            this.fiyat = fiyat;
        }
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getYıl() {
        return yıl;
    }

    public double getMotorHacmi() {
        return motorHacmi;
    }

    public String getYakıtTürü() {
        return yakıtTürü;
    }

    public int getKilometre() {
        return kilometre;
    }

    public double getFiyat() {
        return fiyat;
    }
    public boolean getIkinciel() {
        return ikinciel;
    }

    

    void aracBilgisiYazdir() {
        System.out.println("Marka: " + getMarka() + " Model: " + getModel() + " Yıl: " + getYıl() + " Motor hacmi: " + getMotorHacmi() + " Yakıt türü: " + getYakıtTürü() + " Kilometre: " + getKilometre() + " Fiyat: " + getFiyat());
    }

    int YaşHesapla() {
        int aracyaş = 2025 - getYıl();
        return aracyaş;
    }

   
     boolean BakımGerekliMi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("kilometre giriniz : ");
        int yenikilometre = scanner.nextInt();
        scanner.close();
         Bakımayar bakımayar = new Bakımayar(yenikilometre);
         if(getKilometre() > (YaşHesapla()*bakımayar.getKmPerYılEsiği())){
            return true;
        }
        else{
            return false;

        }
    }
     void FiyatGüncelle(double oran){
        setFiyat((getFiyat()*oran)/100 +getFiyat());
     }


      
}
