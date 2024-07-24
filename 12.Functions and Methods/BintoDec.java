import java.util.*;

public class BintoDec{
    public static void BinaryToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum%10;
            decnum = decNum + (lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
            System.out.println("Decimal of "+myNum +L"= "+decNum);
        }
        
        } 
        public static void main(String args[]){
            BinaryToDec(1011);

    }
}