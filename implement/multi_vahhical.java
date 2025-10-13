package implement;
interface Vehicle {
    void rent();
    void returnVehicle();
}
 class Car implements Vehicle {
    @Override
    public void rent() {
        System.out.println("Car rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car returned");
    }
}
 class Bike implements Vehicle {
    @Override
    public void rent() {
        System.out.println("Bike rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}
 class Buses implements Vehicle {
    @Override
    public void rent() {
        System.out.println("buses rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("buses returned");
    }
}
public class multi_vahhical{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Buses();

        car.rent();
        car.returnVehicle();

        bike.rent();
        bike.returnVehicle();

        bus.rent();
        bus.returnVehicle();
    }
}
