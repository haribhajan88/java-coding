package lamda;
// (int a, int b) -> a + b
    interface Addable {
        int add(int a, int b);
    }
    public class lamda {
        public static void main(String[] args) {
            // Lambda expression to implement the add method of Addable interface
            Addable ad1 = (a, b) -> a + b;
            System.out.println("Sum: " + ad1.add(10, 20));

            // Another example with different implementation
            Addable ad2 = (x, y) -> x * y;
            System.out.println("Product: " + ad2.add(10, 20));
        }
    }