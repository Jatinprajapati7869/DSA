import java.util.*;
public class Area_Of_Circle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float num1=sc.nextFloat();
        float area=3.14f*num1*num1;
        System.out.println(area);
    }
}

/* ==========================================================
   AI REVISION NOTES (added by AI - everything above is YOUR code)
   ----------------------------------------------------------
   Area = pi * r * r.  Math.PI is more precise than 3.14f.
   ========================================================== */
