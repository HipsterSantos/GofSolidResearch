package Gof.principles.module.observer.pattern.modules;

public class ObserverPatternEX {
    public static void main(String[] args) {
        System.out.println("***Observer Pattern Demo***\n");
        Observer o1 = new Observer();
        Observer o2 = new Observer();
        Observer o3 = new Observer();
        Observer o4 = new Observer();
        Subject sub1 = new Subject();
        sub1.register(o1);
        sub1.register(o2);
        sub1.register(o3);
        sub1.register(o4);
//        dinamically
//        Observer[] obs = {o1,o2,o3,o4};
//        sub1.registerDinamically(obs);
        System.out.println("Setting Flag = 5 ");
//        here the same amount of is the as many as the earlier one
        sub1.setFlag(5);
        System.out.println("Setting Flag = 25 ");
        System.out.println("___________");

        sub1.setFlag(25);
        //        here the same amount of is the as many as the earlier one
        System.out.println("___________");
//        but here we have a different case bwcause one follower left to follower
        sub1.unregister(o1);
        //where we had 4 privious we are gonna get now 4 because one follower left following
        System.out.println("Setting Flag = 50 ");
        sub1.setFlag(50);
    }
}
