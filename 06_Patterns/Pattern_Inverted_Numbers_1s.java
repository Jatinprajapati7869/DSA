public class Pattern_Inverted_Numbers_1s{
    public static void main(String agrs[]){
        int i=0;
        int n=4;
        for(int line=1;line<=n;line++){
            for (int star=1;star<=n-line+1;star++){
                System.out.print(i+1);
            }
            System.out.println();
        }
}   }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Prints the number i+1 repeated n-line+1 times per row.  O(n^2).
   ========================================================== */
