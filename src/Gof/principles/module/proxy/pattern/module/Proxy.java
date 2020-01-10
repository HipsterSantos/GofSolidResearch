package Gof.principles.module.proxy.pattern.module;

public class Proxy extends Subject {
    //pre-adding lazy initialization to ConcretSubject
    ConcreteSubject concrete;
    @Override
    public void doSomeWork(){
    System.out.println("Proxy happing here");
    if (concrete == null){
        concrete = new ConcreteSubject();
    }
    concrete.doSomeWork();
        }
}
