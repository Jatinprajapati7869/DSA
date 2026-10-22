public class Pattern_Inverted_Half_Pyramid{
    public static void main(String agrs[]){
        int n=4;
        for(int line=1;line<=n;line++){
            for (int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
}   }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Row i prints n-i+1 stars.  O(n^2).
   ========================================================== */
