package ödev2;

public class DijitalProduct extends Product {
    
    private double fileSizeMB;
    private String downloadUrl;

    public static final double DL_FEE = 0.99;

    DijitalProduct(String name, double price, String sku, double fileSizeMB, String downloadUrl) {
        super(name, price, sku);
        setFileSizeMB(fileSizeMB);
        this.downloadUrl = downloadUrl;
    }

    public void setFileSizeMB(double fileSizeMB) {
        if (fileSizeMB >= 0) {
            this.fileSizeMB = fileSizeMB;
        }
         else{
            System.out.println("HATA!!!");
        }
    }

    @Override
    public double finalPrice() {
        return getPrice() * (1 + VAT_RATE) + DL_FEE;
    }

}
