package ders6;

public class AkıllıSaat extends Cihaz implements SarjEdilebilir, Tasınabilir{

    boolean gpsVarMı;
    int bataryaSeviyesi;
    double agırlık;
    String boyut;
    static int toplamSaatSayısı=0;

    public AkıllıSaat(String marka, String model, double fiyat, boolean gpsVarMı, int bataryaSeviyesi, double agırlık,String boyut) {
        super(marka, model, fiyat);
        this.gpsVarMı = gpsVarMı;
        this.bataryaSeviyesi = bataryaSeviyesi;
        this.agırlık = agırlık;
        this.boyut=boyut;
        toplamSaatSayısı++;
    }

    @Override
    public void sarjEt() {
        if (dusukBataryaMı() == false) {
            System.out.println("Batarya %20'den az!!!");
            System.out.println("Saati şarj ediniz!!");
        } 
        else if (tamSarjMı() == true) {
            System.out.println("Batarya full dolu!!!");
        }
         else {
            System.out.println("Saatin %" + bataryaSeviyesi + " şarjı var");

        }
    }

    @Override
    public int getBataryaSeviyesi(){
        return this.bataryaSeviyesi;
    }

     @Override
     public double getAgırlık(){
        return this.agırlık;
     }

     @Override
     public String getBoyut(){
        return this.boyut;
     }

    boolean gpsKontrol(){
        if(gpsVarMı==true){
             System.out.println("Saatte gps vardır!!");
            return true;
        }
        else{
            System.out.println("Saatte gps yoktur!!");
            return false;

        }
    }


    
}
