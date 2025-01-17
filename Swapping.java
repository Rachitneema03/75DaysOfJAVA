import java.util.Scanner;

public class Swapping {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int a ,b;
        System.out.print("Enter two numbers for Swapping: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("a = " + a + " " + "b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + " " + "b = " + b);
        System.out.println("Swapping is DONE.....");

    }
}