import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum, a, b, c, n;
        System.out.println("Enter a Four digit number: ");
        n = sc.nextInt();

        a = n / 1000;
        n = n - (a * 1000);

        b = n / 100;
        n = n - (b * 100);

        c = n / 10;
        n = n - (c * 10);

        sum = a + b + c + n;
        System.out.println("The sum of all the digits is " + sum);
    }
}



