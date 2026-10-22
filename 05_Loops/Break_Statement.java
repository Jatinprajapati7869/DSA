//Break , - out of loop , continue , continue loop

import java.util.Scanner;
public class Break_Statement{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter your number: ");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   break exits the loop immediately.  Used for early exit / sentinel input.
   ========================================================== */
