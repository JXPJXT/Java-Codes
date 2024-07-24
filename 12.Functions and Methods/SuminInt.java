import java.util.*;

public class SuminInt{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is "+sumDigits(digits));
        sc.close();
    }
    public static int sumDigits(int n){
        int SumOfDigits = 0;
        while(n>0){
            int lastDigit = n%10;
            SumOfDigits += lastDigit;
            n /= 10;
        }
        return SumOfDigits;
    }
}