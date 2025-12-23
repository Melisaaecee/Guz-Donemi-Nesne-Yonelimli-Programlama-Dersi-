package ödev3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> list = new ArrayList<>();

        Animal dog = new Dog(); // burda upcast yapıyoruz yani üst sınıf referans alrak alt sınıftan bir nesne
                                // üretiyoruz.
        Animal cat = new Cat();

        // PDF de belirtilmemiş ama list oluşturduğumuzda yarattığımız nesneleri liste
        // içine "add" fonksiyonuyla eklememiz gerekir

        list.add(cat);
        list.add(dog);

        for (Animal hayvan : list) {
            makeitSound(hayvan);

            // burada listedeki bütün elemanları çekiyorum ve sırayla aşağıdaki fonksiyona
            // gönderiyorum böylelikle tek tek yazmak yerine bir for döngüsüyle daha hızlı
            // hallediyorum.
            // yukarıdaki kod nesneleri tek tek fonksiyona gönderir böylelikle çıktı:
            // kedi için : miyav - kedi nankördür
            // köpek için : havhav - köpek koruyucudur
            // yazdırır
        }

        // herhangi bir listeye eklemeden bu işlemi yapabilirdim:
        // makeitSound(cat);
        // makeitSound(dog);
        // bu şekilde gönderebilirdim ama oluşturulan her bir nesne için bunu
        // tekrar etmem gerekirdi. yukarıdaki kodla otomatik, listeye eklenen her bir
        // nesne için bu işlemi yaptırırım.

        makeitsound(list);
        // bu fonksiyonu kullanırsak main fonksiyonu içerisine for döngüsü yazmamıza
        // gerek kalmaz. yine aynı çıktıları elde ederiz.

        // daha uzun bir yöntem kullanmak istersek başka bir fonksiyon yazmadan direkt
        // ((Cat) cat).Sound() ve ((Cat) cat).Nankor() fonksiyonları çağırılabilir.
        // ((Dog) dog).Sound() ve ((Dog) dog).Koruma() fonksiyonları çağrılabilir.

        // bu şekilde yazdığımızda oluşturduğumuz cat ya da dog sınıfından her bir nesne
        // için bu işlemin yapılması gerekir oysaki bizim yazdığımız makeitSound()
        // fonksiyonuyla cat ve dog sınıfından oluşturulan nesneler için bu işlemi
        // yapabiliriz.

        sesyap(list);

    }

    // static void makeitSound(Animal a) {
    // System.out.println(a.Sound());
    // System.out.println(a.Koruma());
    // System.out.println(a.Nankor());}

    // Bu şekilde yazarsak eğer kod hata verir çünkü her sınıfn kendine ait
    // fonksiyonları var koruma fonksiyonu sadece dog sınfına özeldir;nankör
    // fonksiyonu ise cat sınıfına özeldir.Burada cat ve dog sınıfından
    // oluşturduğumuz nesneleri Animal sınıfını
    // referans alarak oluşturduk.Bu fonksiyona parametre olarak Animal sınıfından
    // nesne gönderdik.(biz nesnelerimizi cat ve dog sınıfından ürettik)Sound
    // fonksiyonu
    // hepsinde ortak olduğundan çalışır diğer fonksiyonlar çalışmaz ve hata
    // verir.Bunu önlemek için if else yapısını kullanabiliriz.

    static void makeitSound(Animal a) {
        a.Sound();
        if (a instanceof Cat) {
            ((Cat) a).Nankor(); // downcast
        } else if (a instanceof Dog) {
            ((Dog) a).Koruma();
        }
    }

    static void makeitsound(List<Animal> list) { // overloading olmasın diye iki fonksiyonun isimlerini farklı
                                                 // yazdım.(parametreleri farklı olsa bile)
        for (Animal hayvan : list) {
            hayvan.Sound();
            if (hayvan instanceof Cat) { // instanceof yapısını kullanarak hayvan değişkeninin "cat sınıfına ait mi?"
                                         // sorgulamasını yapıyorum.
                ((Cat) hayvan).Nankor(); // burda downcast yapıyorum ve alt sınıfa ait olan fonksiyonu kullanması için
                                         // nesneyi alt sınıfa indirgiyorum.
            } else if (hayvan instanceof Dog) {
                ((Dog) hayvan).Koruma();
            }
        }

        // burada ise parametre olarak animal sınıfından bir nesne göndermek yerine
        // direkt oluşturduğumuz list'i gönderebiliriz.
        // for döngüsü içinde listedeki elemnaları tek tek ele alıp if-else if yapısıyla
        // mantıklı bir sorgulama yapabiliriz.

    }

    static void sesyap(List<Animal> list) {
        for (Animal hayvan : list) {

            switch (hayvan.getClass().getSimpleName()) { //Burda switch içerisine sınıfın ismini gönderiyorum String türünde.
                case "Cat":
                    System.out.println("bu bir kedi");
                    hayvan.Sound();
                    break;
                case "Dog":
                    System.out.println("bu bir köpek");
                    hayvan.Sound();
                    break;
            }
        }

        // java kütüphanelerine bakarak sınıfın ismini nasıl alabilirm diye
        // düşündüm.Çünkü switch'in içine sadece int,string,float gibi türler
        // yazılabiliyor.hayvan. yazdığımda bazı hazır fonksiyonlar çıktı ve
        // içlerinden biri de getClass() fonksiyonuydu. Denedim ama switch içerisinde
        // kabul edilmedi bende for döngüsü içine Animal hayvan yerine Class hayvan
        // yazdım class sınıfından fonksiyonlarını kullanmak için sonrasın da getNama()
        // fonksiyonunu gördüm ve kullanabilir miyim diye fonksiyon içeriğini okudum ve
        // denedim.Çalışmadı :(
        // Sonrasında tekrardan Animal hayvan yazdım ve hayvan.getName() ifadesini
        // kullandım ama yine olmadı.Çünkü ben sınıfın ismini çekmek istiyordum burda
        // chatGPT ye bu iki fonksiyonu beraber kullanabilir miyim diye sordum ve bana
        // getClass().getSimpleName() şeklinde kullanabileceğimi söyledi ve bende bu
        // şekilde denedim ve çalıştırdım.

        // Hocam aklıma başka bir şey gelmedi ondan dolayı son aşamada chatGPTye
        // sordum.Çünkü ikisi beraber kullanılıbilir diye fonksiyon içeriğinde
        // yazmıyordu. ve bende hiç bu fonksiyonları kullanmamıştım.
    }

}
