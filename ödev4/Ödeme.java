package ödev4;

public abstract class Ödeme implements İadeEdilebilir {
    private double tutar;
    private String paraBirimi;
    boolean ödeme = false;

    public Ödeme(double tutar, String paraBirimi) {
        this.tutar = tutar;
        this.paraBirimi = paraBirimi;
        ödeme = false;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }

    public String getParaBirimi() {
        return paraBirimi;
    }

    public void setParaBirimi(String paraBirimi) {
        this.paraBirimi = paraBirimi;
    }

    boolean yetkilendirme() {
        ödeme = true;
        System.out.println("Ödeme yapılıyor!!");
        return ödeme;
    }

    abstract void pay();

    abstract void yazdırma();

    @Override
    public void iade() {
        System.out.println(" Tutar iade edildi! -> " + getTutar() + getParaBirimi());
        ödeme=false;
    }
}
