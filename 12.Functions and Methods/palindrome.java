import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Please Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int palindromechknum = sc.nextInt();
        sc.close(); // Close the scanner after use

        if (isPalindrome(palindromechknum)) {
            System.out.println("Number: " + palindromechknum + " is a palindrome");
        } else {
            System.out.println("Number: " + palindromechknum + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int palindromechknum = number;
        int reverse = 0;

        while (palindromechknum != 0) {
            int remainder = palindromechknum % 10;
            reverse = reverse * 10 + remainder;
            palindromechknum = palindromechknum / 10;
        }

        return number == reverse;
    }
}
