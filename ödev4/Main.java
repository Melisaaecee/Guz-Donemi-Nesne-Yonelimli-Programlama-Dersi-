package ödev4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Araç a1 = new Kamyon(34, 800);
        Araç a2 = new Motosiklet(61, 500);
        Araç a3 = new Drone(06, 300);

        Kargo k1 = new StandartKargo("A-90", 115, 2500, a2);
        Kargo k2 = new EkspresKargo("B-120", 481, 1458, a1);
        Kargo k3 = new StandartKargo("C-569", 20, 7450, a3);

        double mesafe = 65;// km
        List<Kargo> kargoliste = new ArrayList<>();
        kargoliste.add(k1);
        kargoliste.add(k2);
        kargoliste.add(k3);

        for (Kargo kargo : kargoliste) {

            if (kargo.toplamMaaliyet(mesafe, kargo.getAgırlık()) == 0) {
                System.out.println("Arac : " + kargo.getAraç().getPlakaNo() + " Kargo no: " + kargo.getKargoNo());
                System.out.println("Bu teslimat yapılamaz!");
            } else {
                if (kargo instanceof Sigortalanabilir s) {
                    System.out.println("Sigortalanabilir kargo: " + kargo.getKargoNo());
                    s.sigortaPoliçesi();
                    double sigortaBedeli = s.sigortaBedeli(kargo.getDeger());
                    if (kargo.getDeger() > 2000) {
                        kargo.setToplam(sigortaBedeli + kargo.toplamMaaliyet(mesafe, kargo.getAgırlık()));
                        System.out.println("Toplam maliyet: " + kargo.getToplam());

                    }
                } else {
                    kargo.setToplam(kargo.toplamMaaliyet(mesafe, kargo.getAgırlık()));
                    System.out.println("Arac : " + kargo.getAraç().getPlakaNo() + " Kargo no: " + kargo.getKargoNo());
                    System.out.println("Toplam maliyet: " + kargo.getToplam());
                }
            }
            System.out.println("---------------------------------------------");

        }

        List<Araç> aracliste = new ArrayList<>();
        aracliste.add(a1);
        aracliste.add(a2);
        aracliste.add(a3);

        for (Araç arac : aracliste) {
            if (arac instanceof TakipEdilebilen t) {
                System.out.println("Takip edilebilen araç: " + arac.getPlakaNo());
                t.takibiBaslatma();
                System.out.println(t.sonBilinenKonumSorgulama("İstanbul"));
                t.takibiDurdurma("Ankara");
                System.out.println("---------------------------------------------");

            }

        }
        Ödeme ö1 = new KrediKartıÖdeme(k1.getToplam(), "Tl");
        Ödeme ö2 = new DijitalCüzdan(k2.getToplam(), "Dolar");
        Ödeme ö3 = new KrediKartıÖdeme(k3.getToplam(), "Euro");

        TümÖdemeler t = new TümÖdemeler();

        t.ödemeYöntemiEkle(ö1);
        t.ödemeYöntemiEkle(ö2);
        t.ödemeYöntemiEkle(ö3);

        ö1.yetkilendirme();
        System.out.println("---------------------------------------------");

        ö2.yetkilendirme();
        System.out.println("---------------------------------------------");

        t.ödemeler();

        ö1.iade();
    }
}
