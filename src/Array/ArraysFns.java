package Array;

import java.util.Arrays;

public class ArraysFns {
    public static void main(String[] args) {
        //independent storage
        int kannada = 98;
        int english = 104;
        int hindi = 73;
        int maths = 81;
        int science = 73;
        int social = 81;

        //single storage
        //arrays - non primitive stored here
        int[] marks = new int[6];
        marks[0] = 98;
        marks[1] = 104;
        marks[2] = 73;
        marks[3] = 81;
        marks[4] = 73;
        marks[5] = 81;
        System.out.println(marks);  //[I@56cbfb61 - hashcode will be printed
        for(int i=0; i<=marks.length-1;i++)
            //"marks.length" gets index value of array
            // "marks.length" is more than array length , if "length" instead of "length-1"
            // - then java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
        {
            System.out.println(marks[i]);
            //98
            //104
            //73
            //81
            //73
            //81
        }

        int[] marks2 = new int[6];
        System.out.println(marks2[2]);  //0 - because no values are assigned at position 2 index

        boolean[] marks3 = new boolean[6];
        System.out.println(marks3[2]);  //false - fixed values are not present

        //to find out the length functions
        System.out.println("No of Subjects : "+marks.length);

        //to find out the Sum of Marks
        System.out.println("Sum of Marks: "+ Arrays.stream(marks).sum());

        //to find out the length using stream count
        System.out.println("Count of Array: "+ Arrays.stream(marks).count());

        //sort using Arrays
        Arrays.sort(marks);
        for(int i=0; i<=marks.length-1;i++)
        //"marks.length" gets index value of array
            //sorted array will have change of index value from previous array
        // "marks.length" is more than array length , if "length" instead of "length-1"
        // - then java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
        {
            System.out.println(marks[i]);
            //73
            //73
            //81
            //81
            //98
            //104
        }




        //Arrays with new Keyword
        int[] score = {104, 98, 73, 81, 73, 81};

        for(int i=0; i<=score.length-1;i++)
        //"score.length" gets index value of array
        //sorted array will have change of index value from previous array
        // - then java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
        {
            System.out.println((i+1)+". SCORES : "+score[i]);
            //1. SCORES : 104
            //2. SCORES : 98
            //3. SCORES : 73
            //4. SCORES : 81
            //5. SCORES : 73
            //6. SCORES : 81
        }

        //TWO DIMENSIONAL ARRAY
        // used to store two people data at same time

        int[][] scores2peoples = {{104, 98, 73, 81, 73, 81},{124, 100, 53, 71, 53, 79}};
        System.out.println(scores2peoples[0][1]);  //98
        System.out.println(scores2peoples[0][0]);  //104
        System.out.println(scores2peoples[0][2]);  //73
    }
}
