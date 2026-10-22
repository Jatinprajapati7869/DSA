//Linear Search

public class Linear_Search {
    public static int linearSearch(int marks[],int key){
         for (int i=0;i<marks.length;i++){
            if (marks[i]==key){
                return i;
    }}
    return -1;
}

    public static void main(String arrays[]){
        int marks[]={2,4,6,8,0,1,3,5,6,7,8,9,10};
        int key=20;
        String menu[]={"idli","dosa","Chole","Maggi"};
        String fav="Maggi";
        int index=linearSearch(marks, key);
        if(index==-1){
            System.out.println("Key not found");
        }else{
            System.out.print("Key found at "+ index);
        }
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Scan every element.  Time O(n), space O(1).  Works on unsorted data.  Return -1 when not found.
   ========================================================== */
