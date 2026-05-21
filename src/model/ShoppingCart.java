package model;

import discount.DiscountFactory;
import discount.DiscountStrategy;

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

        DiscountStrategy strategy =
                DiscountFactory.createDiscount(discountType);

        total = strategy.applyDiscount(total);

        System.out.println("toplam ucret: " + total);
    }
}