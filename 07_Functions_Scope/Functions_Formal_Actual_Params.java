import java.util.*;
public class Functions_Formal_Actual_Params{
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
        Calculatesum();
        Calculate2(10,90); //arguments or actual parameteres
}   }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Formal parameters = in the definition (int a, int b).  Actual parameters / arguments = in the call (10, 90).
   ========================================================== */
