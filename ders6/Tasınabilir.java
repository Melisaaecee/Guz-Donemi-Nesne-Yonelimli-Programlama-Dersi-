package ders6;

public interface Tasınabilir {
    double getAgırlık();

    String getBoyut();

    default boolean hafifMi() {
        if(getAgırlık() < 1){
            System.out.println("Ağırlık 1kg'dan az ve hafif!!!");
            return true;
        }
        else{
             System.out.println("Ağırlık 1kg'dan fazlave ağır!!!");
             return false;
        }

    }

    default void tasınabilirlikBilgisiGöster() {
        System.out.println("boyut: " + getBoyut() + " Ağırlık: " + getAgırlık());

    }

}
