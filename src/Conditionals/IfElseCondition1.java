package Conditionals;

import java.util.Scanner;

public class IfElseCondition1 {

    static String statement1, statement2, statement3, statement4;
    public static void main(String[] args) {
        /* 
        Syntax:
        if(condition)
        {
            statement1;
            statement2;
        }else
        {
            statement3;
            statement4;
        }
        */

        //real time example
        /* 
        condition : if age of user input is less than 18, 
        statment1 ; not eligible to marry
        statement2 : not eligible to vote
        statment3 ; eligible to marry
        statement4 : eligible to vote
        */

        Scanner pr = new Scanner(System.in);
        String fullName = pr.nextLine();
        statement1 = "not eligible to marry";
        statement2 = "not eligible to vote";
        statement3 = "eligible to marry";
        statement4 = "eligible to vote";
        int age = pr.nextInt();

        if(age<=18)
        {
            System.out.println("Hi,"+fullName+". I'm sorry to say you're "+statement1+" and "+statement2+".");
        }
        else
        {
            System.out.println("Hi,"+fullName+". I'm happy to say  you're "+statement3+" and "+statement4+".");

        }





    }
}
