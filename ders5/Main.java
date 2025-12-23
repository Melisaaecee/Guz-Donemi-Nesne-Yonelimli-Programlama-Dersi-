package ders5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kitap k1 = new Kitap("Melekler ve şeytanlar", "dan brown", false);
        Kitap k2 = new Kitap("Kürk Mantolu Madonna", "sabahattin ali", true);

        Dergi d1 = new Dergi("A", 5, false);
        Dergi d2 = new Dergi("B", 14, true);

        /*
         * k1.yazdır();
         * k2.yazdır();
         * 
         * d1.yazdır();
         * d2.yazdır();
         */
        k1.oduncAl("mert");
        d2.iadeEt();
        d1.oduncAl("şeyma");

        ÖdünçAlınabilir.gecikmeUcreti(5, 6);

        List<Yazdırılabilir> list = new ArrayList<>();
        list.add(k1);
        list.add(k2);
        list.add(d1);
        list.add(d2);

        for (Yazdırılabilir bilgi : list) {
            bilgi.yazdır();

        }

    }
}
