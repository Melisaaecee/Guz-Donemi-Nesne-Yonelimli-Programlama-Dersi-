package ders6;

public class MasaüstüBilgisayar extends Cihaz implements Baglanabilir{
    String işlemci;
    boolean bagli;
    String agAdi;
    static int toplamMasaüstüSayısı=0;

    public MasaüstüBilgisayar(String marka, String model, double fiyat, String işlemci) {
        super(marka, model, fiyat);
        this.işlemci = işlemci;
        toplamMasaüstüSayısı++;
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
     public void bilgiGöster(){
        System.out.println("Marka: " + marka + " Model: " + model + " Fiyat: " + fiyat);
        System.out.println("Ağ adı: " + agAdi + " İşlemci: " + işlemci);
     }


    
}
