import java.util.*;

public class InBuilt_Sort{
    public static void PrintArr(Integer arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int compare(int a, int b){
        // a<b -ve
        // a==b 0
        // a>b +ve
        return b-a  
    }
    public static void main(String args[]){
        Integer arr[]={5,4,3,2,1};
        //Inbuilt Sort
        Arrays.sort(arr,0,3);
        PrintArr(arr);
        Arrays.sort(arr,0,3, Collections.reverseOrder());
        PrintArr(arr);

    }
}