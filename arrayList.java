import java.util.*;
public class arrayList{
    //For given n Lines on x-axis ,use 2 lines to form a container such that it holds maximum water
    //Brute force code -O(n2)
    // public static int waterStore(ArrayList<Integer> list){
    //     int maxarea=0;
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             //height
    //             int hc=Math.min(list.get(i),list.get(j));
    //             int width=j-i;
    //             int currarea=hc*width;
    //             maxarea=Math.max(maxarea, currarea);
    //         }
    //     }
    //      return maxarea;
    // }

    //2-Pointer approch in above code 
    // public static int waterStore(ArrayList<Integer> list){
    //     int maxarea=0;
    //     int lp=0;
    //     int rp=list.size()-1;
    //     while(lp<rp){
    //         //Calculate water area
    //         int hc=Math.min(list.get(lp),list.get(rp));
    //         int width=rp-lp;
    //         int currarea=hc*width;
    //         maxarea=Math.max(maxarea, currarea);
    //         //Values update 
    //         if(list.get(lp)<list.get(rp)){
    //             lp++;
    //         }else{
    //             rp--;
    //         }
    //     }
    //     return maxarea;
    // }


    //find a pair in Sorted Arraylist has a target sum 
    //[1, 2, 3, 4, 5, 6]#sorted list
    //Brute force Code 
    // public static boolean pairSum1(ArrayList<Integer> list,int target){
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //above example 2-pointer approch
    // public static boolean pairSum1(ArrayList<Integer> list,int target){
    //     int lp=0;
    //     int rp=list.size()-1;
    //      while(lp<rp){
    //      //case-1
    //      if(list.get(lp)+list.get(rp)==target){
    //         return true;
    //      }
    //      //case-2
    //      else if(list.get(lp)+list.get(rp)>target){
    //         rp--;
    //      }
    //      //case-3
    //      else{
    //         lp++;
    //      }
         
    //      }
    //      return false;
    // }


    //Find if the array pair is sorted  & rotated ArrayList Has a target sum
    //By the same 2-point approch 
    //In this question we use modulo function property(formula)
    // public static boolean sumPair( ArrayList<Integer> list,int target){
    //     int bp=-1;
    //     int n=list.size();
    //     for(int i=0;i<list.size();i++){
    //         if(list.get(i)>list.get(i+1)){
    //             bp=i;
    //         }
    //     }
    //     int lp=bp+1; //Smallest
    //     int rp=bp; //largest
    //      while(lp != rp){
    //         //Target 
    //         if(list.get(lp)+list.get(rp)==target){
    //             return true;
    //         }
    //         if(list.get(lp)+list.get(rp)<target){
    //             lp=(lp+1)%n;
    //         }
    //         else{
    //             rp=(n+rp-1)%n;
    //         }
    //      }
    //      return false;
    // }
    public static void main(String[] args) {
        //Java collection Framework
        //ClassName objectName=new ClassName();
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Boolean> list2=new ArrayList<>();
        //To add the number in the arrayList
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        System.out.println(list);
        //get Operation O(1)
        // int element=list.get(2);
        // System.out.println(element);

        //Remove Operation O(n)
        // list.remove(2);
        // System.out.println(list);

        //Set Element at Index O(n)
        // list.set(2, 11);
        // System.out.println(list);

        //Contain Element 
        // System.out.println(list.contains(2));;
        // System.out.println(list.contains(21));;

        //size of the arrayList
        // System.out.println(list.size());
        
        //printing the arrayList using the loop
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        //Reverse the arrayList 
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }
        //System.out.println();
        //Max in the arrayList 
        
        

        



    }
}