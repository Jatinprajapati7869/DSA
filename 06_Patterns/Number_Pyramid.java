public class Number_Pyramid {
    public static void number_pyramid(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
    // main() below was added by AI only so this file can run on its own (your original main called a single pattern).
    public static void main(String args[]){
        number_pyramid(5);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - the method above is YOUR code)
   ----------------------------------------------------------
   Row i prints the number i, i times, separated by spaces, after (n-i) spaces.
   Pattern recipe: 1) outer loop = rows  2) count spaces per row  3) count symbols per row  4) println after each row.
   ========================================================== */
