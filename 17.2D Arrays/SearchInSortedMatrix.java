import java.util.*;

public class SearchInSortedMatrix{
    public static boolean StaircaseSearch(int matrix[][],key){
        int  row = matrix.length-1;
        int col = 0;
        
        while(row>=0 && col<matrix.length){
            if(matrix[row][col]==key){
                System.out.println("Element Found at Index: ("+i+","+j+")");
                return  true;
            }
            else if(key<matrix[row][col]){
               col++;
            }
            else{
                row--;
            }
        }
        System.out.println("Element not Found at Index");
        return  false;
    }
    
    public static void main(String  args[]){
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}};
        
        int key = 30;
        
    }
}