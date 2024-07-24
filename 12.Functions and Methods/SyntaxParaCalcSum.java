import java.util.*;

public class SyntaxParaCalcSum{
    public static void calculatesum(int num1,int num2){
        int sum = num1+num2;
       return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b);//Arguments or Actual Parametres
        System.out.println("Sum is: "+sum);
    }
}