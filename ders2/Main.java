package ders2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Doktor doktor1 = new Doktor("hasan", "alerji");
        Doktor doktor2 = new Doktor("ayşe", "kalp doktoru ");
        Doktor doktor3 = new Doktor("samet", "çocuk doktoru");

        Hasta hasta1 = new Hasta("Fatma", 10);
        Hasta hasta2 = new Hasta("kemal", 68);
        Hasta hasta3 = new Hasta("yaşar", 25);
 while(true){
        Scanner deger = new Scanner(System.in);
        System.out.println("yapmak istediğiniz işlemi seçin: ");
        System.out.println("1- Doktor bilgileri 2-Hasta bilgileri 3-Randevu iptali 4-Randevu al");
        int x = deger.nextInt();

        switch (x) {
            case 1:
                doktor1.bilgilerigöster();
                doktor2.bilgilerigöster();
                doktor3.bilgilerigöster();
                break;
            case 2:
                hasta1.bilgileriGöster();
                hasta2.bilgileriGöster();
                hasta3.bilgileriGöster();
                break;
            case 3:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Hasta numarası giriniz : ");
                int a = scanner.nextInt();
                if (a == 1) {
                    hasta1.randevuİptal();
                } else if (a == 2) {
                    hasta2.randevuİptal();
                } else {
                    hasta3.randevuİptal();
                }
                break;
            case 4:
                Scanner alma = new Scanner(System.in);
                System.out.println("Hasta numarası giriniz : ");
                int s = alma.nextInt();
                if (s == 1) {
                    Scanner d = new Scanner(System.in);
                    System.out.println("Doktor numarası giriniz : ");
                    int y = d.nextInt();
                    if (y == 1) {
                        hasta1.randevuAl(doktor1);
                    } else if (y == 2) {
                        hasta1.randevuAl(doktor2);
                    } else {
                        hasta1.randevuAl(doktor3);
                    }

                } else if (s == 2) {
                    Scanner b = new Scanner(System.in);
                    System.out.println("Doktor numarası giriniz : ");
                    int y = b.nextInt();
                    if (y == 1) {
                        hasta2.randevuAl(doktor1);
                    } else if (y == 2) {
                        hasta2.randevuAl(doktor2);
                    } else {
                        hasta2.randevuAl(doktor3);
                    }

                } else {
                    Scanner c = new Scanner(System.in);
                    System.out.println("Doktor numarası giriniz : ");
                    int y = c.nextInt();
                    if (y == 1) {
                        hasta3.randevuAl(doktor1);
                    } else if (y == 2) {
                        hasta3.randevuAl(doktor2);
                    } else {
                        hasta3.randevuAl(doktor3);
                    }

                }
                break;

        }

    }
}
}
