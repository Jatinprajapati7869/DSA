//Continuous part of subarrays
//print all subarrays , a continiours part of array

public class Print_All_Subarrays {
    public static void subArray(int numbers[]){
        int minSum=Integer.MAX_VALUE;
        int maxSum=Integer.MIN_VALUE;
        int ts=0;
        for (int i=0;i<numbers.length;i++){
            int start=i;
            for (int j=i;j<numbers.length;j++){
                int sum=0;
                int end=j;
                for (int k=start;k<=end;k++){
                    sum += numbers[k];
                    System.out.print(+ numbers[k]+" "  );
                }
                ts++;
                if (sum<minSum){
                    minSum=sum;
                }
                if (sum>maxSum){
                    maxSum=sum;
                }
                System.out.println("Sum of this array ="+ sum);
            }
        }
        System.out.println("Total subarrays = "+ ts);
        System.out.println("Max Sum of Subarray is "+ maxSum);
        System.out.println("Min Sum of Subarray is "+ minSum);
    }
    public static void main(String arrays[]){
        int numbers[]={1,2,3,4,5};
        subArray(numbers);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Subarray = contiguous part.  Total = n*(n+1)/2.  Three loops (start, end, print/sum) -> O(n^3).
   Also tracks min and max subarray sum.
   ========================================================== */
