package exe.roadmap.module;

import java.time.LocalDate;

public class Order {
    private int OrderCode;
    private enum OrderType{
        order1("type one"),
        order2("type two"),
        order3("type three");
        OrderType(String orderValue){ }
    }
    private LocalDate orderDate;

    public Order(){

    }
    public Order(int n){
        this();
    }
}
