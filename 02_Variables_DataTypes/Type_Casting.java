//Type Casting

import java.util.*;
public class Type_Casting{
    public static void main(String args[]){
        float a=25.12f;
        int b=(int)a;
        System.out.println(b);
        char ch='a';
        char ch2='b';
        int number=ch;
        int number2=ch2;
        System.out.println(number);
        System.out.println(number2);

    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Narrowing needs a cast: (int) 25.12f -> 25 (decimal part is TRUNCATED, not rounded).
   char <-> int uses ASCII/Unicode: 'a' = 97, 'b' = 98.  Trick: ch - 'a' gives 0-based letter index (used in String problems).
   ========================================================== */
