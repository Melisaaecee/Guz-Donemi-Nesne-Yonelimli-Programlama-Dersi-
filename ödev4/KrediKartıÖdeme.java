package ödev4;

public class KrediKartıÖdeme extends Ödeme {

    public KrediKartıÖdeme(double tutar, String paraBirimi) {
        super(tutar, paraBirimi);
    }

    @Override
    public void pay() {
        System.out.println("ödeme yapıldı!");

    }

    @Override
    public void yazdırma(){
        System.out.println("Ödeme yöntemi: Kredi kartı" +  " Tutar: " + getTutar() + " " + getParaBirimi());
    }

}
