package basic;

public class StringFns
{
    public static void main(String[] args) {
        // primitive types
        //sized
        //cannot be modified
        //stored upon variables of primitive types
        byte age = 24;          // -128 to 127
        int phone = 812369728; //9 digits
        long phone2 = +919741833404L;   //L represents LONG
        float pi = 3.142F;              //F represents FLOAT
        char letter = 'M';              // Char will store only single value with single quotes - ' '
        boolean isAdult = true;         // store boolean type of values with true or false

        //non primitive / references
        // ---- this will have their own functions
        //---- stored values upon non premitive data types variables
        // --- this does not have sized
        String name = "Mallikarjuna M G";
        //length will be printed
        System.out.println("length : "+name.length()); //16

        //--- this valued can be stored using reference variable
        String aliasName = new String("Mallika");
        String fatherName = new String("Maheshwarappa");


        //String Operations

        //concatenate - used to join 2 or more strings
        String oppositionParty1 = "BJP";
        String oppositionParty2 = "JDS";
        String oppositionParties = oppositionParty1 + oppositionParty2;
        System.out.println(oppositionParties);   //BJPJDS

        String oppositionParties2 = oppositionParty1 +"and"+ oppositionParty2;
        System.out.println(oppositionParties2);   //BJP and JDS

        //charAt - used to get characters present in strings at positions
        String area = "RajajiNagar";
        System.out.println(area.charAt(0));    //R
        System.out.println(area.charAt(6));    //N

        //length - to get size of a string from 0th index to no of positions
        System.out.println(area.length());      //10

        //Replace - Replacing the string with different characters
        String oldname = "Karan";
        String newname = oldname.replace('K','S');
        System.out.println(newname);        //Saran //replaces the value with provided replace functions
        System.out.println(oldname);        //Karan //this does not changes value of original name
        // Strings are mutable - cannot be changed
        // If need to change the String - Store it in a diffrent variable like "newname"
        // and use required functions like "replace()"

        //SubString - Used to trim big string into small piece
        String parties = "BJP, CONGRESS and JDS";
        // Substrings indexing - This includes first index and does not include last index
        System.out.println(parties.substring(0,3));   //BJP
        System.out.println(parties.substring(5,13));  //CONGRESS
        System.out.println(parties.substring(18,21)); //JDS
        // After using subtring methods, this does not change original string value
        System.out.println(parties);                  //BJP, CONGRESS and JDS






    }
}