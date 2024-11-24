package lab3.com.restaurant.models.interfaces;

public interface Dish extends Prototype {
     String getName();
     double getPrice();
     void prepare();
     Dish clone();
}