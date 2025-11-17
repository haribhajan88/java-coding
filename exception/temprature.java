
class InvalidTemperatureException extends Exception {
    InvalidTemperatureException(String msg) { super(msg); }
}

class Converter {
    void convert(double temp, char unit) throws InvalidTemperatureException {
        if (unit == 'C' && temp < -273.15)
            throw new InvalidTemperatureException("Temperature below absolute zero!");
        if (unit == 'F' && temp < -459.67)
            throw new InvalidTemperatureException("Temperature below absolute zero!");

        if (unit == 'C')
            System.out.println("Fahrenheit: " + (temp * 9/5 + 32));
        else
            System.out.println("Celsius: " + ((temp - 32) * 5/9));
    }
}

public class temprature {
    public static void main(String[] args) {
        Converter c = new Converter();
        try {
            c.convert(-500, 'C'); // Try changing to valid values
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
