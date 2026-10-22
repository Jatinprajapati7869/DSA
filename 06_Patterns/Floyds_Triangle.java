public class Floyds_Triangle {
    public static void floyd(int n){
        int counter=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter+=1;
            }
            for (int j=1;j<=n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    // main() below was added by AI only so this file can run on its own (your original main called a single pattern).
    public static void main(String args[]){
        floyd(5);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - the method above is YOUR code)
   ----------------------------------------------------------
   A running counter that never resets: 1 / 2 3 / 4 5 6 ...  O(n^2).
   Pattern recipe: 1) outer loop = rows  2) count spaces per row  3) count symbols per row  4) println after each row.
   ========================================================== */
