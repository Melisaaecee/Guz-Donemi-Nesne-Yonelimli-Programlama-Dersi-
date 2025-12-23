package ödev4;

public class StandartKargo extends Kargo implements Sigortalanabilir {

    public StandartKargo(String kargoNo, double agırlık, double deger, Araç araç) {
        super(kargoNo, agırlık, deger, araç);
    }

    @Override
    public double toplamMaaliyet(double mesafe, double ağırlık) {
        return 0.3 * araç.taşımaMaliyeti(mesafe, getAgırlık());
    }

    @Override
    public double sigortaBedeli(double kargoDegeri) {
        return kargoDegeri * 0.04;
    }

    @Override
    public void sigortaPoliçesi() {
        System.out.println(
                " Araç: " + getAraç().getPlakaNo() + " Kargo no: " + getKargoNo() + " Sigorta bedeli: "
                        + sigortaBedeli(getDeger()));
    }
}
