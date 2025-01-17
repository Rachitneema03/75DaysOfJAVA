import java.util.Scanner;

public class DaysConvertor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // intializing the years and month

        int Daysinyear = 365;
        int Daysinmonth = 30;

        // Now we will take input

        System.out.print("enter number of Days: ");
        int days = sc.nextInt();

        // calculation

        int year = days / Daysinyear;
        int daysremaininyears = days % Daysinyear;
        int month = daysremaininyears / Daysinmonth;
        int daysremaininmonth = daysremaininyears % Daysinmonth;

        // output

        System.out.println("The Days in year is approx: ");
        System.out.println(year + " Year " + month + " months " + daysremaininmonth + "days ");
    }
}