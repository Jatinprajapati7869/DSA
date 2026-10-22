public class Swap_Pass_By_Value {

    static void swap(int x, int y) {

        int temp = x;

        x = y;

        y = temp;
    }

    public static void main(String[] args) {

        int a = 10;

        int b = 30;

        System.out.println("Before swap: a=" + a + ", b=" + b);

        swap(a, b);

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Java is ALWAYS pass-by-value.  Primitives are copied, so swapping inside swap(a,b) does NOT change the caller's a and b.
   Objects/arrays: the reference is copied, so you CAN mutate the contents (see Array_Update_Pass_By_Reference).
   Very common interview question.
   ========================================================== */
