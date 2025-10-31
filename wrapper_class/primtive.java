//Primitive to Wrapper Conversion
//Write a Java program that takes an integer input from the user and:
//● Converts it into an Integer object.
//● Displays the value using both the primitive and object forms.

public class primtive {
 public static void main(String[] args) {
    int num = 42; // Primitive integer
    Integer obj = Integer.valueOf(num); // Converting to Integer object

    // Displaying values
    System.out.println("Primitive value: " + num);
    System.out.println("Wrapper object value: " + obj);
    
 }   
}