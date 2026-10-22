//Pairs in an array

public class Pairs_In_Array {
    public static void pair(int numbers[]){
        int tp=0;
        for (int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for (int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total pairs are "+tp);
    }
    public static void main(String arrays[]){
        int numbers[]={1,2,3,4,5};
        pair(numbers);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   All pairs (i, j) with j > i -> n*(n-1)/2 pairs, O(n^2).  Nested loops with j starting at i+1.
   ========================================================== */
