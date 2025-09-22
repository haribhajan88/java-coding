
import java.util.Scanner;

public class day_3_3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
int arr[]= new int [5];
for (int i=0; i<5; i++){
    arr[i] =sc.nextInt();}
for (int i=0; i<5; i++){
    if(arr[i]%2 ==0){System.out.println("even");}
    else {System.out.println("odd");}}
    System.out.println("");
    System.out.println("");
for (int i =0 ;i<5; i++){
    if (arr[i] ==0){System.out.println(arr[i]+" is equal to 0");}
else if (arr[i] <0){System.out.println(arr[i]+" is negative");}}
    if (arr[0]<arr[4]){System.out.println(arr[0]+" is greater then "+arr[4]);}
    else if (arr[0]>arr[4]){System.out.println(arr[4]+" is greater then "+arr[0]);}
    else {System.out.println(arr[0]+" is equal to "+arr[4]);}


}}
