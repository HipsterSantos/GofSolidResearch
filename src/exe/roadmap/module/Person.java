package exe.roadmap.module;

import java.util.ArrayList;

public abstract class Person {
    protected String name;
    private int age;
    private String address;
    private String phoneNumber;

    public Person(String name, int age,String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Person(){

    }

    protected abstract void calling();
    public abstract void humanNeeds();

    public void SaymyName(){
        System.out.println("Hey sup "+name);
    }

}
