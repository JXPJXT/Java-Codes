import java.util.*;

public class ChkLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        sc.close(); 
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The given year is a leap year");
        } else {
            System.out.println("The given year is not a leap year");
        }
    }
}
