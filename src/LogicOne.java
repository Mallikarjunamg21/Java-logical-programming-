public class LogicOne {
    public static void main(String[] args) {
        int a = 20;
        int b = 4;
        int multiple = a*b;
        int subtract = a-b;
        System.out.println("multiplication = "+multiple);
        System.out.println("subtraction = "+subtract);
        System.out.println("formula multiple/subtract= "+multiple/subtract);
        int as = a*b/a-b;
        int an = (a*b)/(a-b);
        System.out.println("---Without bracket----");
        System.out.println(as);
        System.out.println("----With bracket------");
        System.out.println(an);
    }
    
}
