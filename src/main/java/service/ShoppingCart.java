package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice(); // Используем геттеры
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double discount = item.getDiscount() / 100;
            total += item.getAmount() * item.getPrice() * (1 - discount); // Используем геттеры
        }
        return total;
    }

    public double getVegetarianTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item instanceof model.Apple) {
                total += item.getAmount() * item.getPrice(); // Используем геттеры
            }
        }
        return total;
    }
}
