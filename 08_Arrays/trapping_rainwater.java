import java.util.*;
public class trapping_rainwater{
    public static int trap(int height[]){
        //calculate left max array
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for (int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculate right ,max array
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height [height.length-1];
        for (int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trapped_water=0;
        //loop , hcekc water level = min(leftmax , rightmax)-height[i]
        for (int i=0;i<height.length;i++){
            int water_level=Math.min(leftMax[i],rightMax[i]);
            trapped_water+=water_level-height[i];
        }
        return trapped_water;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println("Trapped water is: "+trap(height));
    }
}
//Aurxilary array approach
//rainwater only trap when tehre is a boundary
//so we need to find the boundary of the array
//we take boundary height with width of 1 unit
//forula is (w-x)*h
//w is width of 1 unit
//x is height of the boundary
//h is height of the water
//we need to find the maximum height of the boundary
//we need to find the maximum height of the water
//we need to find the maximum height of the boundary
//take left and right  , tyake min of right or left and mius the block value

