import java.util.*;

public class IsEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer: ");
        num = sc.nextInt();
        if(IsEvenChk(num)){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is not Even");
        }
        sc.close();
    }
    public static boolean IsEvenChk(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
        }

}