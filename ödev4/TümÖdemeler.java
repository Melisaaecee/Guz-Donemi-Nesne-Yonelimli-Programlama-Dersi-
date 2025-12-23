package ödev4;

import java.util.ArrayList;
import java.util.List;

public class TümÖdemeler {
  List<Ödeme> liste = new ArrayList<>();

  public TümÖdemeler() {

  }

  void ödemeYöntemiEkle(Ödeme ödeme) {
    liste.add(ödeme);
  }

  void ödemeler() {
    for (Ödeme ö : liste) {
      if (ö.ödeme == true) {
        ö.pay();
        ö.yazdırma();
        System.out.println("---------------------------------------------");

      } else if (ö.ödeme == false) {
        System.out.println("Ödeme yapılmamış,en kısa sürede yapınız!");
        System.out.println("---------------------------------------------");

      }
    }
  }

}
