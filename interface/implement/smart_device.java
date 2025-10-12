package implement;

interface SmartDeviceControl {
    void turnOn();
    void turnOff();
}   
class SmartLight implements SmartDeviceControl {
    @Override
    public void turnOn() {
        System.out.println("Smart Light is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Light is turned OFF");
    }
}
class SmartAC implements SmartDeviceControl {
    @Override
    public void turnOn() {
        System.out.println("Smart AC is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart AC is turned OFF");
    }
}
class SmartTV implements SmartDeviceControl {
    @Override
    public void turnOn() {
        System.out.println("Smart TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is turned OFF");
    }
}
public class smart_device {
    public static void main(String[] args) {
        SmartDeviceControl light = new SmartLight();
        SmartDeviceControl ac = new SmartAC();
        SmartDeviceControl tv = new SmartTV();

        light.turnOn();
        light.turnOff();

        ac.turnOn();
        ac.turnOff();

        tv.turnOn();
        tv.turnOff();
    }
}
