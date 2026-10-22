import java.util.Scanner;
public class Sum_1_To_N_While_With_Message{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int i=1;
        int total=0;
        while(i<=range){
            total=total+i;
            i++;
        }
        System.out.println("Sum is : "+ total);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Same as Sum_1_To_N_While with a message.  Formula: n*(n+1)/2.
   ========================================================== */
