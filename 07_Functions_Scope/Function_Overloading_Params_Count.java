 //meathod are of 2 types , user defined and system defined , like inbuilt , functions , example like maths library
 // sc.nextInt= Inbult meathod
 //function overloading
 //Mutiple function iwth same name but differeent parameters
//function overloading

 public class Function_Overloading_Params_Count{
    public static int sum2(int n1,int n2){
        return n1+n2;
    }
    public static int sum3(int n1,int n2,int n3){
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
        System.out.println(sum3(2,3,4));
        System.out.println(sum2(2,3));

    }
 }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Overloading = same name, different parameter list (count/type/order).  Return type alone is NOT enough.
   Resolved at compile time (compile-time polymorphism).
   ========================================================== */
