//Comments in java = //
/*
Hello World
 */
// //We imported a pakages here with import

import java.util.*;
public class Scanner_Input{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // String input=sc.next();
        // System.out.println(input);
        String name =sc.nextLine();
        int num=sc.nextInt();
        float price=sc.nextFloat();
        System.out.println(name);
        System.out.println(num);
        System.out.println(price);
        Boolean idk=sc.nextBoolean();
        System.out.println(idk);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Scanner reads from System.in.  nextInt/nextFloat/nextBoolean/next() read one token; nextLine() reads the whole line.
   Classic bug: calling nextLine() right after nextInt() returns the leftover newline - call an extra nextLine() to consume it.
   For competitive coding with big input use BufferedReader / a custom fast reader (see Practice_Problems).
   ========================================================== */
