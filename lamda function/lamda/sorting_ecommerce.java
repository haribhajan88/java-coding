package lamda;
// Smart Lighting System using Lambda Expressions
 import java.util.Comparator;
interface Product {
    double getPrice();
    double getRating();
    double getDiscount();
}
public class sorting_ecommerce {
    public static void main(String[] args) {
        // Sample products
        Product product1 = new Product() {
            @Override
            public double getPrice() { return 100.0; }
            @Override
            public double getRating() { return 4.5; }
            @Override
            public double getDiscount() { return 10.0; }
        };
        
        Product product2 = new Product() {
            @Override
            public double getPrice() { return 80.0; }
            @Override
            public double getRating() { return 4.0; }
            @Override
            public double getDiscount() { return 5.0; }
        };
        
        Product product3 = new Product() {
            @Override
            public double getPrice() { return 120.0; }
            @Override
            public double getRating() { return 4.8; }
            @Override
            public double getDiscount() { return 15.0; }
        };

        // Sorting by price
        Comparator<Product> sortByPrice = (Product p1, Product p2) -> Double.compare(p1.getPrice(), p2.getPrice());
        System.out.println("Sorting by Price:");
        System.out.println(sortByPrice.compare(product1, product2)); // Output: > 0 if product1 is more expensive than product2

        // Sorting by rating
        Comparator<Product> sortByRating = (Product p1, Product p2) -> Double.compare(p1.getRating(), p2.getRating());
        System.out.println("Sorting by Rating:");
        System.out.println(sortByRating.compare(product1, product3)); // Output: < 0 if product1 has a lower rating than product3

        // Sorting by discount
        Comparator<Product> sortByDiscount = (Product p1, Product p2) -> Double.compare(p1.getDiscount(), p2.getDiscount());
        System.out.println("Sorting by Discount:");
        System.out.println(sortByDiscount.compare(product2, product3)); // Output: < 0 if product2 has a lower discount than product3
    }
}