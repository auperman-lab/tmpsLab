package lab1.com.restaurant.models;

import lab1.com.restaurant.models.interfaces.Cocktail;

public class PlacinteCocktail implements Cocktail {

    private final int price;
    private final String name;
    private final float quantity;


    public PlacinteCocktail(int price, String name, float quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public float getServingSize() {
        return quantity;
    }

}
