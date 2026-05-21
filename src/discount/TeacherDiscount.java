package discount;

public class TeacherDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double total) {
        System.out.println("ogretmen indirimi uygulandi");
        return total * 0.80;
    }
}