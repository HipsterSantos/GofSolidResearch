package javafeatures.module;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gear;
    private  int maxGears;
    private int getNumber = 0;

    public Gearbox(int maxgears){
        this.maxGears = maxgears;
        this.gear = new ArrayList<>();
        Gear neutral =   new Gear();
    }

    public class Gear{
        private int gearnumber;
    }

    public interface Iclient{

    }


    public enum EItems{

        EItems(){

        }
    }
}
