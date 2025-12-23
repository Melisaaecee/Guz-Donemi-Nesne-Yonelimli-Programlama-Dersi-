package ödev2;

public class BookProduct extends Product {

    private String author;
    private int pageCount;
    public static final double vat_rate = 0.10;

    public BookProduct(String name, double price, String sku, String author, int pageCount) {
        super(name, price, sku);
        setAuthor(author);
        setPageCount(pageCount);
    }

    public BookProduct(String name, double price) {
        super(name, price);
    }

    public void setPageCount(int pageCount) {
        if (pageCount >= 1) {
            this.pageCount = pageCount;
        } else {
            System.out.println("HATA!!!");
        }
    }

    public void setAuthor(String author) {
        if (author == null) {
            System.out.println("lütfen bir yazar giriniz!!");
        } else {
            this.author = author;
        }
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPagecount() {
        return this.pageCount;
    }

    @Override
    public double finalPrice() {
        return getPrice() * (1 + vat_rate);
    }

    @Override
     public String toString(){
         return super.toString() + " author: " + getAuthor() +  " Pages: " + getPagecount() ;
     }

}
