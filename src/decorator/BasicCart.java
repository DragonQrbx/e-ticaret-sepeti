package decorator;

public class BasicCart implements CartComponent {

    private double total;

    public BasicCart(double total) {
        this.total = total;
    }

    @Override
    public double getTotal() {
        return total;
    }
}