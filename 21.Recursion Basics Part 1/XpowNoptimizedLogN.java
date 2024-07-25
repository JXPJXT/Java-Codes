public class XpowNoptimizedLogN {
    public static void main(String[] args) {
        int a = 2;
        int n = 11;
        System.out.println(optimizedPow(a, n));
    }
    public static int optimizedPow(int a, int n){
       if(n==0){
        return 1;
       }
       int halfpower = optimizedPow(a, n/2);
       int halfPowerSq = halfpower*halfpower;
       // n is odd
       if(n%2!=0){
        halfPowerSq =a*halfPowerSq;
       }
       return halfPowerSq;
    }
}