import java.util.*;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
public class sudoko{
    public static boolean isSafe(int sudoko[][],int row ,int col,int digit){
        //column Condition
        for(int i=0;i<=8;i++){
            if(sudoko[i][col]==digit){
                return false;
            }
        }
        //Row Condition
        for(int i=0;i<=8;i++){
            if(sudoko[row][i]==digit){
                return false;
            }
        }
        //grid condition
        //this codition is for the 3X3 grid 
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoko[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
   public static boolean sudokoSolver(int sudoko[][],int row ,int col){
    //Base Case
    if(row == 9){
        return true;
    }
    //Recursion
    int NextRow=row; int nextcol=col+1;
      if(col+1 == 9){
        NextRow=row+1; 
        nextcol=0;
      }
      if(sudoko[row][col] !=0){
        return sudokoSolver(sudoko, NextRow, nextcol);
      }
      for(int digit=1;digit<=9;digit++){
        if(isSafe(sudoko,row,col,digit)){
            sudoko[row][col]=digit;
            if(sudokoSolver(sudoko,NextRow,nextcol)){
                return true;
            }
            sudoko[row][col]=0;
        }
      }
      return false;
   }
   public static void printSudoko(int sudoko[][]){
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
           System.out.print(sudoko[i][j]+" ");
        }
        System.out.println();
    }

   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Sudoko problem
        int sudoko[][]={ 
         {0, 0, 8, 0, 0, 0, 0, 0, 0},
         {4, 9, 0, 1, 5, 7, 0, 0, 2},
         {0, 0, 3, 0, 0, 4, 1, 9, 0},
         {1, 8, 5, 0, 6, 0, 0, 2, 0},
         {0, 0, 0, 0, 2, 0, 0, 6, 0},
         {9, 6, 0, 4, 0, 5, 3, 0, 0},
         {0, 3, 0, 0, 7, 2, 0, 0, 4},
         {0, 4, 9, 0, 3, 0, 0, 5, 7},
         {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        if(sudokoSolver(sudoko, 0, 0)){
            System.out.println("Solution Exists");
            printSudoko(sudoko);
        }else{
            System.out.println("Solution does not exists");
        }
    }
}