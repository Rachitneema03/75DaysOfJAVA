import java.util.Random;
import java.util.Scanner;

public class Dice_Roller {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to random Dice roller:)");
        System.out.println("1. to roller the dice");
        System.out.println("2. to exit");

        while (true)
        {
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1)
            {
                int dicerolled = random.nextInt(1 , 7);
                System.out.println("you rolled " + dicerolled);
            } else if (choice == 2)
            {
                System.out.println("thankyou for playing");
                break;
            }
            else
            {
                System.out.println("invaild input !! try again");
            }
        }


    }

}