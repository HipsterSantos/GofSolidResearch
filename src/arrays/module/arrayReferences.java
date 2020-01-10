package arrays.module;

import java.util.Arrays;

public class arrayReferences {
    public static void main(String[] args) {
        int myInvalue = 10,
            myAnotherValue = myInvalue;
        System.out.println("my int value on early:  "+myInvalue);
        System.out.println("my int value on later:  "+myAnotherValue);
        myAnotherValue++;
        System.out.println("\n\nmy int value on early:  "+myInvalue);
        System.out.println("my int value on later:  "+myAnotherValue);

        System.out.println("Now making the same idea using references from objects");

        int[] myIntArray = new int[5] , myAnotherInArray = myIntArray;
        System.out.println("\n\nmy int Array value on early:  "+ Arrays.toString( myIntArray ) );
        System.out.println("my int Array value on later:  "+ Arrays.toString( myAnotherInArray ) );

        myAnotherInArray[0] = 1 ;
        System.out.println("\n\nmy int Array value on early:  "+ Arrays.toString( myIntArray ) );
        System.out.println("my int Array value on later:  "+ Arrays.toString( myAnotherInArray ) );
    }
}
