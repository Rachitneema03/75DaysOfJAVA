import java.util.Scanner;

public class Currency_Convertor {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the currency name in what you want the conversion\n(Dollar , Pound");
        String Current = sc.next();

        if (Current.equalsIgnoreCase("Dollar"))
        {
            System.out.println("Enter the amount: ");
            double amount = sc.nextDouble();
            double conv = amount * 84.29;
            System.out.println(amount + " Dollar = " + conv + " INR");
        } else if (Current.equalsIgnoreCase("Pound"))
        {
            System.out.println("Enter the amount: ");
            double amount = sc.nextDouble();
            double conv = amount * 105.98;
            System.out.println(amount + " pound = " + conv + " INR");
        }
    }
}