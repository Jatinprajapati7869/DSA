//Binomial coefficient

 public class Binomial_Coefficient{
    public static int product(int a,int b){
        int product=a*b;
        return product;
    }
    public static int factorial(int num1){
        int temp=1;
        for (int i=1;i<=num1;i++){
            temp= temp*i;
        }
        //System.out.println(temp);
        return temp;
    }
    public static void Binomial(int n, int r){
        //int result=factorial(n)/((factorial(r))*(factorial(n-r)));
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_r_fact=factorial(n-r);
        int bin_coef= n_fact/(r_fact*n_r_fact);
        System.out.println(bin_coef);
    }
    public static void main(String agrs[]){
         Binomial(5,2);
    }
 }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   nCr = n! / (r! * (n-r)!).  Factorials overflow quickly - for big n use Pascal's triangle / DP (nCr = (n-1)Cr + (n-1)C(r-1)).
   ========================================================== */
