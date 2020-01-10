package Gof.principles.module.singleton.pattern.module;

public class CricketTeam {
    private static String teamName;
    private CricketTeam captain = null;
//    eager initialization

    private CricketTeam _captain = new CricketTeam(teamName);
    private CricketTeam(String name){
        teamName = name;
    }
//    lazy initialization
    public CricketTeam chooseCaptain(String name){
        if(captain == null){
            captain = new CricketTeam(name);
        }
        else{
            return captain;
        }
        return captain;
    }
//   eager initialization
    public CricketTeam getCaptain(){
        return _captain;
    }

//    Bill Puch approach
    private static class SingletonHelper{
        private static final CricketTeam cap = new CricketTeam(CricketTeam.teamName);
     }
     public CricketTeam Pugh(){
        return SingletonHelper.cap;
    }
}
