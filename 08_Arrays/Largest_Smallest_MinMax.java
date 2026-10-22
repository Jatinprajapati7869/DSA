public class Largest_Smallest_MinMax {
    public static int largest(int numbers[]){
        int largest=Integer.MIN_VALUE; //-Infinity
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++){
            if (largest<numbers[i]){
                largest=numbers[i];
            }
            if (smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest is " + smallest);
        return (int)largest;
    }
    public static void main(String arrays[]){
        int numbers[]={1,2,3,4,677,878,7,87};
        System.out.println(largest(numbers));
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Track largest = Integer.MIN_VALUE and smallest = Integer.MAX_VALUE in one pass.  O(n) time, O(1) space.
   ========================================================== */
