package javafeatures.module;

//@FunctionalInterface
public interface StringProcessor {

 String Process(String x);

 abstract void InterviewStatus();
  enum Item{
     Good("Good"),
     Bad("Bad");
     Item(String Status){

     }
 }
 default Item SubmitInterfviewStatus(float percentage ){
     return percentage>=0.78?Item.Good : Item.Bad;
 }

 static String isLower(String s){
     boolean result = true;
     for( int t = 0; t<s.length() && result;++t){
     result  &= Character.isLowerCase(s.charAt(t));
     }
     return s;
 }
}
