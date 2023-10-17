package Scanners;

import java.util.*;

public class ScannerNext {
    public static void main(String[] args) {
      Scanner pr= new Scanner(System.in); 
      String firstname = pr.next();    //Mallikarjuna M G
      //prints only first token only not full sentences
      System.out.println("Firstname :"+firstname);
      String lastname = pr.nextLine();   
      //Disabled - when next method is used before with more than one token 
      //Enabled - when next method is not used
      //prints full values in token i.e, full sentences
      //prints remaining values entered during "next()" method 
      System.out.println("Lastname :"+lastname);   // M G
      System.out.println("I'm "+firstname+lastname+", Resigned.");
    }

}
