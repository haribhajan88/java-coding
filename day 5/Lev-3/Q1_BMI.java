
import java.util.Scanner;

public class Q1_BMI {

    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0;
            double bmi = weight / (heightM * heightM);
            result[i][0] = String.valueOf(heightM*100);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = bmiStatus(bmi);
        }
        return result;
    }

    public static void display(String[][] table) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (String[] row: table) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) of person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] res = calculateBMI(data);
        display(res);
        sc.close();
    }
}
