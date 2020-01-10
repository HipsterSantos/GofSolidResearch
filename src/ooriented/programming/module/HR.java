package ooriented.programming.module;

public class HR {
    public void sendInvitation(Employee emp){
        System.out.println("sending out to "+ emp.name + "who lives in  "+emp.address);
    }
    public void notifyingProgrammer(Programmer pro){
        System.out.println("sending out to "+ pro.name+ "who lives in  "+pro.address);
    }

    {
        System.out.println("Initializing block");
    }

   static {
        System.out.println("Initializing block");
    }

    public static void main(String[] args) {
        HR hr = new HR();
        Manager mg = new Manager();
        System.out.println(mg.name);
        mg.reportProjectStatus();
        System.out.println(mg.name+ResourceType.rone.set());
    }
}
