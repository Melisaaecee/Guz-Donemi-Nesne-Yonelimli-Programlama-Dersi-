# Guz-Donemi-Nesne-Yonelimli-Programlama-Dersi-
Nesne Yönelimli Programlama dersi kapsamında hazırlanan ödevler ve küçük uygulama örnekleri


Öğrenilen ve Uygulanan Konseptler
1. Temel Nesne Yönelimli Programlama (OOP) Prensipleri

Encapsulation (Kapsülleme):
Sınıf içindeki verilerin private erişim belirleyicileriyle dış dünyadan gizlenmesi, bu verilere kontrollü erişimin ise getter ve setter metodları aracılığıyla sağlanması prensibidir. Bu yaklaşım, veri bütünlüğünü korur, hatalı kullanımı engeller ve sınıf içi değişikliklerin sistemin geri kalanını etkilemeden yapılabilmesine olanak tanır.

Inheritance (Kalıtım):
extends anahtar kelimesi kullanılarak sınıflar arasında hiyerarşik bir yapı kurulmuştur. Bu sayede ortak özellik ve davranışlar üst sınıflarda tanımlanmış, alt sınıflar bu yapıyı devralarak kod tekrarının önüne geçilmiştir. Kalıtım, sistemin genişletilebilirliğini ve bakım kolaylığını önemli ölçüde artırmıştır.

Abstraction (Soyutlama):
abstract sınıflar ve interface yapıları kullanılarak sistemin temel davranışları tanımlanmış, bu davranışların nasıl gerçekleştirileceği alt sınıflara bırakılmıştır. Böylece sistemin karmaşıklığı azaltılmış, yüksek seviyeli tasarım ile düşük seviyeli implementasyon birbirinden ayrılmıştır.

2. İleri Seviye Nesne Yönetimi ve Tip Güvenliği

Polimorfizm (Çok Biçimlilik):
Aynı üst sınıf veya arayüzü kullanan nesnelerin, kendi iç implementasyonlarına göre farklı davranışlar sergilemesi sağlanmıştır. Bu yapı sayesinde kod, somut sınıflara bağımlı olmadan çalışabilmekte ve esnek, genişletilebilir bir mimari elde edilmektedir.

Upcasting:
Alt sınıf nesnelerinin üst sınıf referanslarına atanması yoluyla daha genel ve soyut veri yapıları oluşturulmuştur. Özellikle koleksiyonlar (liste, dizi vb.) üzerinden nesne yönetimi sağlanarak polimorfik kullanım desteklenmiş, kodun esnekliği artırılmıştır.

Downcasting:
Upcasting ile üst sınıf referansına atanmış bir nesnenin, ihtiyaç duyulduğunda kendi özgün alt sınıf tipine geri döndürülmesi sağlanmıştır. Bu işlem, yalnızca alt sınıfa özgü metodlara erişim gerektiğinde kullanılmıştır.

Type Checking (instanceof):
Downcasting işlemleri öncesinde instanceof operatörü kullanılarak nesnenin gerçek tipi kontrol edilmiştir. Bu sayede olası ClassCastException hataları önlenmiş ve çalışma zamanı güvenliği artırılmıştır.


