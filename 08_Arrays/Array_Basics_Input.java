//Arrays - is list in python
//Index start from 0 to 49 for 50 sized arrays
// 0 based indexing
//Defination - List of element of same type placed in a contingous memory location
// contigiours means  one by one
//lets take adress random , first 1000 , then second is auto 1004 then 1008 then 1012
//Operation in arrays , create , input , output , update
// datatype Arrayname[]= new dataType[size];
// In java array are static , not dynimaic like python , static means changed be changed in between

import java.util.*;
public class Array_Basics_Input {
    public static void main(String arrays[]){
        //creating a array
        /*int marks[]=new int[50];
        int numbers[]={1,2,3};
        int morenumbers[]={4,5,6};
        String fruits[]={"apple","mango","banana"};*/
        //taking input in array
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        int physics;
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Physics : "+ marks[0]);
        System.out.println("Maths : "+ marks[1]);
        System.out.println("Biology : "+ marks[2]);
        marks[2]= 100;
        System.out.println("Biology : "+ marks[2]);
        int percentage=((marks[0]+marks[1]+marks[2])/3);
        System.out.println(percentage)  ;
        System.out.println(marks.length);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   int[] a = new int[n];  default values: 0 for numbers, false for boolean, null for objects.
   Length is a field (arr.length), not a method (unlike String.length()).
   Out-of-range index -> ArrayIndexOutOfBoundsException.
   ========================================================== */
