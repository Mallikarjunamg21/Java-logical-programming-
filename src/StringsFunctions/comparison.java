package StringsFunctions;

public class comparison {
    public static void main(String[] args) {
        String oldname = "sindhu";
        String newname = "sindhu";

        //1. s1>s2 : +ve value
        //2. s1==s2 : 0
        //3. s1<s2 : -ve value

        //HELLO AND CELLO, S1<S2
        if(oldname.compareTo(newname) == 0)
        {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");

        }

        if(oldname==newname)
        {
            System.out.println("Strings are equal AGAIN");
        }
        else{
            System.out.println("Strings are not equal AGAIN");

        }
    }
}
