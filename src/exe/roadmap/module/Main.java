package exe.roadmap.module;

public class Main extends Object{
    public static void main(String[] args) {
   Account bobsAccount = new Account("12212",0.00,"Bob brown");
//   setting user proerties
   bobsAccount.setAccountNumber("12332");
   bobsAccount.setCustomerName("Uncle Bob");
   bobsAccount.setAccountbalance(500.00);
   bobsAccount.setCustomerPhoneNumber("+343 332 211");
   bobsAccount.setEmailAddress("uncle@bob.co.com");
//   making operations
   bobsAccount.withdrawal(100);
   bobsAccount.deposit(50.00);
   bobsAccount.withdrawal(100.00);
   bobsAccount.deposit(51.00);
   bobsAccount.withdrawal(100.00);
    }
}
