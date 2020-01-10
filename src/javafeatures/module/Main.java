package javafeatures.module;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Button btnPrint = new Button("Print");
    public HealthInsurance Ih;

    public static void main(String[] args) {

  class ClickListener implements Button.OnclickListener {
    public ClickListener(){
        System.out.println("I've been attcahed");
    }
      @Override
      public void onClick(String title) {
      }
  }
        listen();
//  btnPrint.setOnclickListener(new ClickListener()); calling local class statement
//       annonymous class declaration
        btnPrint.setOnclickListener(new Button.OnclickListener() {
            @Override
            public void onClick(String title) {

            }
        });
  SampleCode.Animal animal = new SampleCode.Animal("");
  animal.walk();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
