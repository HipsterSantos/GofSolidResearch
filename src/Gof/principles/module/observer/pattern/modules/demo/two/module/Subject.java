package Gof.principles.module.observer.pattern.modules.demo.two.module;

import java.util.ArrayList;
import java.util.List;

public class Subject implements  ISubject{
    private int myValue;
  private List<IObserver> observerList =  new ArrayList<IObserver>();
    public void setMyValue(int value){
        myValue = value;
        notifyObservers(value);
    }
    public int getMyValue(){
        return  myValue;
    }

    @Override
    public void register(IObserver ob) {
        observerList.add(ob);
    }
    @Override
    public void unregister(IObserver ob) {
        observerList.remove(ob);
    }
    @Override
    public void notifyObservers(int ob) {
  for (int i = 0; i<observerList.size();i++){
    observerList.get(i).update(ob);
  }
    }
}
