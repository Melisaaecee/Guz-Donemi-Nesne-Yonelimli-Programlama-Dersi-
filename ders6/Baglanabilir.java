package ders6;

public interface Baglanabilir {
    void baglan(String ag);
    void baglantıKes();
    boolean baglıMı();
    String getBaglıAg();

     default void baglantıDurumuGöster(){
        if(baglıMı()==true){
            System.out.println("Ağ adı: " + getBaglıAg());
        }
        else{
            System.out.println("Cihaz bir ağa bağlı değil!!!");
        }
     }

}
