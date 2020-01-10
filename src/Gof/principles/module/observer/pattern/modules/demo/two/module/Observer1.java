package Gof.principles.module.observer.pattern.modules.demo.two.module;

public class Observer1 implements IObserver {
@Override
    public void update(int in){
    System.out.println("Observer1 my value is now "+in);
    }
}
