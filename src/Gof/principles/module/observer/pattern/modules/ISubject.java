package Gof.principles.module.observer.pattern.modules;

public interface ISubject {
    abstract  void register(Observer observer);
    abstract void unregister(Observer observe);
    abstract void notifyObserver();
}
