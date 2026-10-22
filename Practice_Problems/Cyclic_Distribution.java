import java.util.*;
public class Cyclic_Distribution {
    public static void main(String arrays[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int result[]=new int[n];
        for (int i=0;i<=m-1;i++){
            result[i%n]++;

        }
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   i % n maps any index onto 0..n-1 (cyclic / round-robin).  Time O(m + n).
   ========================================================== */
