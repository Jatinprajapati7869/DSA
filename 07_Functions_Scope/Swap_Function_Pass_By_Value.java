import java.util.*;
public class Swap_Function_Pass_By_Value{
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
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

    }
    public static void main(String agrs[]){
        int a=5;
        int b=10;
        System.out.println("old a = "+ a);
        System.out.println("old b = "+ b);
        swap(a,b);
}   }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Java is ALWAYS pass-by-value.  Primitives are copied, so swapping inside swap(a,b) does NOT change the caller's a and b.
   Objects/arrays: the reference is copied, so you CAN mutate the contents (see Array_Update_Pass_By_Reference).
   Very common interview question.
   ========================================================== */
