public class Linear_Search_Strings_Menu {
    public static int myFav(String menu[],String fav){
        for (int i=0;i<menu.length;i++){
            if (menu[i].equals(fav)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String arrays[]){
        String menu[]={"idli","dosa","Chole","Maggi"};
        String fav="idli";
        int myfav1=myFav(menu, fav);
        if (myfav1==-1){
            System.out.print("You fav is not in menu");
        }else{
            System.out.print("Congrats your dish will be ready to serve in 5 minutes. Index is "+ myfav1 );
        }
        }
    }

/* ==========================================================
   WHAT WAS WRONG (fixed above)
   ----------------------------------------------------------
   Was: if (menu[i]==fav)   -> == compares references (memory addresses), not text.
   It only worked because identical string literals share one object in the String pool.
   A string from Scanner or new String("idli") would NOT match.  Fix: menu[i].equals(fav).
   Classic interview trap.

   AI REVISION NOTES
   ----------------------------------------------------------
   Linear search over Strings: O(n) comparisons, each comparison O(length of string).
   ========================================================== */
