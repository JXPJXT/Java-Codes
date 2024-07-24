import java.util.*;
public class FindProAandB{
    public static int calc(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int 1result = calc(a,b);
        System.out.println("The product is: "+ result);

    }
}