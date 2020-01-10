package ooriented.programming.module;

public enum ResourceType {
    rone(1),
    rtwo(2);
    ResourceType(int value){
        this.con = 10;
    }
    private int con =10;
    public int set(){
        return  con;
    }
}
