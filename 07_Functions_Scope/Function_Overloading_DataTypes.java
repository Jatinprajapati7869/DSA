//function overloading using diff data types

 public class Function_Overloading_DataTypes{
    public static float sum(float n1,float n2){
        return n1+n2;
    }
    public static int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public static int product(int a,int b){
        int product=a*b;
        return product;
    }
    public static int factorial(int num1){
        int temp=1;
        for (int i=1;i<=num1;i++){
            temp= temp*i;
        }
        return temp;
    }
    public static void Binomial(int n, int r){

        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_r_fact=factorial(n-r);
        int bin_coef= n_fact/(r_fact*n_r_fact);
        System.out.println(bin_coef);
    }
    public static void main(String agrs[]){
        System.out.println(sum(2,3,4));
        System.out.println(sum(2.5f,3.8f));

    }
 }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Overloading by data type: sum(float,float) vs sum(int,int,int).  Java picks the best match.
   ========================================================== */
