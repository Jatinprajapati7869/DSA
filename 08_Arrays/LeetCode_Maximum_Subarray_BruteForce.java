class Solution {
    public int maxSubArray(int[] numbers) {
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
        //System.out.println("Max Sum of Subarray is "+ maxSum);
        //System.out.println("Min Sum of Subarray is "+ minSum);
        return maxSum;
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   LeetCode 53 - Maximum Subarray.  Your brute force is O(n^3) and will time out on large tests.
   Best solution: Kadane's algorithm O(n):  cur = max(a[i], cur + a[i]);  best = max(best, cur).
   ========================================================== */
