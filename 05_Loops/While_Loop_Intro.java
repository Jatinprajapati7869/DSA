public class While_Loop_Intro{
    public static void main(String args[]){
        //for(Initilize ; condition ; updation);
        //System.out.println("Hello World!");
        //While loop , for loop , do whole loop
        int i=10;
        while(i>0){
            System.out.println("Hello world");
            i=i-1;
        }


    }
}

/* ==========================================================
   WHAT WAS WRONG (fixed above)
   ----------------------------------------------------------
   1) 'int i=i-1;' inside the loop declares i a second time. i already exists, so this is a compile error
      (also i is used in its own declaration).  Fix: just assign, 'i=i-1;'.
   2) 'while(true)' never stops, so "Hello world" would print forever.  Fix: 'while(i>0)', so it runs 10 times.
   ==========================================================

   AI REVISION NOTES
   ----------------------------------------------------------
   Loop types: while (check first), for (init; cond; update), do-while (runs at least once).
   ========================================================== */
