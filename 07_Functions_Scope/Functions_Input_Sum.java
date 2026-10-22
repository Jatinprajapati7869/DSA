//function in class are meathods
//function with parameteres

import java.util.*;
public class Functions_Input_Sum{
    public static void printHello(){
        System.out.println("Hello");
    }

    public static void Calculatesum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+ sum);
    }
    public static void main(String agrs[]){
        Calculatesum();
        printHello();
}   }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Methods can read input themselves, but passing parameters is cleaner and testable.
   ========================================================== */
