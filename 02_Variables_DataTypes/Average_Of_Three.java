import java.util.*;
public class Average_Of_Three {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1:");
        int n1=sc.nextInt();
        System.out.print("Enter number 2:");
        int n2=sc.nextInt();
        System.out.print("Enter number 3:");
        int n3=sc.nextInt();
        int avg=(n1+n2+n3)/3;
        System.out.print("Avg is these 3 numbers is" + avg);

    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   NOTE (AI): (n1+n2+n3)/3 is integer division and drops decimals.  Use (n1+n2+n3)/3.0 for a double result.
   ========================================================== */
