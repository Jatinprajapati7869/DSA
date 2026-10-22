public class Functions_Avg_Even {
    public static void avg(int n1,int n2,int n3){
        int avg=(n1+n2+n3)/3;
        System.out.print(avg);
    }
    public static void isPalindrome(int n){

    }
    public static boolean even(int n){
        if (n%2==0){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.print(even(8));
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   NOTE (AI): isPalindrome is an empty stub.  even(n) can simply be: return n % 2 == 0;
   ========================================================== */
