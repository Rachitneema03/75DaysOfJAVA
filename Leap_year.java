import java.util.Scanner;

public class Leap_year {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int year;
        System.out.print("Enter the year you want to check: ");
        year = sc.nextInt();

        if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}