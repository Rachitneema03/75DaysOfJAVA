import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("1. To perform Addition \n2. To perform Subtraction \n3. To perform Multiplication \n4. To perform Division");
        int check = sc.nextInt();

        switch (check) {

            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;

        }
    }
}
