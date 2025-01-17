import java.util.Scanner;

public class ASCII_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter to get the ASCII Value: ");
        char n = sc.next().charAt(0);

        int ASCII = (int)n;
        System.out.println("The ASCII Value of" + n + " is " + ASCII);
    }
}