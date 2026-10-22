public class Hollow_Rectangle {
    public static void hollowRectangle(int m,int n){
        for (int i=1;i<=m;i++){
             for (int j=1;j<=n;j++){
                if (i==1 || i==m || j==1 || j==n){

                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
             }
             System.out.println();
        }
    }
    // main() below was added by AI only so this file can run on its own (your original main called a single pattern).
    public static void main(String args[]){
        hollowRectangle(4,5 );
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - the method above is YOUR code)
   ----------------------------------------------------------
   Print '*' only on the border: i==1 || i==m || j==1 || j==n, else a space.  O(m*n).
   Pattern recipe: 1) outer loop = rows  2) count spaces per row  3) count symbols per row  4) println after each row.
   ========================================================== */
