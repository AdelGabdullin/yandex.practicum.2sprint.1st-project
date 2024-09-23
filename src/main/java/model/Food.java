package model;

public abstract class Food {
    protected int amount; // количество в кг
    protected double price; // цена за кг

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    // Геттер для поля amount
    public int getAmount() {
        return amount;
    }

    // Геттер для поля price
    public double getPrice() {
        return price;
    }

    public abstract double getDiscount(); // метод для скидки
}
