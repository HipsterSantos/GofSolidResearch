package arrays.module;
import java.util.Scanner;
public class MinimumElement {

    private static Scanner scnanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter couunt");
        int count = scnanner.nextInt();
        scnanner.nextLine();
//        int[] returnedArray = readInteger(count);
//        int returnedInt = findMind(returnedArray);
//        System.out.println("Min: "+returnedInt);
        System.out.println(Integer.MAX_VALUE);
    }

    private static int[] readInteger(int count){
        int[] array = new int[count];
        for( int i = 0; i<array.length;i++){
            System.out.println("Enter a Number");
            int number = scnanner.nextInt();
            scnanner.nextLine();
            array[i] = number;
        }
        return  array;
    }

    private static int findMind(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<array.length;i++){
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        return min;
    }
}
