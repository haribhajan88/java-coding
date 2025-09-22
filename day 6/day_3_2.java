
import java.util.Scanner;

public class day_3_2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int [] arr = new int[a];
    for  (int i =0 ; i<a ;i++){
        arr[i]=sc.nextInt();
    }
    
    for (int i =0; i<a; i++){
        if (arr[i] >17){
            System.out.println(" The student with the age"+arr[i] +"can vote");
        }
        else{
            System.out.println(" The student with the age"+arr[i] +"cannot vote");
        }
    }sc.close();
}}