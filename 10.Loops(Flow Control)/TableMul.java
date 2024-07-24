import java.util.*;

class TableMul{
    public static void printMulTabl(int number){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}public static void main(String s[]){
    printMulTabl(5);
}