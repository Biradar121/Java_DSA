import java.util.*;
public class recursion{
    // //Sum of the number
    // public static int printSum(int n){
    //     //base case
    //     if(n==0){
    //         return 0;
    //     }
    //     //kaam
    //     return n+printSum(n-1);
    // }
    
    //factorial
    // public static int factorial(int n){
    //     //Base Case
    //     if(n==0){
    //         return 1;
    //     }
    //     //kaam 
    //     return n*factorial(n-1);
    // }

    //printing the numbers in the decresing order
    // public static void printDec(int n){
    //     if(n==1){
    //         System.out.println(1+" ");
    //         return;
    //     }
    //   System.out.println(n+" ");
    //   printDec(n-1);
    // }

    //printing the numbers in the incerasing order
    // public static void printInc(int n){
    //     //Base Case
    //     if(n==1){
    //         System.out.print(1+" ");
    //         return;
    //     }
    //     //kaam
    //      printInc(n-1);
    //      System.out.print(n+" ");
    // }

    //WAF to find the first occurance of an element in the array
    //  public static int firstOcc(int array[],int i,int key){
    //     //Base Case
    //     if(i==array.length-1){
    //         return -1;
    //     }
    //     if(array[i]==key){
    //         return i;
    //     }
    //    return firstOcc(array, i+1,key);
    //  }time complexity=O(n)

    //Calculate the nth term in fibonacci
    // public static int fib(int n){
    //     if(n==0||n==1){
    //         return n;
    //     }
    //     int fnm1=fib(n-1);
    //     int fnm2=fib(n-2);
    //     int fn=fnm1+fnm2;
    //     return fn;
    // }

    //Calculate the power using recursion
    // public static int power(int a ,int n){
    //     //Base Case 
    //     if(n==0){
    //         return 1;
    //     }
    //     //kaam
    //     return a*power(a, n-1);
    // }

    //Change in the array and decrease the array while return by 2
    // public static void changeArray(int array[],int i,int val){
    //     if(i== array.length){
    //         printArr(array);
    //         return;
    //     }
    //     array[i]=val;
    //     changeArray(array, i+1, val+1);
    //     array[i]=array[i]-2;
    // }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello World");
        
        
    }
}