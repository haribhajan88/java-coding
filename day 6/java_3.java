
import java.util.Scanner;
public class java_3{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);    
        int a =sc.nextInt();
       if (a<0){
        System.out.println("incalid no.");
     System.exit(0);    
    } 
    int count =0;
    int temp =a;
    while(temp >0){
        count++;
        temp =temp/10;
    }
    int [] arr =new int[count];
    for (int i=count; i >0; i--){
        arr[i] =a%10;
        a =a/10;

    }
    int sum =0;
    for (int i=0;i<count; i++){
sum =sum + arr[i];
    }


System.out.println("The sum of all the digits is :"+sum);

}}