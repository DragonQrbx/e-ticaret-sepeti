package decorator;

public class GiftWrapDecorator implements CartComponent {

    private CartComponent cart;

    public GiftWrapDecorator(CartComponent cart) {
        this.cart = cart;
    }

    @Override
    public double getTotal() {

        System.out.println("Hediye paketi eklendi");

        return cart.getTotal() + 50;
    }
}