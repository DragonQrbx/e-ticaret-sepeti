PHASE-1 
kullanılan tasarım oruntuleri strategy pattern ve factory method.Strategy pattern indirim hesaplamaları ıcın kullandım.cunku ıf else yapılarılarından kurtulmam gerekıyordu bunun ıcın ındırım hesaplamalarının hepsi icin ayrı sınıf olusturdum ve bundan sonrası ıcın yenı ındırım tanımlayacagımda yenı bır ındırım sınıfı olusturacam buda kodu daha gelıstırılebılırt kılacak(gelıstırılebılırlık kazndırdı).Factory method kısmında aı yardımcı oldu bunu kullanma nenedım shoppıngcart sınıfındakı fazla sorumlulugu almak ve nesne olustururken shoppıngcart sınıfına olan bagımlılıgı azaltmak ıcın.bu sayede kod daha esnek oldu , daha okunabılırlık kazndırdı.

PHASE-2
 shoppıncart sınıfını degıstırmeden sepete yeni ozellık eklemek ıstedigımm gıftwrapdecorator decorator pattern kullandım .basiccart nesnesini sarmalayarak sepete hedıye ucretı ekledım.shoppıng cart yapısını bozmadan yenı ozellık ekleyebıldım.

 orderfacade sınıfında facade pattern kullandım sıparıs tamamlama ıslemı bırden fazla adımda surerken tek bır sınıf uzerınden yonetmek icin kullandım bu sayede daha karmasık ıslemler yapmadan sıparıs olusturma kısmı daha sade hale geldı.

 PHASE-3
 obSERVER PATTERN OrderSubject ve EmailObserver sınıflarında kullanıldı kullanılma nedei siparıs olusturuldugunda musteriye bildirim gondermek.kazandırdıkları ise yeni bildirimler kolayca sisteme eklenebilir hale geldi.

 yeni TeacherDiscount sınıfı olusturarak sistemin gelismeye acık oldugunu gosterdim  ve open-closed ilkesini sagladıjm yeni davranıs ekledım  yanı sıtemı genıslettım ama shoppıncart sınıfında degısıklık yapmadım ve mevcut yapıyı kordum.