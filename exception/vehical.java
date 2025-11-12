package exception;

class ServiceOverdueException extends Exception {
    ServiceOverdueException(String msg) { super(msg); }
}
class InvalidMileageException extends Exception {
    InvalidMileageException(String msg) { super(msg); }
}

class Vehicle {
    void checkMaintenance(String date, int mileage) throws ServiceOverdueException, InvalidMileageException {
        if (date.equals("2023-01-01")) throw new ServiceOverdueException("Service date is overdue!");
        if (mileage < 0) throw new InvalidMileageException("Mileage can't be negative!");
        System.out.println("Vehicle is fine.");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        try {
            v.checkMaintenance("2023-01-01", -100); // Try changing values to test
        } catch (ServiceOverdueException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidMileageException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}