package ödev4;

public abstract class Araç {
    private int plakaNo;
    private double maaliyet; // km başına düşen temel maliyet

    public Araç(int plakaNo, double maaliyet) {
        this.plakaNo = plakaNo;
        this.maaliyet = maaliyet;
    }

    public int getPlakaNo() {
        return plakaNo;
    }

    public void setPlakaNo(int plakaNo) {
        this.plakaNo = plakaNo;
    }

    

    public double getMaaliyet() {
        return maaliyet;
    }

    public void setMaaliyet(double maaliyet) {
        this.maaliyet = maaliyet;
    }

     abstract double taşımaMaliyeti(double mesafe, double yük); // mesafe km cinsinden giriliyor
       



    
}
