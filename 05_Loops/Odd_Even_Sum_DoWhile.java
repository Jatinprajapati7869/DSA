import java.util.*;
public class Odd_Even_Sum_DoWhile {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int TotalOdd=0;
        int TotalEven=0;
        do{
            System.out.println("Enter your number : ");
            number=sc.nextInt();
            if (number%2==0){
                TotalEven+=number;
            } else{
                TotalOdd+=number;
            }
            System.out.println("Do you want to continue. Press 1 for Yes and 2 for No");
            choice=sc.nextInt();
        } while (choice==1);
        System.out.println("Sum of total even numbers : " + TotalEven);
        System.out.println("Sum of total odd numbers is "+ TotalOdd);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   do-while is ideal for 'ask at least once' menus.  Accumulate totals in separate variables.
   ========================================================== */
