import java.util.*;
public class inbuilt_sort{
    public static void main(String[] args){
        Integer arr[]={5,4,1,2,3};
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}   