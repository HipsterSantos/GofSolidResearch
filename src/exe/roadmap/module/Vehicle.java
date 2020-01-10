package exe.roadmap.module;

public class Vehicle {
    private String name;
    private String size;
    private int coutVelocity;
    private int countDirection;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCoutVelocity() {
        return coutVelocity;
    }

    public void setCoutVelocity(int coutVelocity) {
        this.coutVelocity = coutVelocity;
    }

    public int getCountDirection() {
        return countDirection;
    }

    public void setCountDirection(int countDirection) {
        this.countDirection = countDirection;
    }

    public Vehicle(String name, String size){
        this.name =  name;
        this.size = size;
        this.countDirection = 0;
        this.coutVelocity = 0;
    }
    public  void  steer(int direction){
        this.countDirection += direction;
        System.out.println("Vehicle.Steer steering at"+countDirection);
    }
    public  void  move(int direction,int velocity){
        this.countDirection = direction;
        this.coutVelocity = velocity;
        System.out.println("Movie at "+countDirection+" Direction and "+coutVelocity+"velocity");
    }
}
