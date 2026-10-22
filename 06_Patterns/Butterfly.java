public class Butterfly {
    public static void butterfly(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    // main() below was added by AI only so this file can run on its own (your original main called a single pattern).
    public static void main(String args[]){
        butterfly(5);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - the method above is YOUR code)
   ----------------------------------------------------------
   Top half grows, bottom half shrinks.  Middle spaces = 2*(n-i).  O(n^2).
   Pattern recipe: 1) outer loop = rows  2) count spaces per row  3) count symbols per row  4) println after each row.
   ========================================================== */
