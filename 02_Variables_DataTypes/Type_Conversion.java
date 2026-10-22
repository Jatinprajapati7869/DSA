//Type conversion

import java.util.*;
public class Type_Conversion{
    public static void main(String args[]){
        // int a=25;
        // long b=a;
        // long a=25;
        // int b=a;
        // System.out.println(b);
        Scanner sc=new Scanner(System.in);
        float number=sc.nextInt();
        System.out.println(number);
    }
}

//Byte>short>int>float>long>double
//Destination tyoe>source type

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Widening (automatic, safe): byte -> short -> int -> long -> float -> double.
   Rule from your notes: destination type must be bigger than the source type.
   Narrowing needs an explicit cast (see Type_Casting).
   ========================================================== */
