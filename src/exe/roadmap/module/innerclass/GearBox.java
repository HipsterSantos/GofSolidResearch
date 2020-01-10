package exe.roadmap.module.innerclass;

import java.util.ArrayList;

public class GearBox {
 private ArrayList<Gear> gears;
 private int maxgears;
 private int gearNumbers;

    public GearBox(int maxgears) {
        this.maxgears = maxgears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        gears.add(neutral);
    }

    public GearBox() {

    }

    public class Gear{
        private int gearNumber;
        private double ratio ;

        public Gear(int gearNumber,double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double fastDrive(float ravs){
            return ravs * (this.ratio);
        }
    }

    public class LittlGear{
        public String name ;
        private LittlGear gear = null;
        public LittlGear condtructor(){
         if (gear == null){
            gear = new LittlGear();
            return gear;
         }
         else{
             return gear;
         }
        }
    }
}
