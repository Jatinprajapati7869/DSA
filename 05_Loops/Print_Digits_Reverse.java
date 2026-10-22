import java.util.Scanner;
public class Print_Digits_Reverse{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         while(n>0){
            int last=n%10;
            System.out.print(last);
            n=n/10;
        }
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   n % 10 = last digit, n / 10 = drop last digit.  This pair powers digit problems.
   Time O(number of digits).  NOTE (AI): works only for n > 0.
   ========================================================== */
