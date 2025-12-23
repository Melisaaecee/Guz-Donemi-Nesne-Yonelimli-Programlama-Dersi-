package ders7;

import java.util.ArrayList;
import java.util.List;

public class IKDepartmani {

    String şirketAd;
    List<Çalışan> list = new ArrayList<>();
    List<String> listad = new ArrayList<>();

    void çalışanKaydet(Çalışan çalışan) {
        list.add(çalışan);
        System.out.println(çalışan.kimlikNo + " Eklendi!!");
    }

    void çalışanKaydet(String kişi) {
        listad.add(kişi);
        System.out.println(kişi + " Eklendi!!");
    }

}
