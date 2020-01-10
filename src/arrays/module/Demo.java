package arrays.module;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placeVisited = new LinkedList<String>();
        placeVisited.add("Sydnay");
        placeVisited.add("Melborne");
        placeVisited.add("Bisbern");
        placeVisited.add("Combra");
        placeVisited.add("Saydnaay");
        placeVisited.add("Saydnaaay");
        placeVisited.add("aaaSydnay");

        printList(placeVisited);
        placeVisited.add(1,"Alice Springs");
        printList(placeVisited);
    }

    private static void printList(LinkedList<String> list){
//        new concept named iterator
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println("Now visititng "+it.next());
        }
        System.out.println("==================================");
    }

    private static void inOrder(LinkedList<String> list,String newCity){
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()) {
      int comp = it.next().compareTo(newCity);
      if(comp == 0){

      }else if(comp>0){
          it.previous();
          it.add(newCity);
      }
        }

    }
}
