package exe.roadmap.module.genericLambda;

import java.time.LocalDate;

public class Customer {
    private String name;
    private LocalDate data;

//    @org.jetbrains.annotations.Contract(pure = true)
    public Customer(){

    }
    public void buying(Product product){
        System.out.println("Buying something  like  "+product.name("apple"));
    }

    public interface Product{
        default String name(String name){
            return name;
        }
    }
}
