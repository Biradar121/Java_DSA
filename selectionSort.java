import java.util.*;
public class selectionSort{

  //selection sort
  public static void selectionSort(int array[]){
      for(int i=0;i<array.length;i++){
        int minPoi=i;
        for(int j=i+1;j<array.length;j++){
          if(array[minPoi]>array[j]){
            minPoi=j;
          }
        }
        //swap
        int temp=array[minPoi];
        array[minPoi]=array[i];
        array[i]=temp;
      }
  }
  
  public static void print(int array[]){
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
  }
  public static void main(String[] args) {
    int array[]={4,5,3,1,2};
    selectionSort(array);
    print(array);
    

  }
}