//Operators in Java

public class Arithmetic_Operators{
    public static void main(String args[]){
        int a=10;
        int b=5;
        System.out.println("add = "+ (a+b));
        System.out.println("subtract = "+(a-b));
        System.out.println("mutiplication = "+(a*b));
        System.out.println(a/b);
        System.out.println(a%b);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   + - * / %.  Integer division truncates (5/2 = 2).  % gives remainder (sign follows the left operand).
   Interview: use (a % b + b) % b to get a non-negative modulo.
   ========================================================== */
