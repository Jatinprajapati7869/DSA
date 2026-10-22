import java.util.*;
public class Factorial_For_Loop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int TotalSum=1;
        for (int n=1; n<=number;n++){
            TotalSum*=n;
        }
        System.out.println("Factorial is "+TotalSum);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   n! in O(n).  Start the product at 1, not 0.
   ========================================================== */
