import java.util.Scanner;

public class Months_In_No {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name of the month: ");
        int N = sc.nextInt();

        switch (N) {

            case 1 :
                System.out.println("the month is January");
                break;
            case 2 :
                System.out.println("the month is Febuary");
                break;
            case 3 :
                System.out.println("the month is March");
                break;
            case 4 :
                System.out.println("the month is April");
                break;
            case 5 :
                System.out.println("the month is may");
                break;
            case 6 :
                System.out.println("the month is June");
                break;
            case 7 :
                System.out.println("the month is July");
                break;
            case 8 :
                System.out.println("the month is August");
                break;
            case 9 :
                System.out.println("the month is September");
                break;
            case 10 :
                System.out.println("the month is October");
                break;
            case 11 :
                System.out.println("the month is November");
                break;
            case 12 :
                System.out.println("the month is December");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}