public class Binary_Triangle_Parity {
    public static void triangle2(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    // main() below was added by AI only so this file can run on its own (your original main called a single pattern).
    public static void main(String args[]){
        triangle2(5);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - the method above is YOUR code)
   ----------------------------------------------------------
   (i+j) even -> 0 else 1.  Parity trick gives a checkerboard / alternating pattern with no extra state.
   Pattern recipe: 1) outer loop = rows  2) count spaces per row  3) count symbols per row  4) println after each row.
   ========================================================== */
