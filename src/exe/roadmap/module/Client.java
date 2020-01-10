package exe.roadmap.module;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Client extends Person {
    private String[] address;

    public Client(String name,String number){
        super(name,23,"",number);
    }

    public Client(){
        this("Jessica","993443343");
    }
    @Override
    protected void calling(){
     super.SaymyName();
        System.out.println("Your new name "+super.name);
    }
    @Override
    public void humanNeeds(){

    }

}
