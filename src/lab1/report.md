# Creational Design Patterns

## Author: Danu Macrii

----

## Objectives:
* Study and understand the Creational Design Patterns.
* Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
* Use some creational design patterns for object instantiation in a sample project.

## Used Design Patterns:
* Singleton - restricts the instantiation of a class to a singular instance
* Builder - separates the construction of a complex object from its representation
* Abstract Factory - create families of related objects without imposing their concrete classes
* Prototype - create prototypical instance, which is cloned to produce new objects


## Implementation

### Singleton

```java
public static FoodComboDelivery getInstance() {
    FoodComboDelivery foodComboDelivery = instance;
    if (foodComboDelivery == null) {
        synchronized (FoodComboDelivery.class) {
            foodComboDelivery = instance;
            if (foodComboDelivery == null) {
                instance = new FoodComboDelivery();
            }
        }
    }
    return instance;
}
```

###  Builder


```java
public interface CocktailBuilder {
    CocktailBuilder setPrice(int price);
    CocktailBuilder setName(String name);
    CocktailBuilder setQuantity(float quantity);
    Cocktail build();
}

```


### Abstract Factory

```java

public abstract class Order {
    ...

    public abstract Dish createDish();
    public abstract Cocktail createCocktail();
}

```

```java
public class PlacinteOrder extends Order {
    @Override
    public Dish createDish() {
        return new PlacinteDishBuilder()
                .setPrice(80)
                .setName("Placinta cu cascaval")
                .setIngredient1("placinta")
                .setIngredient2("cascaval")
                .build();
    }

    @Override
    public Cocktail createCocktail() {
        return new PlacinteCocktailBuilder()
                .setPrice(12)
                .setName("Wine")
                .setQuantity(0.5f)
                .build();
    }
}

```

## Conclusions / Screenshots / Results


