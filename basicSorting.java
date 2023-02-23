import java.util.*;
public class basicSorting{
    public static void bubbleSort(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                 if(array[j]>array[j+1]){
                     //Swaping in the array
                     int temp=array[j];
                     array[j]=array[j+1];
                     array[j+1]=temp;
                 }
            }
        }
    }
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]={5,4,1,3,2};
        bubbleSort(array);
        printArray(array);


    }
}
