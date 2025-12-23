package ödev4;

public class Kamyon extends Araç {
    private static double maxTasımaKapasitesi = 500; // kg

    public Kamyon(int plakaNo, double maaliyet) {
        super(plakaNo, maaliyet);
    }

    @Override
    public double taşımaMaliyeti(double mesafe, double yük) {
        if (mesafe >= 150 && mesafe <= 450 && yük < maxTasımaKapasitesi) {
            if (yük > (maxTasımaKapasitesi / 2)) {
                return mesafe * getMaaliyet() * yük * 4;
            } else {
                return mesafe * getMaaliyet() * yük * 2;
            }
        } else if (mesafe < 150 && mesafe > 0 && yük < maxTasımaKapasitesi) {
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
