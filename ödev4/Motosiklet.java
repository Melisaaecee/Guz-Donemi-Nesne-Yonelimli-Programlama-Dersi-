package ödev4;

public class Motosiklet extends Araç {
    private static double maxTasımaKapasitesi = 120; // kg

    public Motosiklet(int plakaNo, double maaliyet) {
        super(plakaNo, maaliyet);
    }

    @Override
    public double taşımaMaliyeti(double mesafe, double yük) {
        if (mesafe >= 75 && mesafe <= 250 && yük < maxTasımaKapasitesi) {
            if (yük > (maxTasımaKapasitesi / 2)) {
                return mesafe * getMaaliyet() * yük;
            } else {
                return mesafe * getMaaliyet() * (yük / 2);
            }
        } else if (mesafe < 75 && mesafe > 0 && yük < maxTasımaKapasitesi) {
            if (yük > (maxTasımaKapasitesi / 2)) {
                return (mesafe / 2) * getMaaliyet() * yük;
            } else {
                return (mesafe / 2) * getMaaliyet() * (yük / 2);
            }
        } else {
            return 0;

        }
    }

}
