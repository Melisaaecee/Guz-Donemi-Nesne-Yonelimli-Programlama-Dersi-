package ödev4;

public class DijitalCüzdan extends Ödeme {


    public DijitalCüzdan(double tutar, String paraBirimi) {
        super(tutar, paraBirimi);
    }

    @Override
    public void pay() {
        System.out.println("ödeme yapıldı!");
    }

    @Override
    public void yazdırma() {
        System.out.println("Ödeme yöntemi: Dijital cüzdan" + " Tutar: " + getTutar() + " " + getParaBirimi());
    }
}
