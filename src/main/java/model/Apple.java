package model;

public class Apple extends Food implements Discountable {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals("red") ? 60 : 0; // скидка для красных яблок
    }
}
