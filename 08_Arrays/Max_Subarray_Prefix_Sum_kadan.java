//kadan algorithm

public class Max_Subarray_Prefix_Sum_kadan{
    public static void kadan(int numbers[]){
            int ms =Integer.MIN_VALUE;
            int cs=0;

            for (int i=0;i<numbers.length;i++){
                // Either extend the subarray ending here, or start a new subarray at i
                cs = Math.max(numbers[i], cs + numbers[i]);
                ms = Math.max(ms, cs);
            }
            System.out.println("Maximum sum of subarray is: "+ms);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        kadan(arr);

        // edge cases to try after you understand the fix:
        // kadan(new int[]{-2, -1, -3});     // answer must be -1 (not 0)
        // kadan(new int[]{-5});             // answer -5
        // kadan(new int[]{5, -1, 5});       // answer 9
    }
}

/* ==========================================================
   WHAT WAS WRONG (your old version)
   ----------------------------------------------------------
   Old logic:
       cs = cs + numbers[i];
       if (cs < 0) cs = 0;

   That says: "if the running sum is negative, pretend we picked nothing (sum = 0)."
   That is only correct when an EMPTY subarray is allowed (sum = 0).

   LeetCode 53 / most interviews: subarray must have at least ONE element.
   For all negatives, e.g. {-2, -1, -3}, old code gives ms = 0.
   Correct answer = best single element = -1.

   FIX (one line idea):
   At each index i, either:
     - add arr[i] to the previous subarray  ->  cs + numbers[i]
     - OR start fresh at i only             ->  numbers[i]
   cs = Math.max(numbers[i], cs + numbers[i]);

   AI REVISION NOTES
   ----------------------------------------------------------
   Kadane's algorithm: O(n) time, O(1) space.
   Dry run {1,-2,6,-1,3}:
     i=0: cs=1,  ms=1
     i=1: cs=max(-2,1-2)=-1, ms=1
     i=2: cs=max(6,-1+6)=6, ms=6
     i=3: cs=5, ms=6
     i=4: cs=8, ms=8

   Dry run all negative {-2,-1,-3}:
     cs=-2 -> -1 -> -3,  ms ends at -1  (never becomes 0)

   Empty array: numbers.length==0 -> add a guard if needed.
   ========================================================== */
 