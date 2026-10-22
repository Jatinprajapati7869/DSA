public class Array_Update_Pass_By_Reference {
    public static void update(int marks[],int n){
        n=10;
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]-10;
        }
        System.out.println(n);
    }
    public static void main(String arrays[]){
        int marks[]={98,97,99};
        int n=5;
        update(marks,n);
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]+ " ");
        }
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Arrays are objects: the method gets a copy of the REFERENCE, so changes to marks[i] persist outside,
   but reassigning n (a primitive) does not.   Compare with Swap_Function_Pass_By_Value.
   ========================================================== */
