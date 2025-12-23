package ders6;

public class DizÜstüBilgisayar extends Cihaz implements SarjEdilebilir, Tasınabilir, Baglanabilir {

    String ram;
    int bataryaSeviyesi;
    boolean bagli;
    String agAdi;
    double agırlık;
    static int toplamLaptopSayısı=0;

    public DizÜstüBilgisayar(String marka, String model, double fiyat, String ram, int bataryaSeviyesi,double agırlık) {
        super(marka, model, fiyat);
        this.ram = ram;
        this.bataryaSeviyesi = bataryaSeviyesi;
        this.agırlık = agırlık;
        toplamLaptopSayısı++;

    }
     @Override
    public void sarjEt() {
        if (dusukBataryaMı() == false) {
            System.out.println("Batarya %20'den az!!!");
            System.out.println("Bilgisayarı şarj ediniz!!");
        } 
        else if (tamSarjMı() == true) {
            System.out.println("Batarya full dolu!!!");
        }
         else {
            System.out.println("Bilgisayarın %" + bataryaSeviyesi + " şarjı var");

        }
    }

    @Override
    public int getBataryaSeviyesi(){
        return this.bataryaSeviyesi;
    }

    @Override
     public void baglan(String ag){
        this.agAdi=ag;
        System.out.println("Bilgisayar " + agAdi + " bu ağa bağlı");
     }

     @Override
     public void baglantıKes(){
        this.agAdi=null;
        System.out.println("Bağlantı kesildi!!");
     }

     @Override
     public boolean baglıMı(){
        if(getBaglıAg() != null){
            baglantıDurumuGöster();
            return true;
        }
        else{
            baglantıDurumuGöster();
            return false;
        }
     }

     @Override
     public String getBaglıAg(){
         return this.agAdi;
     }

     @Override
     public double getAgırlık(){
        return this.agırlık;
     }

     @Override
     public String getBoyut(){
        return this.ram;
     }

      @Override
     public void bilgiGöster(){
        System.out.println("Marka: " + marka + " Model: " + model + " Fiyat: " + fiyat);
        System.out.println("Ağ adı: " + agAdi + " Ram: " + ram);
     }


}
