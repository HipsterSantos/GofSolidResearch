package arrays.module;
import java.util.*;

public class GroceryList {
private ArrayList<String> groceryList = new ArrayList<String>();
public void AddGroceryItem(String item){
    groceryList.add(item);
}
public void PrintGroceryElements(){
for(String items: groceryList){
    System.out.println(items);
}
}

public void RemoveGroceryItem(int position){
    groceryList.remove(position);
    System.out.println(Arrays.toString(groceryList.toArray()));
}

}
