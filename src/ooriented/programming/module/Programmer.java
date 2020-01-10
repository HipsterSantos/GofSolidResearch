package ooriented.programming.module;

public class Programmer extends Employee{
   private String[] programmingLanguage;
    public void writeCode(){

    }
   public String getName(){
        name ="hello bini";
       return super.name;
   }
    private void accessBaseClassMembers(){
        name = "Programmer";
        super.name = "";
    }
}
