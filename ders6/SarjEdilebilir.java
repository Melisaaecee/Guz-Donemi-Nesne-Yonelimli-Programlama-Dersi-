package ders6;

public interface SarjEdilebilir {
    void sarjEt();

    int getBataryaSeviyesi();

    default boolean tamSarjMı() {
        if (getBataryaSeviyesi() == 100) {
            return true;
        } else {
            return false;

        }
    }

    default boolean dusukBataryaMı() {
        if(getBataryaSeviyesi() < 20){
            return false;
        }
        else{
            return true;
        }

    }

}