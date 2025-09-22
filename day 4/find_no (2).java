
import java.util.Scanner;

public class find_no{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  arr[] = {10,20,30,40,50};
        int count =0;
        int find =sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if (arr[i]==30){
                System.out.println( find+" found at index: "+i);
                count++;
                
            
            }
        }
        if (count !=1){System.out.println(find +" not found");}
    sc.close();
}
}