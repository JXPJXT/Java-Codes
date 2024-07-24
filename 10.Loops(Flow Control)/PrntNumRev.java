import java.util.*;

public class PrntNumRev{
    public static void main(String args[]){
        int n = 31072005;
        while(n>0){
            int LastDigit = n%10;
            System.out.println(LastDigit);
            n = n/10;
        }
       
}
}