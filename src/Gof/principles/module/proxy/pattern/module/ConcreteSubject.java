package Gof.principles.module.proxy.pattern.module;

public class ConcreteSubject  extends Subject{
    @Override
    public void doSomeWork(){
        System.out.println("Concret subject doing somework");
    }
}
