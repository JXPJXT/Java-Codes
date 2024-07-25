public class PrintFactorial {
    public static void main(String args[]) {
        int num = 5;
        System.out.println(factorial(num));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = factorial(n - 1);  // Corrected from fact(n-1) to factorial(n-1)
        int factn = n * fnm1;         // Using the result stored in fnm1
        return factn;
    }
}
