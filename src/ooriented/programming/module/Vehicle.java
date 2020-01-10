package ooriented.programming.module;

public class Vehicle {
    private static  String name;
    private  static Car  car ;
    private Vehicle _vehicle;
    protected  Vehicle(){
        try {
            System.out.println("Constructor created");
            car = new Car();
        }catch(Exception error){
            System.out.println("Error "+error.getMessage());
        }
    }

    private static  class SampleVehicle{
   private static Vehicle setConstructor(){
       return  new Vehicle();
   }
    }
    public Vehicle get_vehicle(){
        _vehicle = SampleVehicle.setConstructor();
        return _vehicle ;
    }


}
