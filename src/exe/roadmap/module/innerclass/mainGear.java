package exe.roadmap.module.innerclass;

import java.util.Scanner;

public class mainGear {
    private static Scanner scan = new Scanner(System.in);
    private static Button btn = new Button();
    public static void main(String[] args) {
//        GearBox mcLaren = new GearBox(6);
////        now invoking the inner gear class
//        GearBox.Gear mcGear = mcLaren.new Gear(3,4.4);
//        GearBox.LittlGear little = mcLaren.new LittlGear();
//        String name = little.condtructor().name;
//        Local class apprach

//       class clickListner implements Button.OnclickListener {
//           public clickListner(){
//               System.out.println("Condtructor was called");
//           }
//
//           @Override
//           public void onClick(String title){
//                System.out.println("calling out title");
//            }
//
//        }
        btn.setOnclickListener(title -> System.out.println("Showing anonymous classs"));

//        annonymous class approach
//        btn.setOnclickListener(new Button.OnclickListener(){
//            @Override
//            public void onClick(String title){
//                System.out.println("Showing anonymous classs");
//            }
//        });

    }
}
