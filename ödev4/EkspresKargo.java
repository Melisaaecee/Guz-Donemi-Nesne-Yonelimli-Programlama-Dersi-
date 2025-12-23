package ödev4;

public class EkspresKargo extends Kargo{

    public EkspresKargo(String kargoNo, double agırlık,double deger, Araç araç) {
        super(kargoNo, agırlık,deger,araç);
    }

    @Override
    public double toplamMaaliyet(double mesafe,double ağırlık){
         return araç.taşımaMaliyeti(mesafe,getAgırlık());
    }
    
}
