package model;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<String> productNames = new ArrayList<>();
    ArrayList<Double> productPrices = new ArrayList<>();

    public void addProduct(String name, double price) {

        productNames.add(name);
        productPrices.add(price);

        System.out.println(name + " sepete eklendi");
    }

    public void calculateTotal(String discountType) {

        double total = 0;

        for (double price : productPrices) {
            total += price;
        }

        if (discountType.equals("ogrenci")) {

            total = total * 0.50;
            System.out.println("ogrenci indirimi uygulandi ");

        } else if (discountType.equals("engelli")) {

            total = total * 0.99;
            System.out.println("engelli indirimi uygulandı.");

        }  else {

            System.out.println("gecersiz islem");
        }

        System.out.println("toplam ucret:  " + total);
    }
}