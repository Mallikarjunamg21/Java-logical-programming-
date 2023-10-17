package StringsFunctions.StringLiterals;

public class mutableString {

    public static void stringBuffers(){
        System.out.println("STRING - Mutable operations");
        StringBuffer sf = new StringBuffer();
        System.out.println("Append "+sf.append("Kiccha"));
        System.out.println("Check original "+sf); //Kiccha
        System.out.println(sf.insert(6," sudeep"));
        System.out.println("check original : "+sf);
        System.out.println("reverse name : "+sf.reverse());
        sf.reverse();
        System.out.println(sf.substring(7,sf.length()));
        System.out.println("check original : "+sf);
        String sudeep = sf.substring(7,sf.length());
        System.out.println(sudeep);
        if (sudeep.equals(sf.substring(7,sf.length()))){
            System.out.println("Condition meets at 1");
            }
        else if (sudeep.equalsIgnoreCase(sf.toString())){
            System.out.println("equal ignorecase");

        }
     }


    public static void stringOps(String value){
        System.out.println("STRING - Immutable operations");
       // System.out.println("String To String: "+s.toString());         //Deepa
        System.out.println("Uppercase: "+ value.toUpperCase());              //DEEPA
        System.out.println("Check original reference changes or not: "+ value); //Deepa
        //original 's' does not change wrt functions
        System.out.println("to get first character of string: "+ value.charAt(0)); //D
        System.out.println("to get length of string: "+ value.length());     //5
        System.out.println("to get last index of String char 'd' : "+ value.lastIndexOf('D')); //0
        System.out.println("to get last index of String char 'e' : "+ value.lastIndexOf('e',5)); //2
        System.out.println("to get last index of String char 'pa' : "+ value.lastIndexOf("pa"));    //3
        System.out.println("concat with word(expected 'shree' at end : "+ value.concat("shree"));   //Deepashree
        System.out.println("Check original reference changes or not: "+ value); //Deepa
        //original 's' does not change wrt functions
        System.out.println("Replace 'Dee' with 'Shil': "+ value.replace("Dee","Shil")); //shilpa
        System.out.println("split 'e' words from deepa: ");
        String[] d = value.split("e");
        for(String w:d){
            System.out.print(w+" ");
        }
        System.out.println();
        System.out.println(d[0]); //D
        System.out.println(d[1]); //whitespace
        System.out.println(d[2]); //pa
        //System.out.println(d[3]); //array out of bound exception
        System.out.println("check ignore case: "+ value.equalsIgnoreCase("Deepa ".trim()));
    }




    public static void main(String[] args) {
        stringOps("Deepa");
        stringBuffers();
    }

}
