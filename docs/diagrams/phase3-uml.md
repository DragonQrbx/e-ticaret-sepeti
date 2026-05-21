

```mermaid
classDiagram

class DiscountStrategy {
    <<interface>>
    +applyDiscount(double total)
}

class TeacherDiscount
class StudentDiscount
class DisabledDiscount

DiscountStrategy <|.. TeacherDiscount
DiscountStrategy <|.. StudentDiscount
DiscountStrategy <|.. DisabledDiscount

class OrderObserver {
    <<interface>>
    +update(String message)
}

class EmailObserver {
    +update(String message)
}

class OrderSubject {
    +addObserver(OrderObserver observer)
    +notifyObservers(String message)
}

OrderObserver <|.. EmailObserver
OrderSubject --> OrderObserver