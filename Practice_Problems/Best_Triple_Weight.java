import java.util.*;
public class Best_Triple_Weight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=sc.nextInt();
        int []w=new int[n];
        for (int i=0;i<n;i++){
            w[i]=sc.nextInt();
        }
        long best=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (i+j+k+3<=v){
                        long newBest=w[i]+w[j]+w[k];
                        if (newBest>best){
                            best=newBest;
                        }
                        }
                    }
                }
            }
            System.out.println(best);
        }
        }

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Contest-style: choose 3 items under a limit.  Triple loop O(n^3).
   Correction: the braces ARE balanced and this compiles (the indentation just looks misleading).
   Possible logic issue: 'i+j+k+3<=v' compares INDEX sums with v, not weights - check the problem statement.
   For big n the O(n^3) will time out; sort + two pointers gets O(n^2).
   ========================================================== */
