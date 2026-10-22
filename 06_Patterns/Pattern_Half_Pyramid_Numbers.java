public class Pattern_Half_Pyramid_Numbers{
    public static void main(String agrs[]){
        int n=4;
        for(int line=1;line<=n;line++){
            for (int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }
}   }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Row i prints 1..i.  O(n^2).
   ========================================================== */
