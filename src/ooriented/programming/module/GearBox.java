package ooriented.programming.module;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int guerNumber;

    public GearBox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    class Gear{
        private int gearNumber;
        private double ratio;
        public Gear(int gearnumber, double ration){
        this.gearNumber = gearnumber;
        this.ratio = ration;
        }

        public double driveSpeed(int revs){
            return revs * (this.ratio);
        }
    }

}
