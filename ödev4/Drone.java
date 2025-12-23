package ödev4;

public class Drone extends Araç implements TakipEdilebilen {
    private static double maxTasımaKapasitesi = 25; // kg

    public Drone(int plakaNo, double maaliyet) {
        super(plakaNo, maaliyet);
    }

    @Override
    public double taşımaMaliyeti(double mesafe, double yük) {
        if (mesafe >= 10 && mesafe <= 20 && yük < maxTasımaKapasitesi) {
            if (yük > (maxTasımaKapasitesi / 2)) {
                return mesafe * getMaaliyet() * yük * 2;
            } else {
                return mesafe * getMaaliyet() * yük;
            }
        } else if (mesafe < 10 && mesafe > 0 && yük < maxTasımaKapasitesi) {
            if (yük > (maxTasımaKapasitesi / 2)) {
                return (mesafe / 2) * getMaaliyet() * (yük / 2);
            } else {
                return (mesafe / 2) * getMaaliyet() * (yük / 4);
            }
        } else {
            return 0;

        }
    }

    @Override
    public void takibiBaslatma() {
        System.out.println("Kargo şubeden alındı!");
    }

    @Override
    public void takibiDurdurma(String konum) {
        System.out.println("Kargo teslim edildi!" + konum);
    }

    @Override
    public String sonBilinenKonumSorgulama(String konum) {
        return  ("Drone konumu: " + konum);
    }

}
