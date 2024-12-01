 import java.util.Scanner;

public class Factorial {
    public static  void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number To find Factorial: ");

        int i , n , Fact = 1;

        n = sc.nextInt();

        for(i = 1 ; i <= n ; i++)
        {
            Fact = Fact * i;

        }
        System.out.println(n + "!" + " = " + Fact);
    }
}
