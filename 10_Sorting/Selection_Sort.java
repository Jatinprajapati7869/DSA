Selection sort java
pick smallest fromm unsorted and put it in beginnering
import java.util.*;
public class Selection_Sort{
    public static void selection_sort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int minPos=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[minPos]>arr[j]){
                    minPos=j;

                }
            }
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
        }

    }
    public static void main(String args[]){
        int arr[]={5,6,4,3,32,2,3,1,4};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Pick the smallest element of the unsorted part and swap it to the front.
   Time O(n^2) always, space O(1), NOT stable, at most n-1 swaps.
   ========================================================== */
