package lab120122;

public class Lamp {
    // stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;
    void turnOn() {
        this.isOn = true;
    }
    void turnOff(){
        this.isOn = false;
    }

    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();
        System.out.println("Light is ON? " + led.isOn);

        halogen.turnOff();
        System.out.println("Light is ON? " + halogen.isOn);
    }
}
