package ders3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Marka giriniz: ");
        String marka = scanner.nextLine();

        System.out.println("Model giriniz: ");
        String model = scanner.nextLine();

        System.out.println("Yıl giriniz: ");
        int yıl = scanner.nextInt();

        System.out.println("Motor hacmi giriniz: ");
        double motorHacmi = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("Yakıt türü giriniz: ");
        String yakıtTürü = scanner.nextLine();
      

        System.out.println("Kilometre giriniz: ");
        int kilometre = scanner.nextInt();

        System.out.println(" Araç ikinci el mi?: ");
        boolean ikinciel = scanner.nextBoolean();

        System.out.println("Araçın fiyatını giriniz: ");
        double fiyat = scanner.nextDouble();
        

        scanner.close();

        Araç araç = new Araç(marka, model, yıl, motorHacmi, yakıtTürü, kilometre, ikinciel, fiyat);
    
        araç.aracBilgisiYazdir();

        int araçyaş= araç.YaşHesapla();
        System.out.println("Aracın yaşı : " + araçyaş);
        araç.BakımGerekliMi();

       /*  Scanner x =new Scanner(System.in);
        System.out.println("yeni fiyat için oran giriniz : ");
        double yenifiyat=x.nextDouble();
        x.close();
        araç.FiyatGüncelle(yenifiyat);
        araç.aracBilgisiYazdir();
        */

        
        
        araç.BakımGerekliMi();

     
/*
        Araç arc = new Araç();
        arc.setFiyat(fiyat);
        arc.setKilometre(kilometre);
        arc.setMotorHacmi(motorHacmi);
        arc.setYıl(yıl);
        arc.setYakıtTürü(yakıtTürü);
        arc.setMarka(marka);
        arc.setIkinciel(ikinciel);
        arc.setModel(model);

        arc.aracBilgisiYazdir();
        arc.YaşHesapla();
        arc.BakımGerekliMi();

*/
        


        




       
        


    }
}
