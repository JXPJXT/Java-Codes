import java.util.*;

public class SynWithParameter{
    public static void printHelloWorld(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }
    public static void CalcSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is: "+sum);

    }
    public static void main(String args[]){
        CalcSum();
    }
}