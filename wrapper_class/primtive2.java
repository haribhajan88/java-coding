// Wrapper to Primitive Conversion
// Given a Double object with a value of 45.67,
// convert it into primitive types:
// ● double
// 
// ● int (using casting)
// ● Print all the values.
public class primtive2 {
    public static void main(String[] args) {
        Double dObj = Double.valueOf(45.67);

        // Converting to primitive types
        double dPrimitive = dObj.doubleValue();
        int iPrimitive = (int) dObj.doubleValue(); // Casting to int

        // Printing the values
        System.out.println("Double primitive value: " + dPrimitive);
        System.out.println("Integer primitive value (after casting): " + iPrimitive);
    }
}
