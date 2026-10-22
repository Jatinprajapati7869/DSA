import java.util.Scanner;
public class Reverse_Number{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int rev=0;
         while(n>0){
            int last=n%10;
            rev=(rev*10)+last;
            n=n/10;
        }
        System.out.print(rev);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   rev = rev*10 + lastDigit.  O(digits) time, O(1) space.
   Interview: LeetCode 7 (Reverse Integer) - handle overflow and negatives.  Same idea checks palindrome numbers.
   ========================================================== */
