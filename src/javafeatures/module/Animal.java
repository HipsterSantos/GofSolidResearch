package javafeatures.module;

public class Animal {
    private String name;
    public String owner;
    public Animal(Animal name, Animal owner){
        this.name = this.getName();
        this.owner = this.getOwner();
    }
    public String getName(){
        return this.name;
    }
    public String getOwner(){
        return  this.owner;
    }
    public void walk(){
        System.out.println("Started walking a bit");
    }


}
