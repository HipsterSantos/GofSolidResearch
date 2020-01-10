package Gof.principles.module.observer.pattern.modules;

import java.util.ArrayList;

public class Subject implements ISubject {
    private int flag;

    private ArrayList<Observer> observerList = new ArrayList<Observer>();
    public Subject(){}

    public int getFlag(){
        return this.flag;
    }
    public void setFlag(int flagV){
        flag = flagV;
        notifyObserver();
    }
    public void registerDinamically(Observer[] obs){
        for(int i = 0;i<obs.length; i++){
            observerList.add(obs[i]);
        }
    }
    @Override
    public void notifyObserver() {
    for(int i = 0 ; i < observerList.size(); i++){
        observerList.get(i).update();
    }

    }
    @Override
    public void register(Observer obs){
    observerList.add(obs);
    }
    @Override
    public void unregister(Observer obs){
    observerList.remove(obs);
    }

}
