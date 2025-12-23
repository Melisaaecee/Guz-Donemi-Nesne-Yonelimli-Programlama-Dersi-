package ödev2;

public class Product {
    private String name;
    private double price;
    private String sku;
    public static final double VAT_RATE = 0.20; // kdv %20
    private static int productCount = 0; // toplam ürün sayısı

    public Product(String name, double price, String sku) {
        setName(name);
        setPrice(price);
        setSku(sku);
        productCount++;
    }

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
        productCount++;
        sku = "sku- " + productCount;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("fiyat 0'dan küçük olamaz!!!");
        } else {
            this.price = price;
        }
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("lütfen isim giriniz!!");
        } else {
            this.name = name;
        }
    }

    public void setSku(String sku) {
        if (sku == null) {
            System.out.println("lütfen ürün stoğunu  giriniz!!");
        } else {
            this.sku = sku;
        }
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getSku() {
        return this.sku;
    }

    public void applyDiscount(double percent) {
        if (percent > 0 && percent < 100) {
            this.price -= getPrice() * (percent / 100);
        }

    }

    public void applyDiscount(int amount) {
        if (amount > 0 && amount < getPrice()) {
            this.price = getPrice() - amount;
        }

    }

    public static int getProductCount() {
        return productCount;
    }

    public double finalPrice() {
        return getPrice() * (1 + VAT_RATE);
    }

    @Override
    public String toString() {
        return " Name: " + getName() + " Price: " + getPrice() + " Sku: " + getSku();
    }

}
