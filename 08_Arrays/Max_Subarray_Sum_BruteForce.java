public class Max_Subarray_Sum_BruteForce {
    public static void subArray(int numbers[]){
        int currSum=0;
        int minSum=Integer.MAX_VALUE;
        int maxSum=Integer.MIN_VALUE;
        int ts=0;
        for (int i=0;i<numbers.length;i++){
            int start=i;
            for (int j=i;j<numbers.length;j++){
                int sum=0;
                int end=j;
                for (int k=start;k<=end;k++){
                    currSum+=numbers[k];
                    sum += numbers[k];
                    //System.out.print(+ numbers[k]+" "  );
                }
                ts++;
                if (sum<minSum){
                    minSum=sum;
                }
                if (sum>maxSum){
                    maxSum=sum;
                }
                //System.out.println("Sum of this array ="+ sum);
            }
        }
        //System.out.println("Total subarrays = "+ ts);
        System.out.println("Max Sum of Subarray is "+ maxSum);
        //System.out.println("Min Sum of Subarray is "+ minSum);
    }
    public static void main(String arrays[]){
        int numbers[]={1,2,3,4,5};
        subArray(numbers);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Brute force O(n^3).  Improve to O(n^2) with a running sum, or prefix sums, then to O(n) with Kadane's algorithm.
   ========================================================== */
