package collection.module;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        int lastRow = 'A'+( num -1);
//        here a value has 65 as code
        char el = 65;

        System.out.println("Last row value  "+lastRow+"\n  char leller "+el);
        for(char row = 'A';row <= lastRow ;row++){
            System.out.println("printing row char = "+row+" row value "+lastRow);
        }
    }
}
