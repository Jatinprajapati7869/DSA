//Prefix summ approach
//create a prefix array , that store a sum with all subsets

public class Max_Subarray_Prefix_Sum {
    public static void subArray(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        for (int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for (int i=0;i<numbers.length;i++){
            int start=i;
            for (int j=i;j<numbers.length;j++){
                int end=j;
                currSum=start==0? prefix[end] : prefix[end]-prefix[start-1];
            if (maxSum<currSum){
                maxSum=currSum;
            }
            }

        }
        System.out.println("Max Sum of Subarray is "+ maxSum);
    }
    public static void main(String arrays[]){
        int numbers[]={1,2,3,4,5};
        subArray(numbers);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   prefix[i] = sum of a[0..i].  Sum(start..end) = prefix[end] - prefix[start-1].  Build O(n), then O(n^2) total.
   Prefix sums are the base of range-sum queries and subarray-sum problems (very common in FAANG interviews).
   ========================================================== */
