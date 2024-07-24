import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        // Convert Strings to lowercase. Why? So that we don't have to check separately for upper and lower cases.

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the lengths are the same
        if (str1.length() == str2.length()) {
            // Convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // Sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // If the sorted char arrays are same or identical then the strings are anagram
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            // Case when lengths are not equal
            System.out.println(str1 + " and "+str2 + " are not anagrams of each other");
        }
    }
}
