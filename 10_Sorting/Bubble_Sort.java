//Bubble sort = unsorted array , can give increasing order or decreasing order
import java.util.*;
public class Bubble_Sort{
    public static void bubbleSort(int arr[]){
            for (int i=0; i<arr.length-1;i++){
                for (int j=0;j<arr.length-1-i;j++){
                    if (arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;

                    }
                }
            }
    }
    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,3,7,8,9,2,1};
        bubbleSort(arr);
        print(arr);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Repeatedly swap adjacent out-of-order elements; the largest value 'bubbles' to the end each pass.
   Time O(n^2) (O(n) best case with an early-exit flag), space O(1), stable, in-place.
   ========================================================== */
