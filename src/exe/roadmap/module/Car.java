package exe.roadmap.module;

public class Car extends Vehicle {
private int wheels;
private int doors;
private int gears;
private boolean isManual;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
    }
}
