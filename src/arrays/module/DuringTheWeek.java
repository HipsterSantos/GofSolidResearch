package arrays.module;

import java.util.Arrays;
import java.util.*;

public class DuringTheWeek {
//    reference arrayy
public static void main(String[] args) {

    int[] option = {1,2,3},
     my = option,
      yours = my;
    String m = "Shopping,Buying,Selling";
    String[] menu = new String[option.length];
    int count = 0;

    for(String item: m.split(",") ){
        System.out.println(m.split(",")[count]);
        count++;
    }

    System.out.println("Value from my "+ Arrays.toString(my)+"\n value from your "+Arrays.toString(yours));
    yours[2] = 233;
    collection(option);
    System.out.println("Value from my "+ Arrays.toString(my)+"\n value from your "+Arrays.toString(yours));

}

 private static int[] collection(int[] array){
    array[1] = 33;
    array[0] = 3211;
    return  array;
 }


}
