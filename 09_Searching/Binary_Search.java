//Binary Search
//Like dictonary is sorted
//Pre req is sorted array
//take mid , check key is small or bigger or equal , if small take only in left side or right side

public class Binary_Search {
    public static int Binary(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            //comparisons
            if (numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
                start=mid+1;
            }
            if (numbers[mid]>key){
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String arrays[]){
        int numbers[]={1,2,3,4,5,6,7,78,8,45,45,45,3,32,3,5454};
        int key=5454;
        System.out.println(Binary(numbers, key));
    }
}

//Time complexity=check iteration numbers
// n , n/2 , n/4 , n/8
//tc is log(n)

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Prerequisite: SORTED array.  Halve the search range each step -> O(log n) time, O(1) space.
   mid = start + (end - start) / 2 avoids int overflow of (start+end)/2.
   NOTE (AI): the example array in your main is not sorted, so the result is unreliable.
   Interview variants: first/last occurrence, rotated sorted array, search on answer.
   ========================================================== */
