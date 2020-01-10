package ooriented.programming.module;

public class Main {
    public static void main(String[] args){
        GearBox mcLauren = new GearBox(12);
        GearBox.Gear first = mcLauren.new Gear(12,2);
        first.driveSpeed(82);

        System.out.println("Hey");
    }
}
