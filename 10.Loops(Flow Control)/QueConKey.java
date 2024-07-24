import java.util.*;

public class QueConKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number below: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println("Your number is not divisible by 10: " + num);
        } while (true);
        
        // Close the scanner
        // sc.close(); // Unreachable code because of the infinite loop
    }
}
