//Swap 2 values

import java.util.*;
public class Swap_Two_Values_Inline{
    public static void Calculatesum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+ sum);
    }
    public static void Calculate2(int a , int b){ //formal parameterrs
        int sum=a+b;
        System.out.println("Sum is "+ sum);
    }
    public static void main(String agrs[]){
        int a=5;
        int b=10;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
}   }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Classic swap with a temp variable.  Swapping without a temp: use + and - or XOR.
   ========================================================== */
