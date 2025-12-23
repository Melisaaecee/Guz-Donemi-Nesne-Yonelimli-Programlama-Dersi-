package ödev4;

public abstract class Kargo {
    private String kargoNo;
    private double agırlık;
    private double deger;
    Araç araç;
    private double toplam;

    public Kargo(String kargoNo, double agırlık, double deger, Araç araç) {
        this.kargoNo = kargoNo;
        this.agırlık = agırlık;
        this.deger = deger;
        this.araç = araç;
        toplam=0;
    }

    public String getKargoNo() {
        return kargoNo;
    }

    public void setKargoNo(String kargoNo) {
        this.kargoNo = kargoNo;
    }

    public double getAgırlık() {
        return agırlık;
    }

    public double getToplam() {
        return toplam;
    }

    public void setToplam(double toplam) {
        this.toplam = toplam;
    }

    public void setAgırlık(double agırlık) {
        this.agırlık = agırlık;
    }

    public Araç getAraç() {
        return araç;
    }

    public void setAraç(Araç araç) {
        this.araç = araç;
    }

    public double getDeger() {
        return deger;
    }

    public void setDeger(double deger) {
        this.deger = deger;
    }

    abstract double toplamMaaliyet(double mesafe, double ağırlık);

}
