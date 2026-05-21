
```mermaid
classDiagram

class ShoppingCart
class DiscountFactory
class DiscountStrategy
class StudentDiscount
class DisabledDiscount
class NoDiscount

ShoppingCart --> DiscountFactory
ShoppingCart --> DiscountStrategy

DiscountStrategy <|.. StudentDiscount
DiscountStrategy <|.. DisabledDiscount
DiscountStrategy <|.. NoDiscount