package ders1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsim giriniz: ");
        String isim = scanner.nextLine();


        System.out.println("Soyisim giriniz: ");
        String soyisim = scanner.nextLine();

      
        System.out.println("Öğrenci numarası giriniz: ");
        int studentnumber = scanner.nextInt();
     
        System.out.println("Yaş giriniz: ");
        int yaş = scanner.nextInt();

        scanner.close();
       
        String  dersgrubu;

        if(studentnumber%2 == 0){
            dersgrubu = "B";

        }
        else{
            dersgrubu = "A";
        }
        
        Data data = new Data(isim,soyisim,studentnumber,yaş,dersgrubu);

        data.print();
    }
}
