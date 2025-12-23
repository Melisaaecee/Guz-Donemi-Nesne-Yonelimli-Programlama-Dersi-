package ders7;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TamZamanlıÇalışan t1 = new TamZamanlıÇalışan("Hasan", "1128", 35000, 76, 6);
        TamZamanlıÇalışan t2 = new TamZamanlıÇalışan("Gül", "1694", 24963, 63, 2);

        YarıZamanlıÇalışan y1 = new YarıZamanlıÇalışan("Ece", "5248", 18750, 1200, 5);

        Stajer s1 = new Stajer("Ali", "4963", 6000);
        Yönetici yö1 = new Yönetici("İlayda", "2475", 55000, 80, 12, "Bilgi İşlem", 15);
        IKDepartmani ık = new IKDepartmani();

       

        ık.çalışanKaydet(t1);
        ık.çalışanKaydet(t2);
        ık.çalışanKaydet(y1);
        ık.çalışanKaydet(s1);
        ık.çalışanKaydet(yö1);

        ık.çalışanKaydet(t1.ad);
        ık.çalışanKaydet(t2.ad);
        ık.çalışanKaydet(y1.ad);
        ık.çalışanKaydet(s1.ad);
        ık.çalışanKaydet(yö1.ad);

        maasİşlemleri(ık.list);

        yılSonuPrimleri(ık.list);

    }

    static void maasİşlemleri(List<Çalışan> list) {

        for (Çalışan kişi : list) {
            System.out.println("Ad: " + kişi.ad + " Kimlik no: " + kişi.kimlikNo + " Maaş: " + kişi.maasHesapla()
                    + " Çalışan tipi: " + kişi.çalışanTipi());
        }
    }

    static void yılSonuPrimleri(List<Çalışan> list) {
        for (Çalışan çalışan : list) {
            if (çalışan instanceof TamZamanlıÇalışan) {
                System.out.println(çalışan.ad + "  adlı çalışan" + " primi: " + ((TamZamanlıÇalışan) çalışan).primHesapla());
            } else if (çalışan instanceof YarıZamanlıÇalışan) {
                System.out.println(çalışan.ad + "  adlı çalışan" + " primi: " + ((YarıZamanlıÇalışan) çalışan).primHesapla());
            }

        }

    }
}
