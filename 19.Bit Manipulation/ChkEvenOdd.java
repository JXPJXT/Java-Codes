import java.util.*;

public class ChkEvenOdd{
    public static void OddOrEven(int n){
        int bitMask=1;
    if((n & bitMask)==0){
        //even
        System.out.println("Even Number");
    }
    else{
         System.out.println("Odd Number");
    }
}
public static void main(String[] args) {
    OddOrEven(3);
    OddOrEven(0);
    OddOrEven(4);
}
}