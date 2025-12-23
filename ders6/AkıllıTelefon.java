package ders6;

public class AkıllıTelefon extends Cihaz implements SarjEdilebilir, Tasınabilir, Baglanabilir {

    String isletimSistemi;
    int bataryaSeviyesi;
    boolean bagli;
    String agAdi;
    double agırlık;
    String boyut;
    static int toplamTelefonSayısı=0;

    public AkıllıTelefon(String marka, String model, double fiyat, String isletimSistemi, int bataryaSeviyesi,double agırlık, String boyut) {
        super(marka, model, fiyat);
        this.isletimSistemi = isletimSistemi;
        this.bataryaSeviyesi = bataryaSeviyesi;
        this.agırlık = agırlık;
        this.boyut = boyut;
        toplamTelefonSayısı++;
    }

    @Override
    public void sarjEt() {
        if (dusukBataryaMı() == false) {
            System.out.println("Batarya %20'den az!!!");
            System.out.println("Telefonu şarj ediniz!!");
        } 
        else if (tamSarjMı() == true) {
            System.out.println("Batarya full dolu!!!");
        }
         else {
            System.out.println("Telefonun %" + bataryaSeviyesi + " şarjı var");

        }
    }

    @Override
    public int getBataryaSeviyesi(){
        return this.bataryaSeviyesi;
    }

    @Override
     public void baglan(String ag){
        this.agAdi=ag;
        System.out.println("Telefon " + agAdi + " bu ağa bağlı");
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
        return this.boyut;
     }

      @Override
     public void bilgiGöster(){
        System.out.println("Marka: " + marka + " Model: " + model + " Fiyat: " + fiyat);
        System.out.println("Ağ adı: " + agAdi + " İşletim sistemi: " + isletimSistemi);
     }

     public static AkıllıTelefon fiyatKarşılaştır(AkıllıTelefon t1,AkıllıTelefon t2){

        if(t1.fiyat > t2.fiyat){
            return t2;
        }
        else{
            return t1;
        }

     }




}
