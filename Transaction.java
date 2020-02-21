import java.util.HashMap;

public class Transaction {

    // TODO: Need to put auto-incrementing transaction number

    public Transaction(OrderType orderType, int tableNumber) {
        this.orderType = orderType;
        this.tableNumber = tableNumber;
    }
    
    public addOrder(Food foodItem) {
        // If a food item has already been ordered, just 
        // add +1 to the current quantity
        if (orders.containsKey(foodItem)) {
            orders.put(foodItem, orders.get(foodItem) + 1);
        } else {
            orders.put(foodItem, 1);
        }
    }

    public OrderType getOrderType() {
        return orderType;
    } 

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getOrders() {
        return orders;
    }

    private OrderType orderType;
    private int transactionNumber;
    private int tableNumber;
    private HashMap<Food, int> orders;
}