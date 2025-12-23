package ders8;

public class Main {
    public static void main(String[] args) {
        Adres a1 = new Adres("Kadıköy", "istanbul");
        Adres a2 = new Adres("levent", "istanbul");

        Çalışan ç1 = new Çalışan("hasan", 35, a1);
        Çalışan ç2 = new Çalışan("Gül", 24, a2);

        Müdür m1 = new Müdür("Yaren", 32, a2, 12);

        Yazılımcı y1 = new Yazılımcı("Sezin", 25, a1, "java");

        int toplam = Çalışan.getÇalışansayısı();

        System.out.println("Toplam çalışan: " + toplam);

        Çalışan[] dizi = new Çalışan[4];
        dizi[0] = ç1;
        dizi[1] = ç2;
        dizi[2] = m1;
        dizi[3] = y1;

        for (Çalışan çalışan : dizi) {

            System.out.println("çalışan: " + çalışan.getAd() + " Çalışan ünvan: " + çalışan.getClass().getSimpleName() + " Yaş: " + çalışan.getYaş() + " Adres: "
                    + çalışan.getAdres().getSokak() + " " + çalışan.getAdres().getŞehir());

            if (çalışan instanceof Müdür) {
                System.out.println("Ekip büyüklüğü: " + ((Müdür) çalışan).getEkipBüyüklüğü());
                System.out.println("prim: " + ((Müdür) çalışan).primHesapla());
                ((Müdür) çalışan).terfiEt();
            } else if (çalışan instanceof Yazılımcı) {
                System.out.println("Yazılım dili: " + ((Yazılımcı) çalışan).getYazılımDili());
                System.out.println("prim: " + ((Yazılımcı) çalışan).primHesapla());

            }
        }

    }
}
