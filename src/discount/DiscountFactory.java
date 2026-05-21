package discount;

public class DiscountFactory {

    public static DiscountStrategy createDiscount(String type) {

        if(type.equals("ogrenci")) {
            return new StudentDiscount();
        }

        else if(type.equals("engelli")) {
            return new DisabledDiscount();
        }

        else if(type.equals("ogretmen")) {
            return new TeacherDiscount();
        }

        return new NoDiscount();
    }
}