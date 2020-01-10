package Gof.principles.module.observer.pattern.modules.demo.two.module;

public interface ISubject {
void register(IObserver ob);
void unregister(IObserver ob);
void notifyObservers(int ob);
}
