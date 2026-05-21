package app;

import decorator.BasicCart;
import decorator.CartComponent;
import decorator.GiftWrapDecorator;
import model.ShoppingCart;
import facade.OrderFacade;

public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 50000);
        cart.addProduct("Mouse", 1000);

        //cart.calculateTotal("ogrenci");

        OrderFacade orderFacade = new OrderFacade(cart);
        orderFacade.completeOrder("ogrenci");
        orderFacade.completeOrder("ogretmen");

        CartComponent cartDecorator =
                new GiftWrapDecorator(new BasicCart(1000));

        System.out.println("Decorator toplam fiyat: "
                + cartDecorator.getTotal());
    }
}