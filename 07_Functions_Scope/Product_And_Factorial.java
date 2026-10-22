 //find product of a and b

 public class Product_And_Factorial{
    public static int product(int a,int b){
        int product=a*b;
        return product;
    }
    public static void factorial(int num1){
        int temp=1;
        for (int i=1;i<=num1;i++){
            temp= temp*i;
        }
        System.out.print(temp);
    }
    public static void main(String agrs[]){
         product(8,3);
         factorial(5);
    }
 }

 //1 1*2 , 2*3 , 6*4 , 24*5=120

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   n! = 1*2*...*n.  O(n) time, O(1) space.  int overflows at 13! -> use long (up to 20!).
   NOTE (AI): product(8,3) result is ignored in main, so nothing prints for it.
   ========================================================== */
