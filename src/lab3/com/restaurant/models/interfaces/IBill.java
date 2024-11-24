package lab3.com.restaurant.models.interfaces;

import lab3.com.restaurant.order.OrderResult;

import java.util.List;

public interface IBill {
    String printBill(List<OrderResult> orders);
}
