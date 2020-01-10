package exe.roadmap.module;

public class Account {
    private String accountNumber;
    private double Accountbalance;
    private String customerName;
    private String emailAddress;
    private String customerPhoneNumber;
//setting overload parameter
    public Account(){
//        calling one constructor to another connstructor
        this("",0.12,"");

        System.out.println("");
    }
    public Account(String number,double Balance, String Customer){
        this.setCustomerPhoneNumber(number);
        this.setCustomerName(Customer);
        this.setAccountbalance(Balance);
    }
        public void deposit(double depositAmount){
            Accountbalance +=  depositAmount;
            System.out.println("Deposit of "+depositAmount+" $USD  made.  new Balance is  "+Accountbalance+" $USD");
        }
        public void withdrawal(double withdrawalAmount){
            if (Accountbalance -  withdrawalAmount <= 0){
                System.out.println("Onle "+Accountbalance+" $USD Avaiable withdrawall not processed");
            }else{
                Accountbalance -=withdrawalAmount;
                System.out.println("withdrawal of "+withdrawalAmount+" $USD processed. Remaining Balance "+Accountbalance+"$USD");
            }
        }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountbalance() {
        return Accountbalance;
    }

    public void setAccountbalance(double accountbalance) {
        Accountbalance = accountbalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
