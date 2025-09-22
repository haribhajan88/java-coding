import java.util.Scanner;
import static java.lang.System.out;
public class programmingConsructcs{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);    
        /* *Create a calculator using switch that takes two numbers and an
         operator (+, -, , /) as input and performs the operation.*/
        // int a =sc.nextInt();
        // int b =sc.nextInt();
        // char op = sc.next().charAt(0);
        // switch(op){
        // case '+':
        // out.println(a+b);
        // break;
        // csase "-":
        // out.println(a-b);
        // break;
        // case "*":
        // out.println(a*b);
        // break;
        // case "/":
        // out.println(a/b);
        // break;
        // default:
        // out.println("Invalid operator");
       
    /*Write a program that uses switch to print the number of
     days in a given month (1–12), assuming non-leap year. */
    // int month =sc.nextInt();
    // switch(month){
    //     case 1,3,5,7,8,10,12:
    //     out.println("31 days");
    //     break;
    //     case 4,6,9,11:
    //     out.println("30 days");
    //     break;
    //     case 2:
    //     out.println("28 days");
    //     break;
    //     default:
    //     out.println("Invalid month");
    
    /*Using switch, write a program to determine if a
     character is a vowel or consonant */
    // int ch =`sc.next().charAt(0);
    // switch(ch){
    //     case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
    //         out.println("Vowel");
    //         break;
    //     default:
    //         if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
    //             out.println("Consonant");
    //         } else {
    //             out.println("Invalid character");
    //         }
    // int year = sc.nextInt();
    // switch(year % 4){
    //     case 0:
    //     out.println("Leap year");
    //     break;
    //     default:
    //     out.println("Not a leap year");
    /*Write a program that asks the user to enter a number until they enter a negative number, 
    then print the sum of all entered positive numbers. */
    int sum = 0;
    while(true){
        int num = sc.nextInt();
        if(num < 0){
            break;
        }
        sum += num;
    }
    out.println("Sum of positive numbers: " + sum);
    
}
}}
