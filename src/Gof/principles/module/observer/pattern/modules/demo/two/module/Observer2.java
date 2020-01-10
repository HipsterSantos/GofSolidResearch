package Gof.principles.module.observer.pattern.modules.demo.two.module;

public class Observer2 implements IObserver {
   @Override
    public void update(int in){
        System.out.println("Observer2-- Observes  my value is change to  "+in);
    }
}
