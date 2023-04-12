import java.util.*;
public class twoDArray{//Time complexity:O(m*n),Space Complexity:O(1)
    //Search a key in the iterative fashion 
    // public static boolean search(int array[][],int key){
    //     for(int row=0;row<array.length;row++){
    //         for(int col=0;col<array.length;col++){
    //             if(array[row][col]==key){
    //                 System.out.println("The index of the row and col is:"+"("+row+","+col+")");
    //                 return true;
    
    //             }
    //         }
    //     }
    //     return false;
    // }
    
    //print the matrix in the spiral form
    // public static void printSpiral(int matrix[][]){
    //     int startRow=0;
    //     int startCol=0;
    //     int endRow=matrix.length-1;
    //     int endCol=matrix[0].length-1;
    //     while(startRow<=endRow && startCol<=endCol){
    //         //top
    //         for(int j=startCol;j<=endCol;j++){
    //             System.out.print(matrix[startRow][j]+" ");
    //         }
    //         //right 
    //         for(int i=startRow+1;i<=endRow;i++){
    //             System.out.print(matrix[i][endCol]+" ");
    //         }
    //         //bottom
    //         for(int j=endCol-1;j>=startCol;j--){
    //             if(startRow ==endRow){
    //                 break;
    //             }
    //             System.out.print(matrix[endRow][j]+" ");
    //         }
    //         //left
    //         for(int i=endRow-1;i>=startRow+1;i--){
    //             if(startCol == endCol){
    //                 break;
    //             }
    //             System.out.print(matrix[i][startCol]+" ");
    //         }
    //         startCol++;
    //         startRow++;
    //         endCol--;
    //         endRow--;
    //     }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        printSpiral(matrix);

        
    }
    
}