package javafeatures.module.Generics;

import java.util.ArrayList;

public class Team  {
    private String name;
    int  played =0;
    int lost = 0;
    int wow = 0;
    int tied = 0;

    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean addPlayers(Player player){
        if(members.contains(player)){
            System.out.println(members.indexOf(player)+" is alredy exist in this list");
            return false;
        }
        else{
            members.add(player);
            System.out.println("new member was just added into team");
            return true ;
        }
    }
}
