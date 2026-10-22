public class Inverted_Number_Pyramid {
    public static void inverted_py_num(int n){
        for (int i=1;i<=n;i++){
            int num=0;
            for (int j=1;j<=n-i;j++){
                System.out.print(num+1 +" ");
                num=num+1;
            }
            for (int j=1;j<=n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    // main() below was added by AI only so this file can run on its own (your original main called a single pattern).
    public static void main(String args[]){
        inverted_py_num(5);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - the method above is YOUR code)
   ----------------------------------------------------------
   NOTE (AI): the second inner loop prints spaces after the numbers, so the output is not a clean inverted pyramid; it is your work-in-progress.
   Pattern recipe: 1) outer loop = rows  2) count spaces per row  3) count symbols per row  4) println after each row.
   ========================================================== */
