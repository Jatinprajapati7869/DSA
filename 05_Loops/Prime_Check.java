import java.util.Scanner;
public class Prime_Check{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        for (int i=2;i<=n-2;i++){
            if (n%i==0){
                isPrime=false;
            }
        }
        if (isPrime==true){
            System.out.println(n + " is Prime number");
        } else{
            System.out.println(n + " is not prime number");
        }
}   }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Checks divisors 2..n-2 -> O(n).  Better: loop to sqrt(n) -> O(sqrt n) (you do this later in Functions_Prime_Binary_Scope).
   Edge cases: n <= 1 is not prime, n == 2 is prime.  NOTE (AI): this version prints 'prime' for 1 and for 2.
   ========================================================== */
