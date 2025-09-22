import java.util.Scanner;
import static java.lang.System.out;
public class programmingConsructcs{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);    
        int a =sc.nextInt();
        switch(a){
        case 1:
        out.println("January");
        break;
        case 2:
        out.println("February");
        break;
        case 3:
        out.println("March");
        break;
        case 4:
        out.println("april");
        break;
        case 5:
        out.println("may");
        break;
        default:
        out.println("Invalid month");
    
    }
}}
