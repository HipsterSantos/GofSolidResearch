package arrays.module;

public class arraytastkone {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        int index =  myArray.length -1;
//        privious sorting descending
        ShowLoop(myArray);

        for(int count = 0; count < myArray.length; count++ ){

            myArray[count] = myArray[index--];
        }
//        after sorting  in descendi
        ShowLoop(myArray);

    }

    public static  void ShowLoop(int[] collect){
        for(int count = 0; count < collect.length; count++ ){

            System.out.println("Position ("+count+") "+collect[count]);
        }
    }
}
