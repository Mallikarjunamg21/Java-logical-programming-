package ApnaCollege;

import java.util.Scanner;

class Mobile {

    String color;
    String type;

    Mobile(String color,String type){
        System.out.println("Constructor called");
        System.out.println(color);
        System.out.println(type);
    }

    public void range(){
        System.out.println("Range Method called "+color);
        System.out.println("Range Method called "+type);
        // Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the range :");
//        int a = scan.nextInt();
//        int b = scan.nextInt();
        int a = 10000;
        int b = 20000;
        if(a>=10000 && b<=20000){
            System.out.println("Buy REDMI");
            System.out.println(this.color);
            System.out.println(this.type);
        }
        else if (a>=20000 && b<=30000) {
            System.out.println("Buy VIVO");
        }
        else if (a>=30000 && b<=40000) {
            System.out.println("Buy SAMSUNG");
        }
        else if (a>=40000 && b<=60000) {
            System.out.println("Buy SAMSUNG");
        }
        else if (a>=50000 && b<=100000) {
            System.out.println("Buy Iphone");
        }
        else {
            System.out.println("Range not in recomendation");
        }
    }
}


public class Base_OOPS {
    public static void main(String[] args) {

        Mobile m = new Mobile("White","Basic");
//        m.type = "Blackberry";
//        m.color = "Black";

        m.type = "Android";
        m.color = "GreenBlue";
        m.range();
    }





}
