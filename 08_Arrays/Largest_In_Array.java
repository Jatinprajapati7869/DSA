//LARGEST IN ARRAY

public class Largest_In_Array {
    public static void main(String arrays[]){
       int arr[]={1,2,3,5,6,7,86,86,56,456,97,190};
       int largest=0;
       for (int i=0;i<arr.length;i++){
        if (arr[i]>largest){
            largest=arr[i];
        }

       }
       System.out.print(largest);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Start with Integer.MIN_VALUE, not 0, so it also works for all-negative arrays.
   (Here you start with 0 - fine for non-negative data only.)  O(n) time.
   ========================================================== */
