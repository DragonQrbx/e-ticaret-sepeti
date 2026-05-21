D (E-ticaret sepeti) secme nedenim bana yapılması ve gelistirmesi daha kolay geldi.e ticaretede merakım var biraz belki ileride de isime yarar diye dusundum.ozel basım tisort yapıp kendi sitesinde satan bir arkadasım vardı ondan dolayıda merakımı cezbetti bu nedenlede ileride isime yarabilecek bir sistemde calısmak ıstedım.



Bu proje Yazılım Tasarım Örüntüleri dersi kapsamında geliştirilmiştir.

Başlangıçta tasarım problemleri içeren basit bir e-ticaret sepet sistemi oluşturulmuştur.  
Daha sonra sistem tasarım örüntüleri kullanılarak fazlar halinde geliştirilmiştir.

---

## Kullanılan Tasarım Örüntüleri

### Phase 1
- Strategy Pattern
- Factory Method

### Phase 2
- Decorator Pattern
- Facade Pattern

### Phase 3
- Observer Pattern

---

## Open/Closed Principle (OCP)

Sisteme `TeacherDiscount` davranışı eklenmiştir.  
Bu işlem sırasında mevcut `ShoppingCart` yapısı değiştirilmeden sistem genişletilmiştir.

---

## UML Diyagramları

UML diyagramları:
- docs/diagrams klasörü altında bulunmaktadır.

---

## Projeyi Çalıştırma

1. Projeyi klonlayın
2. Java IDE ile açın
3. Main.java dosyasını çalıştırın

---

## Repository Yapısı

```txt
src/
 ├── app
 ├── model
 ├── discount
 ├── decorator
 ├── facade
 └── observer

