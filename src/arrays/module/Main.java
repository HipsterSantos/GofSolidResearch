package arrays.module;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public Main(){
        System.out.println("Builder called");
    }

    
    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5,2,3,4,3};
        int[] collect = myCollection(5);

        System.out.println();
//        myIntArray[0] = 12;
//        myIntArray[1] = 122;
//        myIntArray[2] = 11;
//        myIntArray[3] = 122;
//         myInt(collect);
//        GroceryList listOfItems = new GroceryList();
//        listOfItems.AddGroceryItem("Butter");
//        listOfItems.AddGroceryItem("Peanut");
//        listOfItems.AddGroceryItem("Cheese");
//        listOfItems.AddGroceryItem("Avocado");
////        new ArrayList<GroceryList>();
//        listOfItems.PrintGroceryElements();
//        listOfItems.RemoveGroceryItem(3);
//        listOfItems.PrintGroceryElements();
////        System.out.println(myIntArray[2]);
    }
    public static int[] myCollection(int numberOfElemenets){
        System.out.println("elementes ("+numberOfElemenets+") \r");
        int[] valeus = new int[numberOfElemenets];
        for(int a = 0; a < numberOfElemenets ; a++){
            valeus[a] =  input.nextInt();
        }
        System.out.println("Entered "+input.toString());
        return valeus;

    }

    public static void myInt(int[] value){
        for( int a = 0 ; a < value.length; a++){
            System.out.println("Element ("+a+") on position ("+value[a]+")");
        }
    }


}
