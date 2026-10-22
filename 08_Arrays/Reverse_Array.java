//Reverse an array , with O(n) time complexity , we achive it by swapping

public class Reverse_Array {
    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String arrays[]){
        int numbers[]={1,2,3,4,5,6,7,78,8,45,45,45,3,32,3,5454};
        reverse(numbers);
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Two pointers (first, last) swap and move inward.  O(n) time, O(1) space.  Two-pointer is a core pattern.
   ========================================================== */
