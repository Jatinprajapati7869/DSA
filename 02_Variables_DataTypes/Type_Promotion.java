//Type promotion
//Java auto promote byte shrot or char into int

public class Type_Promotion{
    public static void main(String args[]){
        // char a='a';
        // char b='b';
        // int b1=b;
        // int a1=a;
        // System.out.println(b1-a1);
        // short a=5;
        // byte b=25;
        // char c='c';
        // byte bt=(byte)(a+b+c);
        // System.out.println(bt);
        byte b=5;
        byte a=(byte)(b*2);
        System.out.println(a);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   byte, short and char are auto-promoted to int in expressions, so b*2 is an int and needs a cast back to byte.
   Interview favourite: byte b = (byte)(b * 2) vs byte b = b * 2 (compile error).
   ========================================================== */
