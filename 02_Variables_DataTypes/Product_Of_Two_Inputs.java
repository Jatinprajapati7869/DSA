import java.util.*;
public class Product_Of_Two_Inputs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int product=num1*num2;
        System.out.println(product);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Product of two ints.  Overflows if result > 2^31-1 - use long for big values.
   ========================================================== */
