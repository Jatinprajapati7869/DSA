public class Pattern_Characters_Triangle{
    public static void main(String agrs[]){
        int n=4;
        char ch='A';
        for (int i=1;i<=n;i++){
             for (int chars=1;chars<=i;chars++){
                System.out.print(ch);
                ch++;
             }
        System.out.println();
        }
}   }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   A char can be incremented (ch++) to move A -> B -> C.  O(n^2).
   ========================================================== */
