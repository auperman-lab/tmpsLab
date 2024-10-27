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
* Abstract Factory - Dependency Inversion Principle


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

###  Interface Segregation Principle

- **ITechnicalTimeMachine**  is an interface related to `ITimeMachine` and thus doesn't force the client to implement methods it doesnt use


```java

public class TechnicalTimeMachine implements ITechnicalTimeMachine, ITimeMachine {}

```
```java
public interface ITimeMachine {
    String getVehicleName();
    String getModel();
    String getManufacturer();
    int getYearOfManufacture();
}


public interface ITechnicalTimeMachine {
    String getMotorModel();
}

```

### Dependency Inversion Principle

- **Booking** class instead of directly addressing `Traveler` class, it depends on abstraction of this class


```java
 public Booking(String bookingId, ITraveler traveler, ITimePeriod timePeriod, LocalDateTime bookingDateTime, double totalPrice) {
        this.bookingId = bookingId;
        this.traveler = traveler;//Dependency Inversion Principle
        this.timePeriod = timePeriod; 
        this.bookingDateTime = bookingDateTime;
        this.totalPrice = totalPrice;
    }

```

## Conclusions / Screenshots / Results



In this lab, I  applied SOLID principles, enhancing code maintainability and flexibility. By enforcing single
responsibility, segregating interfaces, and utilizing dependency inversion, I created a  time-travel booking system what
can grow and adapt to demand. These practices promote cleaner code, easier updates, and a scalable architecture, equipping
us for future software development challenges.