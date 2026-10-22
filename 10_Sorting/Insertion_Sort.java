import java.util.Arrays;

public class Insertion_Sort {
    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];   // value to insert, not index i
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > key) {
                arr[prev + 1] = arr[prev];
                prev--;         // must move backward inside the loop
            }
            arr[prev + 1] = key; // store the value, not the index
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 6, 4, 3, 32, 2, 3, 1, 4 };
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/* ==========================================================
   WHAT WAS WRONG (in your first version, now fixed)
   ----------------------------------------------------------
   1) The method body was empty, so nothing got sorted.
   2) 'import java.util.*;' (or java.util.Arrays) was missing, so Arrays.toString did not compile.
   3) Class and method share a name, which is legal but confusing; the class is now Insertion_Sort.

   AI REVISION NOTES
   ----------------------------------------------------------
   Idea: the left part is always sorted.  Take arr[i] (key), shift bigger elements one step right,
   drop key into the gap.
   Time: O(n^2) worst/average, O(n) best (already sorted).  Space O(1).  Stable and in-place.
   Great for small or nearly-sorted arrays; it is what Java's sort uses inside for tiny ranges.
   Dry run on {5,3,4}: i=1 key=3 -> {3,5,4};  i=2 key=4 -> {3,4,5}.
   ========================================================== */
