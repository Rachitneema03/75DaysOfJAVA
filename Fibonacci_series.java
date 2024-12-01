import java.util.Scanner;

public  class Fibonacci_series {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        double i , n , a = 0 , b = 1 , tempor ;

        System.out.print("Enter the number of terms for Fibonacci series: ");
        n = sc.nextDouble();

        if(n < 0 )
        {
            System.out.println("Enter a postive integer. ");

        } else if (n == 0)
        {
            System.out.println("Fibonacci Series is zero. ");

        }
        else {
            System.out.println("Fibonacci Series :\n0");

            for(i = 0 ; i <= n ; i++)
            {
                tempor = a + b;
                System.out.println(tempor);
                a = b;
                b = tempor;

            }
        }
    }
}