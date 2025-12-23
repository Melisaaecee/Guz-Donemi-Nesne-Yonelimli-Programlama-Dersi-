package ödev2;

public class Main {
    public static void main(String[] args) {
        
        Product p1 =new Product("telefon", 15000,"1006");
        Product p2 = new Product("kulaklık", 2500);

        BookProduct b1 =new BookProduct("Roman", 469, "505", "Dan Brown", 500);
        BookProduct b2 = new BookProduct("Şiir kitabı ", 254);

        DijitalProduct d1 = new DijitalProduct("e-kitap", 20, "1480", 75, "indir.com");


        p1.applyDiscount(1500);
        b1.applyDiscount(20.0);
        d1.applyDiscount(15.0);

        Cart cart = new Cart();

        cart.add(p1);
        cart.add(b1);
        cart.add(d1);
        cart.add(p2);
        cart.add(b2);

        System.out.println("sepet : ");

        for( Product sepet : cart.getItems()){
            System.out.println(" -> " + sepet.toString());
        }

        System.out.println("Ara Toplam (KDV Hariç): " + cart.subtotal() + " TL");
        System.out.println("Genel Toplam (KDV Dahil): " + cart.total() + " TL");
        System.out.println("Toplam Ürün Sayısı: " + Product.getProductCount());


        
    }
    
}
