
class OutOfStockException extends Exception {
    OutOfStockException(String msg) { super(msg); }
}
class PaymentFailedException extends Exception {
    PaymentFailedException(String msg) { super(msg); }
}

class Order {
    void placeOrder() throws OutOfStockException, PaymentFailedException {
        int status = (int)(Math.random() * 3); // 0, 1, or 2
        if (status == 0) throw new OutOfStockException("Product is out of stock!");
        if (status == 1) throw new PaymentFailedException("Payment failed!");
        System.out.println("Order placed successfully!");
    }
}

public class order {
    public static void main(String[] args) {
        Order order = new Order();
        try {
            order.placeOrder();
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}