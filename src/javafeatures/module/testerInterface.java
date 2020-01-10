package javafeatures.module;

public class testerInterface {
    public static void main(String[] args) {
        StringProcessor anony = new StringProcessor() {
            @Override
          public String Process(String x){
                return x;
            }
            @Override
            public void InterviewStatus(){ }
        };
        TwoArgsProcess<StringProcessor> generic =  new TwoArgsProcess<StringProcessor>() {
            @Override
            public StringProcessor process(StringProcessor arg1, StringProcessor arg2) {
                return arg1;
            }
        };

        Object obj = anony.SubmitInterfviewStatus(0.50F);
        System.out.println(
        obj.toString() +" Another computed calc :"+
        generic.process(anony,anony).SubmitInterfviewStatus(76).toString()
        );
    }
}
