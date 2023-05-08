import java.util.*;
public class trappedRainwater{
    //trapped rain water in given columns with 
    public static int  trappedWater(int height[]){
        //calculate the  max left Boundary of->array
         int n=height.length;
         int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        //calculate the  max right Boundary of-> array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        //loop
        int trappedWater=0;
        for(int i=0;i<n;i++){
            //calculate the waterlevel
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            //calculate the total trapped rain water.
             trappedWater=trappedWater+(waterlevel-height[i]);
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height[]={4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedWater(height));
    }
}

