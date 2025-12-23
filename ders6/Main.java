package ders6;

public class Main {
    public static void main(String[] args) {
        AkıllıTelefon t1 = new AkıllıTelefon("ıphone", "15 pro max", 70000, "ios 18", 45, 2.5, "6.5 ınch");
        AkıllıTelefon t2 = new AkıllıTelefon("samsung", "s25+", 68000, "android 19", 94, 3, "6.7 ınch");

        DizÜstüBilgisayar d1 = new DizÜstüBilgisayar("Lenovo", "thinkPad", 90000, "16 gb", 77, 3.5);

        AkıllıSaat a1 = new AkıllıSaat("huawei", "fit-3 pro", 5500, true, 61, 1, "2.5 ınch");

        MasaüstüBilgisayar m1 = new MasaüstüBilgisayar("hp", "z220", 95000, "i7");



       int toplamsayı=AkıllıTelefon.toplamTelefonSayısı + AkıllıSaat.toplamSaatSayısı + DizÜstüBilgisayar.toplamLaptopSayısı + MasaüstüBilgisayar.toplamMasaüstüSayısı;

        System.out.println("toplam cihaz sayısı: " + toplamsayı);

        t1.aç();
        t2.aç();
        d1.aç();
        a1.aç();
        m1.aç();

        t1.bilgiGöster();
        t2.bilgiGöster();
        d1.bilgiGöster();
        a1.bilgiGöster();
        m1.bilgiGöster();

        t1.sarjEt();
        t2.sarjEt();
        d1.sarjEt();
        a1.sarjEt();

        t1.baglan("wifi1");
        d1.baglan("wifi2");

       

        t1.tasınabilirlikBilgisiGöster();
        t2.tasınabilirlikBilgisiGöster();
        d1.tasınabilirlikBilgisiGöster();
        a1.tasınabilirlikBilgisiGöster();

        double ort=(t1.fiyat + t2.fiyat + d1.fiyat + m1.fiyat + a1.fiyat)/toplamsayı;
        double topagırlık=t1.agırlık + t2.agırlık + d1.agırlık + a1.agırlık;

        System.out.println("Ortalama fiyat: " + ort + " Toplam ağırlık: " + topagırlık);

        t1.kapa();
        t2.kapa();
        d1.kapa();
        a1.kapa();
        m1.kapa();

    }
}
