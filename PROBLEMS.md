benim gordugum pronlemler cok fazla if-else yapısı var ve bunu duzenlemek ileride mumkun olmayacak yeni indirim ekleme durumunda mevcut kodu sureklı degıstırmek gerekecek.open-closed prensibinede uymuyor cunku sistem genısletılmeye uygun deıl yenı ındırımde sınıfı degıstırmek gerekıyor.shoppıng cart sınıfına cok fazla ozellık veriliyor bunların ayrılması lazım SRP ye uymuyor.benım gorduklerim bunlar 

AI tarafından verilen cevap

1. Uzun if-else Kullanımı Çözüm
Strategy Design Pattern kullanılabilir.  
Her indirim türü ayrı bir sınıfta tanımlanarak sistem daha esnek hale getirilebilir.

2. ShoppingCart Sınıfının Fazla Sorumluluk Alması
`ShoppingCart` sınıfı:
- ürün ekleme,
- toplam hesaplama,
- indirim uygulama,
- ekrana çıktı verme

işlemlerinin hepsini yapmaktadır. Bu durum Single Responsibility Principle ilkesine aykırıdır.

### Çözüm
İndirim işlemleri ayrı strateji sınıflarına taşınabilir.  
Ekrana çıktı verme işlemleri farklı bir katmanda yönetilebilir.

## 3. String ile İndirim Kontrolü
İndirim türleri `"ogrenci"` ve `"engelli"` gibi String ifadeler ile kontrol edilmektedir.

Bu yöntem:
- yazım hatalarına açıktır,
- güvenilir değildir,
- bakım maliyetini artırır.

### Çözüm
Enum yapısı veya Factory Pattern kullanılabilir.

5.Sabit Değerlerin Kod İçine Yazılması

İndirim oranları doğrudan kod içine yazılmıştır.

total = total * 0.50;
total = total * 0.99;

Bu durum kodun bakımını zorlaştırır.

Çözüm

İndirim oranları ayrı sınıflarda veya yapılandırma dosyalarında tutulabilir.

6. Hesaplama ve Ekrana Yazdırmanın Aynı Metotta Yapılması

calculateTotal() metodu hem hesaplama yapmakta hem de System.out.println() ile çıktı vermektedir.

Bu durum test edilebilirliği azaltır.

Çözüm

Hesaplama işlemleri ile kullanıcı arayüzü işlemleri ayrılmalıdır.
MVC yaklaşımı uygulanabilir.

Aı ile kendi cevabımı karsılastırdıgım zaman sunu gordum sorunu az cok algıladıgımı ama cozmek ıcın ne kullanacagımı tam kesınlestıremedıgımı farketttım.Indırımlerınde ayrı tutulması gerekecegını akıl edemedım.6.kısımdakı problemi farkedemedım  ve sorunu cozmeyi dusundugumde nasıl cozerim diye bulamadım MVC yaklasımı aklıma gelmemısti.