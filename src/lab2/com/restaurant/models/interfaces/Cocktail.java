package lab2.com.restaurant.models.interfaces;

public interface Cocktail  extends Prototype {
     String getName();
     double getPrice();
     float getServingSize();
     Cocktail clone();
}