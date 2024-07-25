public class PrintSumOfFirstN {
    public static void main(String[] args) {
        int a = 10;
        int b = calcSum(a);
        System.out.println(b); 
    }
    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int Sum1 = calcSum(n-1);
        int Sumn = n+Sum1;
        return Sumn;

    } 
}
