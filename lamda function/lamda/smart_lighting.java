package lamda;
// like this type // (int a, int b) -> a + b
interface Light {
    void turnOn();
    void turnOff();
    void setBrightness(int level);
}
public class smart_lighting {
    public static void main(String[] args) {
        // Lambda expression to implement the turnOn method of Light interface
        Light livingRoomLight = new Light() {
            @Override
            public void turnOn() {
                System.out.println("Living Room Light is ON");
            }

            @Override
            public void turnOff() {
                System.out.println("Living Room Light is OFF");
            }

            @Override
            public void setBrightness(int level) {
                System.out.println("Living Room Light brightness set to " + level + "%");
            }
        };

        // Using the light object
        livingRoomLight.turnOn();
        livingRoomLight.setBrightness(75);
        livingRoomLight.turnOff();

        // Another example with different implementation
        Light bedroomLight = new Light() {
            @Override
            public void turnOn() {
                System.out.println("Bedroom Light is ON");
            }

            @Override
            public void turnOff() {
                System.out.println("Bedroom Light is OFF");
            }

            @Override
            public void setBrightness(int level) {
                System.out.println("Bedroom Light brightness set to " + level + "%");
            }
        };

        // Using the bedroom light object
        bedroomLight.turnOn();
        bedroomLight.setBrightness(50);
        bedroomLight.turnOff();
    }
}