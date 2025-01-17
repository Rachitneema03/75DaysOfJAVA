import java.util.Scanner;

public class Armstrong_no {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // initialization

        double number , arm = 0 , i = 0 , current ;

        // input from user

        System.out.println("Enter the number: ");
        number = sc.nextDouble();

        // now we gonna use while loop for getting the no. of digits

        while (number > 0)
        {
            number /= 10;
            i++;
        }

        // now we do the reqiured calc

        current = number;
        while (number > 0)
        {
            double r = number % 10;
            arm = Math.pow(r , i) + arm;
            number = number / 10;
        }
        if (current == arm)
        {
            System.out.println("it's an armstrong number");
        }
        else {
            System.out.println("it's not an armstrong number.");
        }



    }
}