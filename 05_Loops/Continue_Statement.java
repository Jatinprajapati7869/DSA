//Continue is use to skip an iteration

import java.util.Scanner;
public class Continue_Statement{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter your number :");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("number was "+n);
        }while(true);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   continue skips the rest of the current iteration only.
   NOTE (AI): with continue inside do-while(true) the loop never ends unless you stop it manually.
   ========================================================== */
