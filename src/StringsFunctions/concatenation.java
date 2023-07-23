package StringsFunctions;
public class concatenation {
    public static void main(String[] args) {
        String fname = "Sudeep";
        String lname = "Sanjeev";
        String username = "kicchasudeep";
        String email = username+"@gmail.com";
        System.out.println(email);
        System.out.println(email.length());
        for(int i=0;i<=email.length()-1;i++)
        {
            System.out.println(email.charAt(i));
        }
        
    }

}