package StringsFunctions.StringLiterals;

import java.sql.SQLOutput;

public class ImmutableString {

    public static void main(String[] args) {
        System.out.println("----------------1. String literal with same value comparision");
        String name = "Sudeep";
        String actor = "Sudeep";
        System.out.println("  name: "+name.hashCode());
        System.out.println(" actor: "+actor.hashCode());
        if (name.hashCode()==actor.hashCode()){
            System.out.println("String is stored in string constant pool, They do not create new object");
        }


        System.out.println("--------------2. String literal and string with new keyword for same value, comparison");
        String user = "Darshan";
        String hero = new String("Darshan");
        System.out.println(" user : "+user);
        System.out.println(" hero : "+hero);
        if (user.hashCode()==hero.hashCode()){
            System.out.println("String is stored in string constant pool, They do not create new object");
        }

        System.out.println("-------------3. String with new keyword with same values in it, comparison------------");
        String patient = new String("Shiva Kumar");
        String recipint = new String("Shiva Kumar");
        System.out.println("name of patient : "+patient);
        System.out.println("name of recipeint : "+recipint);
        if(patient==recipint){
            System.out.println("String literals do not create new object, but string with new keyword does " +
                    "so hashcode changes");
            }
        else {
            System.out.println("String have created new object in heap memory, they are pointing to new object in it"+
                    "They are also created single space in string constant pool, but they are equal");

        }

        System.out.println("_-------comaparison between new object and without new object--------------------_");
        String Doctor = "Shiva Kumar";
        if(Doctor==patient){
            System.out.println("String literals do not create new object, but string with new keyword does " +
                    "so hashcode changes");
        }
        else {
            System.out.println("String have created new object in heap memory, they are pointing to new object in it"+
                    "They are also created single space in string constant pool, but they are equal");

        }


    }
}
