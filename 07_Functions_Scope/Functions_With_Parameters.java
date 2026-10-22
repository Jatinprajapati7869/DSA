import java.util.*;
public class Functions_With_Parameters{
    public static void Calculatesum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+ sum);
    }
    public static void Calculate2(int a , int b){
        int sum=a+b;
        System.out.println("Sum is "+ sum);
    }
    public static void main(String agrs[]){
        Calculatesum();
        Calculate2(10,90);
}   }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Parameters make a function reusable.  Calculate2(int a, int b) works for any pair.
   ========================================================== */
