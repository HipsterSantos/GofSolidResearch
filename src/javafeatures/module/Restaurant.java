package javafeatures.module;

public class Restaurant {
private String name;
private Address address;

public Restaurant(String ResName,Address address){
    this.name = ResName;
    this.address = address;
}
public interface Address{
 public static String neighborhood (String neiboorHood){
     return neiboorHood;
 }
 public static String street(String yourStreet){
     return yourStreet;
 }

}

}
