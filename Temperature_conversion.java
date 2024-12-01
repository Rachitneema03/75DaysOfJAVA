
import java.util.Scanner;

public class Temperature_conversion {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("In What unit Your Temperature is ? (Celsius or Fahrenhiet: ");
        String Choice = sc.next();
        System.out.println("in " + Choice + " Please");

        if (Choice.equalsIgnoreCase("Celsius"))
        {
            System.out.println("Enter The Temperature: ");
            double temp_in_C = sc.nextDouble();
            double Fahrenhiet = (1.8 + temp_in_C) + 32 ;
            System.out.println("The temperature in Fahrenhiet is " + Fahrenhiet + "F");
        } else if (Choice.equalsIgnoreCase("Fahrenhiet"))
        {
            System.out.println("Enter the temperature: ");
            double temp_in_F = sc.nextDouble();
            double celsius = (temp_in_F - 32) / 1.8;
            System.out.println("The temperature in Celsius is " + celsius + "°C");
        }

        else {
            System.out.println("Invalid Unit.. Please Try Again ");
        }
    }
}