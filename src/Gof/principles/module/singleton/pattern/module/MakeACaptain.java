package Gof.principles.module.singleton.pattern.module;

public class MakeACaptain {
    private static MakeACaptain _caption;
    public int age;
    private MakeACaptain(){ }
    public static MakeACaptain getCaptain(){
        if(_caption == null){
            _caption =  new MakeACaptain();
            System.out.println("New Caption Selected for our Team now!");
        }else{
            System.out.println("Sorry about that bus you guys already have a team captain");
            System.out.println("You guys can send him for the toss");
        }
        return _caption;
    }
}
