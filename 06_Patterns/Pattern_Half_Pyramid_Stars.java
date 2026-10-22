public class Pattern_Half_Pyramid_Stars{
    public static void main(String agrs[]){
        for(int line=1;line<=4;line++){
            for (int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
}   }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Outer loop = rows (line), inner loop = columns.  Row i prints i stars.  O(n^2).
   Pattern recipe: rows = outer loop, columns = inner loop.
   ========================================================== */
