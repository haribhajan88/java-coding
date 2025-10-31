public class shooping_card {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "99", "abc", "150"};
        int totalPrice = 0;

        for (String price : prices) {
            try {
                int numericPrice = Integer.parseInt(price);
                totalPrice += numericPrice;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price encountered: " + price);
            }
        }

        System.out.println("Total Price: " + totalPrice);
    }
}