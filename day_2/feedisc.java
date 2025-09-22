public class feedisc {
    public static void main(String[] args) {
        double originalPrice = 1000.0;
        double discountPercentage = 10.0;
        double discountAmount = (discountPercentage / 100) * originalPrice;
        double finalPrice = originalPrice - discountAmount;
        System.out.println("Final fee" + finalPrice);
    }
}
