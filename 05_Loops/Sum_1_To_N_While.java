import java.util.Scanner;
public class Sum_1_To_N_While{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int i=1;
        int total=0;
        while (i<=range){
            total=total+i;
            i++;
        }
        System.out.print(total);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Sum 1..n in O(n).  Math shortcut: n*(n+1)/2 in O(1).
   ========================================================== */
