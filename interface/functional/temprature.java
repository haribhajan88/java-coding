package functional;
import java.util.function.Predicate;

public class temprature {
    public static void main(String[] args) {
        Predicate<Double> isHighTemperature = temp -> temp > 30.0;

        double currentTemperature = 32.5;

        if (isHighTemperature.test(currentTemperature)) {
            System.out.println("Alert: Current temperature: " + currentTemperature + "°C");
        } else {
            System.out.println("Temperature is normal: " + currentTemperature + "°C");
        }
    }
}
