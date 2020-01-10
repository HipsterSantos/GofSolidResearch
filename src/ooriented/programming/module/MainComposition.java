package ooriented.programming.module;

public class MainComposition {
    public static void main(String[] args) {
        System.out.println("======Singleton pattern and Using Composition======\n");
        Car teslaa = new Car();
        teslaa.get_vehicle().get_vehicle().get_vehicle();
    }
}
