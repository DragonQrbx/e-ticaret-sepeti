package facade;

import model.ShoppingCart;

public class OrderFacade {

    private ShoppingCart cart;

    public OrderFacade(ShoppingCart cart) {
        this.cart = cart;
    }

    public void completeOrder(String discountType) {

        System.out.println("Siparis islemi baslatildi.");

        cart.calculateTotal(discountType);

        System.out.println("Odeme islemi tamamlandi.");
        System.out.println("Siparis basariyla olusturuldu.");
    }
}