//orner cases for isPrime

public class Functions_Prime_Binary_Scope{
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
    public static boolean prime(int n){
        if (n==2){
            return true;
        }
        for (int i=2;i<=n-1;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean prime2(int n){
        if (n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primenumbers(int n){
        for (int i=2;i<=n;i++ ){
            if(prime(i)==true){
                System.out.print( i + " ");
            }

        }
    }
    public static void convertbinary(int n){
        int orignal=n;
        int decNum=0;
        int power=0;
        while (n>0){
            int lastDigit=n%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,power));
            power++;
            n=n/10;
        }
        System.out.print("Decimal of binary number "+ orignal + " is "+ decNum);
    }
    public static void convertdecimal(int n){
        int orignal=n;
        int power=0;
        int BinNum=0;
        while (n>0){
            int rem=n%2;
            BinNum=BinNum+(rem*(int)Math.pow(10, power));
            power++;
            n=n/2;
        }
        System.out.println("Binary number of dec number "+ orignal + " is "+ BinNum);
    }
    public static void scope(){
        int s=45;
        System.out.print(s);
    }
    public static void test(){
        for(int i=1;i<=5;i++){
            System.out.print(i);
        }
        //System.out.print(i); // does NOT compile: i only exists inside the for block
    }
    public static void main(String agrs[]){
        convertdecimal(9);
    }
 }

 //Binary System , 0-0 , 1=01 , 2=10 , 3=11 , 4=100 , 5=101 , 6= 110 , 7=111 , 8=1000
//Bit manipulation
//Decimal number system , dec means 10
//Binary System , bin means 2 likea zero or one , (0,1)
 //To convert binary tio decimal , n =101 take evry binary from right and mutiple , with 2 power 0 , 2 power 1 , 2 power 2 and son on , for 101
 // 1*2 power 0 +  0* 2 power 1 + 1* 2 power 2 = 1+0+4=5 , so for 101 its deci value is 5
 // 10000 , = 2 power 3 +0+0+0= 8

//Block scope - {}- this is a block , scope are in same scope , cant be used aboutside block
 //To comvert number to binary , divide it by 2 until the number decame - , take remainder , and store it , first reamainder in ones palce , 2nd tenth , 2rd , hunderth


 //scope
 //meathod scope
 //function - variable - basically the scope where i can use like a variable in a  fucntion

//class scope , similar as block scope , we have public class means it can be use anywhere

/* ==========================================================
   WHAT WAS WRONG (fixed above)
   ----------------------------------------------------------
   test() printed i AFTER the for loop.  i is declared inside the for, so its scope is only that block
   -> "cannot find symbol" compile error, which stopped the whole file from compiling.
   Fix: print inside the loop; the bad line is kept as a comment to show the scope rule.

   AI REVISION NOTES
   ----------------------------------------------------------
   prime2: loop up to sqrt(n) -> O(sqrt n).  primenumbers: calls prime() for every i -> O(n * n) for the naive version.
   Binary -> Decimal: sum(lastDigit * 2^power).   Decimal -> Binary: repeatedly n%2, n/2.
   Scope: block scope = inside { } only.
   Interview: use Integer.toBinaryString(n) / Integer.parseInt(s, 2) in real code.
   ========================================================== */
