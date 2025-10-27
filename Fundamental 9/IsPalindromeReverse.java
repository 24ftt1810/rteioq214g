import java.util.Scanner;

public class IsPalindromeReverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 100 + (int)(Math.random() * 900);

        System.out.print("Enter the reverse of " + number + ": ");
        int userInput = input.nextInt();

        while (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userInput = input.nextInt();
        }

        int reversedNumber = reverse(number);
        boolean result = isPalindrome(userInput, reversedNumber);

        System.out.println("\nThe digit " + userInput + " is palindrome of " + number + " is " + result + ".");
    }


    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }


    public static boolean isPalindrome(int userInput, int reversedNumber) {
        return userInput == reversedNumber;
    }
}
