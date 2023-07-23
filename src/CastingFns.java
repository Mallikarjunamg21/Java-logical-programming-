package basic;

public class CastingFns {
    public static void main(String[] args) {
        //casting

        //implicit casting
        //narrowing
        //convertion from smaller "int" (4 bytes) to bigger "double" (8 bytes)
        double price = 104.31;
        double hikePrice = price + 2;
        System.out.println(hikePrice);  //106.31

        //explicitly casting
        //widening
        //convertion from bigger "double" (8 bytes) to smaller "int" (4 bytes)
        int price2 = 104;
        int hikePrice2 = price2 + (int) 2.31;
        System.out.println(hikePrice2);   //106



    }
}
