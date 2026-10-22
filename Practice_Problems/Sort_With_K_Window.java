import java.util.*;
public class Sort_With_K_Window {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int []arr=new int[n];
         for (int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
        int first=-1;
        int last=-1;
        for (int j=0;j<n-1;j++){
            if (arr[j]>arr[j+1]){
                if (first==-1){
                    first=j;
                }
                last=j;
            }
        }
        if (first==-1||last-first+1<=k){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        }
        }

/* ==========================================================
   WHAT WAS WRONG (fixed above)
   ----------------------------------------------------------
   System.out.println("No") had no semicolon at the end, which is a compile error.  Fix: add ';'.

   AI REVISION NOTES
   ----------------------------------------------------------
   Finds the first and last 'descent' positions and checks they fit inside a window of size k.  O(n).
   ========================================================== */
