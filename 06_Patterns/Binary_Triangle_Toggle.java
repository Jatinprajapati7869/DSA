public class Binary_Triangle_Toggle {
    public static void triangle(int n){
        int counter=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (counter==1){
                    System.out.print("0");
                    counter=0;
                } else{
                    System.out.print("1");
                    counter=1;
                }
            }
            for (int j=1;j<=n;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    // main() below was added by AI only so this file can run on its own (your original main called a single pattern).
    public static void main(String args[]){
        triangle(5);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - the method above is YOUR code)
   ----------------------------------------------------------
   Toggles 1,0,1,0 using a flag (counter).  Compare with the (i+j)%2 trick in Binary_Triangle_Parity.
   Pattern recipe: 1) outer loop = rows  2) count spaces per row  3) count symbols per row  4) println after each row.
   ========================================================== */
