public class Solid_Rhombus {
    public static void solid_rhombus(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // main() below was added by AI only so this file can run on its own (your original main called a single pattern).
    public static void main(String args[]){
        solid_rhombus(5);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - the method above is YOUR code)
   ----------------------------------------------------------
   n-i spaces then n stars per row.  Shifts the rectangle to form a parallelogram.
   Pattern recipe: 1) outer loop = rows  2) count spaces per row  3) count symbols per row  4) println after each row.
   ========================================================== */
