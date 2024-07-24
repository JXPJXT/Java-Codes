import java.util.*;

public class BinomialCoefficient {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int CoeffCalc(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_diff = factorial(n - r);
        return n_fact / (r_fact * n_r_diff); // Calculate and return the binomial coefficient
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = CoeffCalc(n, r); // Call the CoeffCalc method
        System.out.println("The binomial coefficient is: " + result);
    }
}
