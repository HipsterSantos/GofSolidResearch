package javafeatures.module;
//A big interface who shows all members implemented
public interface SampleCode {
     interface Dog{
         default void walk(){
             System.out.println("Walking wthout owner");
         }
     }
    class Animal implements  Dog{
        public String name ;
        public Animal(String name){
            this.name = name;
        }
        @Override
        public void walk(){
            System.out.println("Overriding the dog method");
        }
    }
    static void ShowCode(){
        System.out.println("Coding in Python");
    }
    enum type{
         type1("Red"),
         type2("blue");
         type(String value1){
//             constructor added without public
         }
    }
}
