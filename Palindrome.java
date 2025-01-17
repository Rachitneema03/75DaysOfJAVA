import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String Reversed = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(Reversed))
        {
            System.out.println("The given input is Palindrome.");

        }
        else
        {
            System.out.println("The given input is not a Palindrome.");
        }
    }
}