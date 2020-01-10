package javafeatures.module;

public class OrderService {
    private Restaurant retaurant;
    private int id;
    private Customer customer;
    private Scheduler schedule;
    private Transaction transaction ;
    private Product product;
    public OrderService(Customer client,Product product){
        this.customer = client;
        this.product = product;
    }

    public void makeingTransaction(){
        String ProductName = this.product.getName();
    }

    private interface Transaction{
        public static boolean descount(double value){
            return value != 0;
        }
        public static double make(float valuePaid , float productPrice){
            descount(
                    (valuePaid - productPrice)
            );
            return valuePaid - productPrice;
        }
    }
}
