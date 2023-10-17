package Scanners;

import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {
       Scanner pr = new Scanner(System.in);
        int may_salary = pr.nextInt();
        int june_salary = pr.nextInt();
        int july_salary = pr.nextInt();
        int salary_needed = may_salary+june_salary+july_salary;
        System.out.println(salary_needed);
        //This provided summation of remaining salary
    }
    
}
